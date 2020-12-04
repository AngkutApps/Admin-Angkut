package com.example.adminangkut.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.example.adminangkut.R;
import com.example.adminangkut.data.ApiRequest;
import com.example.adminangkut.data.RetrofitRequest;
import com.example.adminangkut.data.model.Driver;
import com.example.adminangkut.data.model.Pesanan;
import com.example.adminangkut.databinding.ActivityCariDriverBinding;
import com.example.adminangkut.databinding.FragmentPesananSekarangBinding;
import com.example.adminangkut.ui.adapter.DriverAdapter;
import com.example.adminangkut.ui.adapter.PesananAdapter;
import com.example.adminangkut.util.OnClickDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CariDriverActivity extends AppCompatActivity implements OnClickDriver {
    private static final String TAG = "CariDriverActivity";
    ApiRequest apiRequest;
    DriverAdapter driverAdapter;
    ActivityCariDriverBinding binding;
    Pesanan pesanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_cari_driver);
        getSupportActionBar().setTitle("Cari Driver");
        apiRequest = RetrofitRequest.getInstance().create(ApiRequest.class);
        pesanan = getIntent().getParcelableExtra("pesanan");

        driverAdapter = new DriverAdapter(this, this::onClickDriverCallback);
        binding.rvDriver.setLayoutManager(new LinearLayoutManager(this));
        binding.rvDriver.setAdapter(driverAdapter);

        loadData("");

        binding.etCari.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                loadData(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void loadData(String tujuan) {
        Call<List<Driver>> listCall = apiRequest.getListDriver();
        listCall.enqueue(new Callback<List<Driver>>() {
            @Override
            public void onResponse(Call<List<Driver>> call, Response<List<Driver>> response) {
                if (response.isSuccessful()){
                    List<Driver> driverList = new ArrayList<>();
                    for (Driver driver : response.body()){
                        if (driver.getDaerahTujuanDriver().toLowerCase().contains(tujuan)){
                            driverList.add(driver);
                            Log.d(TAG, "onResponse: "+driver.getDaerahTujuanDriver());
                        }
                    }

                    if (driverList.size() > 0){
                        driverAdapter.setDriverList(driverList);
                    }else {
                        driverAdapter.setDriverList(response.body());
                    }

                }
            }

            @Override
            public void onFailure(Call<List<Driver>> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
            }
        });
    }

    @Override
    public void onClickDriverCallback(Driver driver) {
        Intent intent = new Intent();
        intent.putExtra("id_driver", driver.getIdDriver());
        intent.putExtra("nama_driver", driver.getNamaDriver());
        setResult(RESULT_OK, intent);
        finish();
    }
}