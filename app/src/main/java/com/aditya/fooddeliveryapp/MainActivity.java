package com.aditya.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aditya.fooddeliveryapp.Adapter.AsiaFoodAdapter;
import com.aditya.fooddeliveryapp.Adapter.PopularFoodAdpater;
import com.aditya.fooddeliveryapp.Model.AsiaFood;
import com.aditya.fooddeliveryapp.Model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecyclerview,asiaRecyclerview;
    PopularFoodAdpater popularFoodAdpater;
    AsiaFoodAdapter asiaFoodAdapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Float Cake Vietnam","$7.05",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumstick","$17.05",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka","$27.05",R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam","$7.05",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chicken Drumstick","$17.05",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka","$27.05",R.drawable.popularfood3));

        setPopularRecyclerview(popularFoodList);

        List<AsiaFood> asiaFoodList = new ArrayList<>();

        asiaFoodList.add(new AsiaFood("Chicago Pizza","$20",R.drawable.asiafood1,"4.5","Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake","$25",R.drawable.asiafood2,"4.2","Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza","$20",R.drawable.asiafood1,"4.5","Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake","$25",R.drawable.asiafood2,"4.2","Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza","$20",R.drawable.asiafood1,"4.5","Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake","$25",R.drawable.asiafood2,"4.2","Briand Restaurant"));

        setAsiaRecyclerview(asiaFoodList);
    }

    private void setPopularRecyclerview(List<PopularFood> popularFoodList){
        popularRecyclerview = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popularRecyclerview.setLayoutManager(layoutManager);
        popularFoodAdpater = new PopularFoodAdpater(this,popularFoodList);
        popularRecyclerview.setAdapter(popularFoodAdpater);
    }
    private void setAsiaRecyclerview(List<AsiaFood> asiaFoodList){
        asiaRecyclerview = findViewById(R.id.asiaRecyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        asiaRecyclerview.setLayoutManager(layoutManager);
        asiaFoodAdapater = new AsiaFoodAdapter(this,asiaFoodList);
        asiaRecyclerview.setAdapter(asiaFoodAdapater);
    }

}
