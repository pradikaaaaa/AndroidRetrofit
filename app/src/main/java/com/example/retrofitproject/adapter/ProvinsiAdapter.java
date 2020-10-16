package com.example.retrofitproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retrofitproject.R;
import com.example.retrofitproject.model.Provinsi;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProvinsiAdapter extends RecyclerView.Adapter<ProvinsiAdapter.ProvinsiViewHolder> {
    private List<Provinsi> provinsi;
    private Context context;

    public ProvinsiAdapter(List<Provinsi> provinsi, Context context) {
        this.provinsi = provinsi;
        this.context = context;
    }

    @NonNull
    @Override
    public ProvinsiAdapter.ProvinsiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_provinsi,parent,false);
        ProvinsiViewHolder viewHolder = new ProvinsiViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinsiAdapter.ProvinsiViewHolder holder, int position) {
        holder.tvProvinsi.setText(provinsi.get(position).getProvinsi());
        holder.tvKasusPositif.setText(Integer.toString(provinsi.get(position).getKasus_Posi()));
        holder.tvKasusSembuh.setText(Integer.toString(provinsi.get(position).getKasus_Semb()));
        holder.tvKasusMeninggal.setText(Integer.toString(provinsi.get(position).getKasus_Meni()));
    }

    @Override
    public int getItemCount() {
        return provinsi.size();
    }

    public class ProvinsiViewHolder extends RecyclerView.ViewHolder {
        TextView tvProvinsi, tvKasusPositif, tvKasusSembuh, tvKasusMeninggal;

        public ProvinsiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProvinsi = itemView.findViewById(R.id.tvProvinsi);
            tvKasusPositif = itemView.findViewById(R.id.tvKasusPositif);
            tvKasusMeninggal = itemView.findViewById(R.id.tvKasusMeninggal);
            tvKasusSembuh = itemView.findViewById(R.id.tvKasusSembuh);
        }
    }
}
