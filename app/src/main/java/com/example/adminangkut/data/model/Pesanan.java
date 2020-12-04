package com.example.adminangkut.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pesanan implements Parcelable {
    @SerializedName("nama_user")
    @Expose
    private String namaUser;

    @SerializedName("token_firebase")
    @Expose
    private String tokenFirebase;

    @SerializedName("no_hp_user")
    @Expose
    private String noHpUser;

    @SerializedName("lok_penjemputan")
    @Expose
    private String lokPenjemputan;

    @SerializedName("koordinat_penjemputan")
    @Expose
    private String koordinatPenjemputan;

    @SerializedName("lok_tujuan")
    @Expose
    private String lokTujuan;

    @SerializedName("koordinat_tujuan")
    @Expose
    private String koordinatTujuan;

    @SerializedName("penumpang_dewasa")
    @Expose
    private String penumpangDewasa;

    @SerializedName("penumpang_anak")
    @Expose
    private String penumpangAnak;

    @SerializedName("barang_bawaan")
    @Expose
    private String barangBawaan;

    @SerializedName("biaya")
    @Expose
    private String biaya;

    @SerializedName("keberangkatan")
    @Expose
    private String keberangkatan;

    @SerializedName("id_driver_travel")
    @Expose
    private String idDriverTravel;

    public Pesanan(String namaUser, String tokenFirebase, String noHpUser, String lokPenjemputan, String koordinatPenjemputan, String lokTujuan, String koordinatTujuan, String penumpangDewasa, String penumpangAnak, String barangBawaan, String biaya, String keberangkatan, String idDriverTravel) {
        this.namaUser = namaUser;
        this.tokenFirebase = tokenFirebase;
        this.noHpUser = noHpUser;
        this.lokPenjemputan = lokPenjemputan;
        this.koordinatPenjemputan = koordinatPenjemputan;
        this.lokTujuan = lokTujuan;
        this.koordinatTujuan = koordinatTujuan;
        this.penumpangDewasa = penumpangDewasa;
        this.penumpangAnak = penumpangAnak;
        this.barangBawaan = barangBawaan;
        this.biaya = biaya;
        this.keberangkatan = keberangkatan;
        this.idDriverTravel = idDriverTravel;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public String getTokenFirebase() {
        return tokenFirebase;
    }

    public String getNoHpUser() {
        return noHpUser;
    }

    public String getLokPenjemputan() {
        return lokPenjemputan;
    }

    public String getKoordinatPenjemputan() {
        return koordinatPenjemputan;
    }

    public String getLokTujuan() {
        return lokTujuan;
    }

    public String getKoordinatTujuan() {
        return koordinatTujuan;
    }

    public String getPenumpangDewasa() {
        return penumpangDewasa;
    }

    public String getPenumpangAnak() {
        return penumpangAnak;
    }

    public String getBarangBawaan() {
        return barangBawaan;
    }

    public String getBiaya() {
        return biaya;
    }

    public String getKeberangkatan() {
        return keberangkatan;
    }

    public String getIdDriverTravel() {
        return idDriverTravel;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaUser);
        dest.writeString(this.tokenFirebase);
        dest.writeString(this.noHpUser);
        dest.writeString(this.lokPenjemputan);
        dest.writeString(this.lokTujuan);
        dest.writeString(this.penumpangDewasa);
        dest.writeString(this.penumpangAnak);
        dest.writeString(this.barangBawaan);
        dest.writeString(this.biaya);
        dest.writeString(this.keberangkatan);
        dest.writeString(this.idDriverTravel);
    }

    protected Pesanan(Parcel in) {
        this.namaUser = in.readString();
        this.tokenFirebase = in.readString();
        this.noHpUser = in.readString();
        this.lokPenjemputan = in.readString();
        this.lokTujuan = in.readString();
        this.penumpangDewasa = in.readString();
        this.penumpangAnak = in.readString();
        this.barangBawaan = in.readString();
        this.biaya = in.readString();
        this.keberangkatan = in.readString();
        this.idDriverTravel = in.readString();
    }

    public static final Creator<Pesanan> CREATOR = new Creator<Pesanan>() {
        @Override
        public Pesanan createFromParcel(Parcel source) {
            return new Pesanan(source);
        }

        @Override
        public Pesanan[] newArray(int size) {
            return new Pesanan[size];
        }
    };
}
