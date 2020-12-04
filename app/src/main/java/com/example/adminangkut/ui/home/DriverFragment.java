package com.example.adminangkut.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.adminangkut.R;
import com.example.adminangkut.data.ApiRequest;
import com.example.adminangkut.data.RetrofitRequest;
import com.example.adminangkut.data.model.Driver;
import com.example.adminangkut.databinding.ActivityCariDriverBinding;
import com.example.adminangkut.databinding.FragmentDriverBinding;
import com.example.adminangkut.ui.UpdateDriverActivity;
import com.example.adminangkut.ui.adapter.DriverAdapter;
import com.example.adminangkut.util.OnClickDriver;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DriverFragment extends Fragment implements OnClickDriver {
    private static final String TAG = "DriverFragment";
    FragmentDriverBinding binding;

    ApiRequest apiRequest;
    DriverAdapter driverAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_driver, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        driverAdapter = new DriverAdapter(getActivity(), this::onClickDriverCallback);
        apiRequest = RetrofitRequest.getInstance().create(ApiRequest.class);
        binding.rvDriver.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.rvDriver.setAdapter(driverAdapter);

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

    @Override
    public void onClickDriverCallback(Driver driver) {
        Intent intent = new Intent(getActivity(), UpdateDriverActivity.class);
        intent.putExtra("driver", driver);
        startActivity(intent);
    }

    private void loadData(String tujuan) {
        Call<List<Driver>> listCall = apiRequest.getListDriver();
        listCall.enqueue(new Callback<List<Driver>>() {
            @Override
            public void onResponse(Call<List<Driver>> call, Response<List<Driver>> response) {
                if (response.isSuccessful()){
                    List<Driver> driverList = new ArrayList<>();
                    for (Driver driver : response.body()){
                        if (driver.getNamaDriver().toLowerCase().contains(tujuan)){
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
    public void onResume() {
        super.onResume();

        loadData("");

    }
}