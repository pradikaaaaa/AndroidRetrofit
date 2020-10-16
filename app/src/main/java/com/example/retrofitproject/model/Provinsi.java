package com.example.retrofitproject.model;

import com.google.gson.annotations.SerializedName;

public class Provinsi {
    @SerializedName("fid")
    private String FID;
    @SerializedName("kodeProvi")
    private String Kode_Provi;
    @SerializedName("provinsi")
    private String Provinsi;
    @SerializedName("kasusPosi")
    private int Kasus_Posi;
    @SerializedName("kasusSemb")
    private int Kasus_Semb;
    @SerializedName("kasusMeni")
    private int Kasus_Meni;

    public Provinsi(String FID, String kode_Provi, String provinsi, int kasus_Posi, int kasus_Semb, int kasus_Meni) {
        this.FID = FID;
        Kode_Provi = kode_Provi;
        Provinsi = provinsi;
        Kasus_Posi = kasus_Posi;
        Kasus_Semb = kasus_Semb;
        Kasus_Meni = kasus_Meni;
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID;
    }

    public String getKode_Provi() {
        return Kode_Provi;
    }

    public void setKode_Provi(String kode_Provi) {
        Kode_Provi = kode_Provi;
    }

    public String getProvinsi() {
        return Provinsi;
    }

    public void setProvinsi(String provinsi) {
        Provinsi = provinsi;
    }

    public int getKasus_Posi() {
        return Kasus_Posi;
    }

    public void setKasus_Posi(int kasus_Posi) {
        Kasus_Posi = kasus_Posi;
    }

    public int getKasus_Semb() {
        return Kasus_Semb;
    }

    public void setKasus_Semb(int kasus_Semb) {
        Kasus_Semb = kasus_Semb;
    }

    public int getKasus_Meni() {
        return Kasus_Meni;
    }

    public void setKasus_Meni(int kasus_Meni) {
        Kasus_Meni = kasus_Meni;
    }
}
