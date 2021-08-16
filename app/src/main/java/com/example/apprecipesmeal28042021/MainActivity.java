package com.example.apprecipesmeal28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;

import com.bumptech.glide.Glide;
import com.example.apprecipesmeal28042021.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        ApiRequest apiRequest = RetrofitInit.getInstance();


        Call<ApiResponse<Food>> callbackRequest = apiRequest.getDetailFoodFromId(1);

        callbackRequest.enqueue(new Callback<ApiResponse<Food>>() {
            @Override
            public void onResponse(Call<ApiResponse<Food>> call, Response<ApiResponse<Food>> response) {
                ApiResponse<Food> data = response.body();
                Food food = data.getData();
                mainBinding.textViewKCalCalories.setText(food.getCalo());
                mainBinding.textViewGamCarBo.setText(food.getCarbo());
                mainBinding.textViewGamProtein.setText(food.getProtein());
                Glide.with(MainActivity.this)
                        .load("https://phatdroid94.000webhostapp.com/" + food.getImage())
                        .placeholder(R.mipmap.ic_launcher)
                        .into(mainBinding.circleImage);
                mainBinding.textViewContentIngredients.setText(food.getIngredient());
                mainBinding.textViewContentRecipePreparation.setText(food.getInstruction());
            }

            @Override
            public void onFailure(Call<ApiResponse<Food>> call, Throwable t) {

            }
        });
    }
}