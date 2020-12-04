package com.example.adminangkut.data;

import com.example.adminangkut.data.model.Driver;
import com.example.adminangkut.data.model.Perjalanan;
import com.example.adminangkut.data.model.Pesanan;
import com.example.adminangkut.data.model.Value;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiRequest {
    @GET("read_tb_pesanan_user_sekarang.php")
    Call<List<Pesanan>> getPesananSekarang();


    @GET("read_tb_pesanan_user_terjadwal.php")
    Call<List<Pesanan>> getPesananTerjadwal();

    @GET("read_biaya_perjalanan.php")
    Call<List<Perjalanan>> getBiayaPerjalanan(
            @Query("daerah_penjemputan") String daerah_penjemputan,
            @Query("daerah_tujuan") String daerah_tujuan
    );

    @GET("read_tb_driver_travel.php")
    Call<List<Driver>> getListDriver();

    @FormUrlEncoded
    @POST("update_status_pesanan.php")
    Call<Value> updateStatusPesanan(
            @Field("no_hp_user") String noHpUser,
            @Field("id_driver_travel") String id_driver_travel,
            @Field("token_firebase") String token_firebase,
            @Field("biaya") String biaya,
            @Field("lok_penjemputan") String lok_penjemputan,
            @Field("koordinat_penjemputan") String koordinat_penjemputan,
            @Field("lok_tujuan") String lok_tujuan,
            @Field("koordinat_tujuan") String koordinat_tujuan,
            @Field("penumpang_dewasa") String penumpang_dewasa,
            @Field("penumpang_anak") String penumpang_anak,
            @Field("barang_bawaan") String barang_bawaan,
            @Field("keberangkatan") String keberangkatan
    );

    @FormUrlEncoded
    @POST("update_data_driver.php")
    Call<Value> updateDataDriver(
            @Field("id_driver_travel") String id_driver_travel,
            @Field("nama_driver") String nama_driver,
            @Field("no_hp_utama") String no_hp_utama,
            @Field("no_hp_cadangan") String no_hp_cadangan,
            @Field("jenis_kelamin") String jenis_kelamin,
            @Field("merk_kendaraan") String merk_kendaraan,
            @Field("warna_kendaraan") String warna_kendaraan,
            @Field("plat_kendaraan") String plat_kendaraan,
            @Field("lokasi_terkini") String lokasi_terkini,
            @Field("daerah_tujuan_driver") String daerah_tujuan_driver,
            @Field("kursi_kosong") String kursi_kosong
    );


    @FormUrlEncoded
    @POST("update_biaya_perjalanan.php")
    Call<Value> updateBiaya(
            @Field("id_biaya_perjalanan") String id_biaya_perjalanan,
            @Field("biaya") String biaya
    );

}
