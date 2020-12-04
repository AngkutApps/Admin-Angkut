package com.example.adminangkut.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.adminangkut.R;
import com.example.adminangkut.data.ApiRequest;
import com.example.adminangkut.data.RetrofitRequest;
import com.example.adminangkut.data.model.Perjalanan;
import com.example.adminangkut.data.model.Value;
import com.example.adminangkut.databinding.FragmentBiayaBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BiayaFragment extends Fragment {
    private static final String TAG = "BiayaFragment";
    FragmentBiayaBinding binding;
    ApiRequest apiRequest;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_biaya, container, false);
        apiRequest = RetrofitRequest.getInstance().create(ApiRequest.class);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> listKota = setDataKota();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.item_spinner, R.id.weekofday, listKota);
        binding.spJemput.setAdapter(arrayAdapter);
        binding.spTujuan.setAdapter(arrayAdapter);

        binding.spJemput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String jemput = adapterView.getItemAtPosition(i).toString();
                String tujuan = binding.spTujuan.getSelectedItem().toString();
                loadBiaya(jemput, tujuan);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        binding.spTujuan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String tujuan = adapterView.getItemAtPosition(i).toString();
                String jemput = binding.spJemput.getSelectedItem().toString();
                loadBiaya(jemput, tujuan);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        loadBiaya(binding.spJemput.getSelectedItem().toString(), binding.spTujuan.getSelectedItem().toString());



    }

    private void updateBiaya(String idPerjalanan) {
        Call<Value> valueCall = apiRequest.updateBiaya(idPerjalanan, binding.etBiaya.getText().toString());
        valueCall.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                if (response.isSuccessful()){
                    Toast.makeText(getActivity(), ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {

            }
        });
    }

    private void loadBiaya(String jemput, String tujuan) {
        Call<List<Perjalanan>> perjalananCall = apiRequest.getBiayaPerjalanan(jemput, tujuan);
        perjalananCall.enqueue(new Callback<List<Perjalanan>>() {
            @Override
            public void onResponse(Call<List<Perjalanan>> call, Response<List<Perjalanan>> response) {
                if (response.isSuccessful()){
                    if (response.body().size() > 0) {
                        binding.etBiaya.setText(response.body().get(0).getBiaya());
                        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                updateBiaya(response.body().get(0).getIdBiayaPerjalanan());
                            }
                        });
                    }else {
                        binding.etBiaya.setText("0");
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Perjalanan>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });
    }

    private List<String> setDataKota() {
        List<String> kotaList = new ArrayList<>();
        kotaList.clear();
        kotaList.add("Makassar");
        kotaList.add("Barru");
        kotaList.add("Bone");
        kotaList.add("Bulukumba");
        kotaList.add("Enrekang");
        kotaList.add("Gowa");
        kotaList.add("Jeneponto");
        kotaList.add("Kepulauan Selayar");
        kotaList.add("Luwu");
        kotaList.add("Luwu Timur");
        kotaList.add("Luwu Utara");
        kotaList.add("Maros");
        kotaList.add("Pangkep");
        kotaList.add("Pinrang");
        kotaList.add("Sidrap");
        kotaList.add("Sinjai");
        kotaList.add("Soppeng");
        kotaList.add("Takalar");
        kotaList.add("Toraja");
        kotaList.add("Toraja Utara");
        kotaList.add("Palopo");
        kotaList.add("Pare Pare");
        kotaList.add("Wajo");

        return kotaList;
    }
}