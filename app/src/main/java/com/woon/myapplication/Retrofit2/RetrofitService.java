package com.woon.myapplication.Retrofit2;

import com.woon.myapplication.RecyclerView.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("films")
    Call<List<Data>> getFilms();
}
