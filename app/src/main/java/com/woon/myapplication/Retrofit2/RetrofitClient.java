package com.woon.myapplication.Retrofit2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitService service = null;

    private RetrofitClient() { }

    public static RetrofitService getService() {
        if (service == null) {
            service = new Retrofit.Builder()
                    .baseUrl("https://ghibliapi.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(RetrofitService.class);
        }

        return service;
    }
}
