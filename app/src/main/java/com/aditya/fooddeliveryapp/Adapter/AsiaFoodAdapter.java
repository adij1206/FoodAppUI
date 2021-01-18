package com.aditya.fooddeliveryapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.fooddeliveryapp.Model.AsiaFood;
import com.aditya.fooddeliveryapp.Model.PopularFood;
import com.aditya.fooddeliveryapp.R;

import java.util.List;

public class AsiaFoodAdapter extends RecyclerView.Adapter<AsiaFoodAdapter.AsiaFoodViewHolder> {
    Context context;
    List<AsiaFood> asiaFoodList;

    public AsiaFoodAdapter(Context context, List<AsiaFood> asiaFoodList) {
        this.context = context;
        this.asiaFoodList = asiaFoodList;
    }

    @NonNull
    @Override
    public AsiaFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.asia_food_row_item,parent,false);
        return new AsiaFoodAdapter.AsiaFoodViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AsiaFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(asiaFoodList.get(position).getImageUrl());
        holder.name.setText(asiaFoodList.get(position).getName());
        holder.price.setText(asiaFoodList.get(position).getPrice());
        holder.rating.setText(asiaFoodList.get(position).getRating());
        holder.restorantname.setText(asiaFoodList.get(position).getRestorantname());

    }

    @Override
    public int getItemCount() {
        return asiaFoodList.size();
    }

    public static final class AsiaFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView name,price,rating,restorantname;

        public AsiaFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            rating = itemView.findViewById(R.id.rating);
            restorantname = itemView.findViewById(R.id.restorant_name);
        }
    }
}
