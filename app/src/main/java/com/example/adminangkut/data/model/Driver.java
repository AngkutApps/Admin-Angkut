package com.example.adminangkut.data.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.RequiresApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.function.Predicate;

public class Driver implements Parcelable{
    @SerializedName("id_driver_travel")
    @Expose
    private String idDriver;

    @SerializedName("nama_driver")
    @Expose
    private String namaDriver;

    @SerializedName("no_hp_utama")
    @Expose
    private String noHpUtama;

    @SerializedName("no_hp_cadangan")
    @Expose
    private String noHpCadangan;

    @SerializedName("jenis_kelamin")
    @Expose
    private String jenisKelamin;

    @SerializedName("merk_kendaraan")
    @Expose
    private String merkKendaraan;

    @SerializedName("warna_kendaraan")
    @Expose
    private String warnaKendaraan;

    @SerializedName("plat_kendaraan")
    @Expose
    private String platKendaraan;

    @SerializedName("lokasi_terkini")
    @Expose
    private String lokasiTerkini;

    @SerializedName("daerah_tujuan_driver")
    @Expose
    private String daerahTujuanDriver;

    @SerializedName("kursi_kosong")
    @Expose
    private String kursiKosong;

    public Driver(String idDriver, String namaDriver, String noHpUtama, String noHpCadangan, String jenisKelamin, String merkKendaraan, String warnaKendaraan, String platKendaraan, String lokasiTerkini, String daerahTujuanDriver, String kursiKosong) {
        this.idDriver = idDriver;
        this.namaDriver = namaDriver;
        this.noHpUtama = noHpUtama;
        this.noHpCadangan = noHpCadangan;
        this.jenisKelamin = jenisKelamin;
        this.merkKendaraan = merkKendaraan;
        this.warnaKendaraan = warnaKendaraan;
        this.platKendaraan = platKendaraan;
        this.lokasiTerkini = lokasiTerkini;
        this.daerahTujuanDriver = daerahTujuanDriver;
        this.kursiKosong = kursiKosong;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public String getNamaDriver() {
        return namaDriver;
    }

    public String getNoHpUtama() {
        return noHpUtama;
    }

    public String getNoHpCadangan() {
        return noHpCadangan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public String getPlatKendaraan() {
        return platKendaraan;
    }

    public String getLokasiTerkini() {
        return lokasiTerkini;
    }

    public String getDaerahTujuanDriver() {
        return daerahTujuanDriver;
    }

    public String getKursiKosong() {
        return kursiKosong;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.idDriver);
        dest.writeString(this.namaDriver);
        dest.writeString(this.noHpUtama);
        dest.writeString(this.noHpCadangan);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.merkKendaraan);
        dest.writeString(this.warnaKendaraan);
        dest.writeString(this.platKendaraan);
        dest.writeString(this.lokasiTerkini);
        dest.writeString(this.daerahTujuanDriver);
        dest.writeString(this.kursiKosong);
    }

    protected Driver(Parcel in) {
        this.idDriver = in.readString();
        this.namaDriver = in.readString();
        this.noHpUtama = in.readString();
        this.noHpCadangan = in.readString();
        this.jenisKelamin = in.readString();
        this.merkKendaraan = in.readString();
        this.warnaKendaraan = in.readString();
        this.platKendaraan = in.readString();
        this.lokasiTerkini = in.readString();
        this.daerahTujuanDriver = in.readString();
        this.kursiKosong = in.readString();
    }

    public static final Parcelable.Creator<Driver> CREATOR = new Parcelable.Creator<Driver>() {
        @Override
        public Driver createFromParcel(Parcel source) {
            return new Driver(source);
        }

        @Override
        public Driver[] newArray(int size) {
            return new Driver[size];
        }
    };

}
