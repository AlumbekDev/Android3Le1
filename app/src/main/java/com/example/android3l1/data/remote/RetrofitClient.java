package com.example.android3l1.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://ghibliapi.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public FilmsApi provideFilmApi(){
        return retrofit.create(FilmsApi.class);
    }
}