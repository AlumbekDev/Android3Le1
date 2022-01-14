package com.example.android3l1;

import android.app.Application;

import com.example.android3l1.data.remote.FilmsApi;
import com.example.android3l1.data.remote.FilmsApiService;
import com.example.android3l1.data.remote.RetrofitClient;

public class App extends Application {

    private RetrofitClient retrofitClient;
    public static FilmsApi api;
    public static FilmsApiService apiService;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api= retrofitClient.provideFilmApi();
        apiService = new FilmsApiService();
    }
}