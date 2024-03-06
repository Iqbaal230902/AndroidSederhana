package com.dicoding.aplikasisederhana;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<Foods> listFoods;
    private Context context;

    public ListAdapter(ArrayList<Foods> list) {
        this.listFoods = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_foods, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Foods foods = listFoods.get(position);
        Glide.with(holder.itemView.getContext())
                .load(foods.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(foods.getName());
        holder.tvDetail.setText(foods.getDeskripsi());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, Description.class);
                Bundle bundle = new Bundle();

                bundle.putString("nama", foods.getName());
                bundle.putString("deskripsi", foods.getDeskripsi());
                bundle.putInt("gambar", foods.getPhoto());
                intent.putExtras(bundle);
                context.startActivity(intent);

                Toast.makeText(holder.itemView.getContext(), "" + listFoods.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return listFoods.size();
    }




    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_photo);
            tvName = itemView.findViewById(R.id.item_name);
            tvDetail = itemView.findViewById(R.id.item_detail);
        }
    }
}
