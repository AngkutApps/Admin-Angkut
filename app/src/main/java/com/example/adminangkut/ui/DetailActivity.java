package com.example.adminangkut.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.adminangkut.R;
import com.example.adminangkut.data.ApiRequest;
import com.example.adminangkut.data.RetrofitRequest;
import com.example.adminangkut.data.model.Driver;
import com.example.adminangkut.data.model.Pesanan;
import com.example.adminangkut.data.model.Value;
import com.example.adminangkut.databinding.ActivityDetailBinding;
import com.example.adminangkut.util.Util;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    Pesanan pesanan;
    String idDriver = "";
    ApiRequest apiRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        apiRequest = RetrofitRequest.getInstance().create(ApiRequest.class);
        getSupportActionBar().setTitle("Detail Pesanan");

        if(Util.pesananUtil == null){
            pesanan = getIntent().getParcelableExtra("pesanan");
        }else {
            pesanan = Util.pesananUtil;
        }

        binding.btnCariDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Util.pesananUtil = pesanan;
                Intent intent = new Intent(DetailActivity.this, CariDriverActivity.class);
                intent.putExtra("pesanan", pesanan);
                startActivityForResult(intent, 123);
            }
        });

        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!idDriver.equals("")){
                    updateData();
                }
            }
        });


        loadDriver();

    }

    private void loadDriver() {

        Call<List<Driver>> listCall = apiRequest.getListDriver();
        listCall.enqueue(new Callback<List<Driver>>() {
            @Override
            public void onResponse(Call<List<Driver>> call, Response<List<Driver>> response) {
                if (response.isSuccessful()){
                    for (Driver driver : response.body()){
                        if (driver.getIdDriver().equals(pesanan.getIdDriverTravel())){
                            binding.rlDriverSelect.setVisibility(View.VISIBLE);

                            binding.tvDriver.setText(driver.getNamaDriver());
                            binding.btnUpdate.setVisibility(View.GONE);

                        }
                    }

                }
            }

            @Override
            public void onFailure(Call<List<Driver>> call, Throwable t) {
            }
        });
    }

    private void updateData() {
        Toast.makeText(this, ""+binding.etBiaya.getText().toString(), Toast.LENGTH_SHORT).show();
        Call<Value> valueCall = apiRequest.updateStatusPesanan(
                pesanan.getNoHpUser(),
                idDriver,
                pesanan.getTokenFirebase(),
                binding.etBiaya.getText().toString(),
                pesanan.getLokPenjemputan(),
                pesanan.getKoordinatPenjemputan(),
                pesanan.getLokTujuan(),
                pesanan.getKoordinatTujuan(),
                pesanan.getPenumpangDewasa(),
                pesanan.getPenumpangAnak(),
                pesanan.getBarangBawaan(),
                pesanan.getKeberangkatan()
        );
        valueCall.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                if (response.isSuccessful()){
                    if (response.body().getValue() == 1){
                        finish();
                        Util.pesananUtil = null;
                        Toast.makeText(DetailActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123){
            if (resultCode == RESULT_OK){
                binding.rlDriverSelect.setVisibility(View.VISIBLE);
                binding.btnUpdate.setVisibility(View.VISIBLE);

                idDriver = data.getStringExtra("id_driver");
                String namaDriver = data.getStringExtra("nama_driver");

                binding.tvDriver.setText(namaDriver);

            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        binding.setPesanan(pesanan);

    }


}