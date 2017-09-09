package com.okegarden;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.okegarden.activities.DetailProdukActivity;

import java.util.List;

/**
 * Created by Joko Priyono on 30/07/2017.
 */

public class TanamanAdapter extends RecyclerView.Adapter<TanamanAdapter.MyViewHolder>{
    private List<TanamanData> dataTanamanList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, dilihat, harga, dibeli;
        ImageView imgJudul;
        LinearLayout linearItem;

        public MyViewHolder(View view) {
            super(view);
            imgJudul = (ImageView)view.findViewById(R.id.img_judul_tanaman);
            title = (TextView) view.findViewById(R.id.txt_judul);
            harga = (TextView) view.findViewById(R.id.txt_harga);
            dilihat = (TextView) view.findViewById(R.id.txt_dilihat);
            dibeli = (TextView) view.findViewById(R.id.txt_dibeli);
            linearItem = (LinearLayout)view.findViewById(R.id.linear_item_tanaman);
            linearItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.getContext().startActivity(new Intent(context, DetailProdukActivity.class));
                }
            });
        }
    }


    public TanamanAdapter(List<TanamanData> dataTanamanList, Context context) {
        this.dataTanamanList = dataTanamanList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tanaman, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        TanamanData tanamanData = dataTanamanList.get(position);
        holder.imgJudul.setImageResource(tanamanData.getIdGambar());
        holder.title.setText(tanamanData.getJudul());
        holder.harga.setText(tanamanData.getHarga());
        holder.dilihat.setText(tanamanData.getDilihat());
        holder.dibeli.setText(tanamanData.getPenjualan());
    }

    @Override
    public int getItemCount() {
        return dataTanamanList.size();
    }
}
