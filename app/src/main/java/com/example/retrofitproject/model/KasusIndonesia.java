package com.example.retrofitproject.model;

import com.google.gson.annotations.SerializedName;

public class KasusIndonesia {
    @SerializedName("perawatan")
    private String perawatan;
    @SerializedName("sembuh")
    private String sembuh;
    @SerializedName("meninggal")
    private String meninggal;
    @SerializedName("jumlahKasus")
    private String jumlahKasus;

    public KasusIndonesia(String perawatan, String sembuh, String meninggal, String jumlahKasus) {
        this.perawatan = perawatan;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
        this.jumlahKasus = jumlahKasus;
    }

    public String getPerawatan() {
        return perawatan;
    }

    public void setPerawatan(String perawatan) {
        this.perawatan = perawatan;
    }

    public String getSembuh() {
        return sembuh;
    }

    public void setSembuh(String sembuh) {
        this.sembuh = sembuh;
    }

    public String getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(String meninggal) {
        this.meninggal = meninggal;
    }

    public String getJumlahKasus() {
        return jumlahKasus;
    }

    public void setJumlahKasus(String jumlahKasus) {
        this.jumlahKasus = jumlahKasus;
    }
}
