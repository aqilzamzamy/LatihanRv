package com.example.latihanrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class AdapterListMakanan extends RecyclerView.Adapter<AdapterListMakanan.listMakananViewHolder> {
    ArrayList<MakananModel> listMakananModel;
    private final OnItemClickListener listener;

    // add interface
    public interface OnItemClickListener {
        void onItemClick(MakananModel makananModel);
    }

    public AdapterListMakanan(ArrayList<MakananModel> listMakananModel, OnItemClickListener listener) {
        this.listMakananModel = listMakananModel;
        this.listener = listener;
    }

    public listMakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_layout, parent, false);
        return new listMakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listMakananViewHolder holder, int position) {
        MakananModel makananModel = this.listMakananModel.get(position);
        //position
        holder.tvNamaMakanan.setText(makananModel.getNamaMakanan());
        holder.tvHargaMakanan.setText(makananModel.getHargaMakanan());
        holder.tvLevelMakanan.setText(makananModel.getLevelMakanan());
        holder.imgMakanan.setImageResource(makananModel.getImgMakanan());

        //add action per item
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makananModel));
    }

    @Override
    public int getItemCount() {
        return this.listMakananModel.size();
    }

    public static class listMakananViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaMakanan;
        TextView tvHargaMakanan;
        TextView tvLevelMakanan;
        ImageView imgMakanan;
        public listMakananViewHolder(View view) {
            super(view);
            tvNamaMakanan = (TextView) itemView.findViewById(R.id.tvNamaMakanan);
            tvHargaMakanan = (TextView) itemView.findViewById(R.id.tvHargaMakanan);
            tvLevelMakanan = (TextView) itemView.findViewById(R.id.tvLevelMakanan);
            imgMakanan = (ImageView) itemView.findViewById(R.id.imgMakanan);
        }
    }
}
