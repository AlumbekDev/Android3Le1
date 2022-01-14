package com.example.android3l1.data.remote;

import com.example.android3l1.data.models.Film;

import java.util.List;

public interface OnFilmReadyCallBack {
    void success (List<Film> films);
    void onServerError();
    void failure(String msg);
}
