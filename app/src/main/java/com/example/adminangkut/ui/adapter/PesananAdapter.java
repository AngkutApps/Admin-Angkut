package com.example.adminangkut.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminangkut.R;
import com.example.adminangkut.data.model.Pesanan;
import com.example.adminangkut.databinding.ItemPesananBinding;
import com.example.adminangkut.ui.DetailActivity;

import java.util.ArrayList;
import java.util.List;

public class PesananAdapter extends RecyclerView.Adapter<PesananAdapter.ViewHolder> {
    Context context;
    List<Pesanan> pesananList = new ArrayList<>();

    public PesananAdapter(Context context) {
        this.context = context;
    }

    public void setPesananList(List<Pesanan> pesananList){
        this.pesananList.clear();
        this.pesananList.addAll(pesananList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PesananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPesananBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_pesanan, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PesananAdapter.ViewHolder holder, int position) {
        Pesanan pesanan = pesananList.get(position);
        holder.binding.setPesanan(pesanan);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("pesanan", pesanan);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pesananList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemPesananBinding binding;
        public ViewHolder(@NonNull ItemPesananBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
