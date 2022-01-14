package com.example.android3l1.data.remote;

import androidx.annotation.NonNull;

import com.example.android3l1.App;
import com.example.android3l1.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmsApiService {
    public void getFilms(OnFilmReadyCallBack myCallback) {

        App.api.getFilms().enqueue(new Callback<List<Film>>() {
            @Override
            public void onResponse(Call<List<Film>> call, Response<List<Film>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    myCallback.success(response.body());
                } else if (response.code() > 500) {
                    myCallback.onServerError();
                }
            }

            @Override
            public void onFailure(Call<List<Film>> call, Throwable t) {
                myCallback.failure(t.getLocalizedMessage());
            }
        });
    }

    public void getDetailFilms(String id, OnFilmDetailCallBack callback) {

        App.api.getDetailFilms(id).enqueue(new Callback<Film>() {
            @Override
            public void onResponse(@NonNull Call<Film> call, @NonNull Response<Film> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.success(response.body());
                } else if (response.code() > 500) {
                    callback.error();
                }
            }

            @Override
            public void onFailure(@NonNull Call<Film> call, @NonNull Throwable t) {
                callback.failure(t.getLocalizedMessage());
            }

        });
    }
}
