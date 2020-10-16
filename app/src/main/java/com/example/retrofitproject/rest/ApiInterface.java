package com.example.retrofitproject.rest;

import com.example.retrofitproject.model.KasusIndonesia;
import com.example.retrofitproject.model.ProvinsiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("provinsi")
    Call<ProvinsiResponse> getDataProvinsi();

    @GET(".")
    Call<KasusIndonesia> getDataKasus();
}
