package com.example.retrofit_row_post;

import com.google.gson.JsonObject;

import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IRetrofit {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST("saveRawJSONData")
    Call<jsonObject> postRawJSON(@Body JsonObject locationPost);
}
