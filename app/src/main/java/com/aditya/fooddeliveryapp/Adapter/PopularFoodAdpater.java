package com.aditya.fooddeliveryapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.fooddeliveryapp.DetailsActivity;
import com.aditya.fooddeliveryapp.Model.PopularFood;
import com.aditya.fooddeliveryapp.R;

import java.util.List;

public class PopularFoodAdpater extends RecyclerView.Adapter<PopularFoodAdpater.PopularFoodViewHolder> {

    Context context;
    List<PopularFood> popularFoodList;

    public PopularFoodAdpater(Context context, List<PopularFood> popularFoodList) {
        this.context = context;
        this.popularFoodList = popularFoodList;
    }

    @NonNull
    @Override
    public PopularFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.popular_food_row_item,parent,false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularFoodViewHolder holder, int position) {
                holder.foodImage.setImageResource(popularFoodList.get(position).getImageUrl());
                holder.name.setText(popularFoodList.get(position).getName());
                holder.price.setText(popularFoodList.get(position).getPrice());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(context, DetailsActivity.class);
                        context.startActivity(i);
                    }
                });

    }

    @Override
    public int getItemCount() {
        return popularFoodList.size();
    }

    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView name,price;

        public PopularFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
