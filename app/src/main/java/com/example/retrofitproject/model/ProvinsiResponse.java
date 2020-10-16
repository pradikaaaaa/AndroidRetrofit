package com.example.retrofitproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProvinsiResponse {
    @SerializedName("data")
    private List<Provinsi> provinsiList;

    public ProvinsiResponse(List<Provinsi> provinsiList) {
        this.provinsiList = provinsiList;
    }

    public List<Provinsi> getProvinsiList() {
        return provinsiList;
    }

    public void setProvinsiList(List<Provinsi> provinsiList) {
        this.provinsiList = provinsiList;
    }
}
