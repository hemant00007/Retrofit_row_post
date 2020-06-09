package com.example.retrofit_row_post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callapi();
    }

    private void callapi() {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apikey","apischool");

        IRetrofit jsonPostService = ServiceGenerator.createService(IRetrofit.class, "http://yourwebserviceapi/");
        Call<jsonObject> call = jsonPostService.postRawJSON(jsonObject);
        call.enqueue(new Callback<JsonObject>() {

            @Override
            public void onResponse(Call<JsonObject> call, Response<jsonobject> response) {
                try{
                    Log.e("response-success", response.body().toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e("response-failure", call.toString());
            }

        });

    }
}
