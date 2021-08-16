package com.example.apprecipesmeal28042021;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {

    @GET("apimeal/detail.php")
    Call<ApiResponse<Food>> getDetailFoodFromId(@Query("id") int id);
}
