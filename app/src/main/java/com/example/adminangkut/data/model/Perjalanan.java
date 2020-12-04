package com.example.adminangkut.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Perjalanan {
    @SerializedName("id_biaya_perjalanan")
    @Expose
    private String idBiayaPerjalanan;

    @SerializedName("biaya")
    @Expose
    private String biaya;

    public Perjalanan(String idBiayaPerjalanan, String biaya) {
        this.idBiayaPerjalanan = idBiayaPerjalanan;
        this.biaya = biaya;
    }

    public String getIdBiayaPerjalanan() {
        return idBiayaPerjalanan;
    }

    public String getBiaya() {
        return biaya;
    }
}
