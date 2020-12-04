package com.example.adminangkut.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminangkut.R;
import com.example.adminangkut.data.model.Driver;
import com.example.adminangkut.data.model.Pesanan;
import com.example.adminangkut.databinding.ItemDriverBinding;
import com.example.adminangkut.databinding.ItemPesananBinding;
import com.example.adminangkut.ui.DetailActivity;
import com.example.adminangkut.util.OnClickDriver;

import java.util.ArrayList;
import java.util.List;

public class DriverAdapter extends RecyclerView.Adapter<DriverAdapter.ViewHolder> {
    Context context;
    List<Driver> driverList = new ArrayList<>();
    OnClickDriver onClickDriver;

    public DriverAdapter(Context context, OnClickDriver onClickDriver) {
        this.context = context;
        this.onClickDriver = onClickDriver;
    }

    public void setDriverList(List<Driver> driverList){
        this.driverList.clear();
        this.driverList.addAll(driverList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DriverAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDriverBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_driver, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DriverAdapter.ViewHolder holder, int position) {
        Driver driver = driverList.get(position);
        holder.binding.setPesanan(driver);

        String merkWarna = driver.getMerkKendaraan()+" ("+driver.getWarnaKendaraan()+")";
        holder.binding.tvMerk.setText(merkWarna);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickDriver.onClickDriverCallback(driver);
            }
        });

    }

    @Override
    public int getItemCount() {
        return driverList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemDriverBinding binding;
        public ViewHolder(@NonNull ItemDriverBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
