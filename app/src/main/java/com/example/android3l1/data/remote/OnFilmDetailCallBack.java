package com.example.android3l1.data.remote;

import com.example.android3l1.data.models.Film;

public interface OnFilmDetailCallBack {
    void success(Film model);
    void error();
    void failure(String msg);
}
