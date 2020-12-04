package com.example.adminangkut.ui.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adminangkut.R;
import com.example.adminangkut.data.ApiRequest;
import com.example.adminangkut.data.RetrofitRequest;
import com.example.adminangkut.data.model.Pesanan;
import com.example.adminangkut.databinding.FragmentPesananSekarangBinding;
import com.example.adminangkut.databinding.FragmentPesananTerjadwalBinding;
import com.example.adminangkut.ui.adapter.PesananAdapter;
import com.example.adminangkut.util.Util;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PesananTerjadwalFragment extends Fragment {
    private static final String TAG = "PesananTerjadwalFragmen";
    ApiRequest apiRequest;
    PesananAdapter pesananAdapter;
    FragmentPesananTerjadwalBinding binding;

    private BroadcastReceiver loadDataReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d(TAG, "onReceive: load Data receiver");
            loadData();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pesanan_terjadwal, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        apiRequest = RetrofitRequest.getInstance().create(ApiRequest.class);

        pesananAdapter = new PesananAdapter(getActivity());
        binding.rvPesanan.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.rvPesanan.setAdapter(pesananAdapter);



        binding.swipePesanan.setColorSchemeResources(R.color.colorPrimary,
                android.R.color.holo_green_dark,
                android.R.color.holo_orange_dark,
                android.R.color.holo_blue_dark
        );

        binding.swipePesanan.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData();
            }
        });


        binding.swipePesanan.post(new Runnable() {
            @Override
            public void run() {
                loadData();
            }
        });



    }
    private void loadData() {
        binding.swipePesanan.setRefreshing(true);
        Call<List<Pesanan>> listCall = apiRequest.getPesananTerjadwal();
        listCall.enqueue(new Callback<List<Pesanan>>() {
            @Override
            public void onResponse(Call<List<Pesanan>> call, Response<List<Pesanan>> response) {
                if (response.isSuccessful()){
                    pesananAdapter.setPesananList(response.body());
                }
                binding.swipePesanan.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<List<Pesanan>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(loadDataReceiver, new IntentFilter(Util.LOAD_DATA_RECEIVER));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(loadDataReceiver);
    }

    @Override
    public void onResume() {
        super.onResume();
        loadData();
    }
}