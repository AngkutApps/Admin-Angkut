package com.example.adminangkut.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.adminangkut.R;
import com.example.adminangkut.data.ApiRequest;
import com.example.adminangkut.data.RetrofitRequest;
import com.example.adminangkut.data.model.Driver;
import com.example.adminangkut.data.model.Value;
import com.example.adminangkut.databinding.ActivityUpdateDriverBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateDriverActivity extends AppCompatActivity {
    ActivityUpdateDriverBinding binding;
    Driver driver;
    ApiRequest apiRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_update_driver);
        apiRequest = RetrofitRequest.getInstance().create(ApiRequest.class);
        driver = getIntent().getParcelableExtra("driver");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Update Driver");

        binding.setDriver(driver);

        if (driver.getJenisKelamin().toLowerCase().equals("laki-laki")){
            binding.rbL.setChecked(true);
        }else if (driver.getJenisKelamin().toLowerCase().equals("perempuan")){
            binding.rbP.setChecked(true);
        }

        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateData();
            }
        });

    }

    private void updateData() {
        String jenisKelamin;
        if (binding.rbL.isChecked()){
            jenisKelamin = "Laki-Laki";
        }else {
            jenisKelamin = "Perempuan";
        }

        Call<Value> updateDataCall = apiRequest.updateDataDriver(
                driver.getIdDriver(),
                binding.etNamaDriver.getText().toString(),
                binding.etNoHpUtama.getText().toString(),
                binding.etNoHpCadangan.getText().toString(),
                jenisKelamin,
                binding.etMerkKendaraan.getText().toString(),
                binding.etWarnaKendaraan.getText().toString(),
                binding.etPlat.getText().toString(),
                binding.etLokasiTerkini.getText().toString(),
                binding.etDaerahTujuan.getText().toString(),
                binding.etKursiKosong.getText().toString()
        );

        updateDataCall.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                if (response.isSuccessful()){
                    if (response.body().getValue() == 1){
                        Toast.makeText(UpdateDriverActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {

            }
        });
    }
}