package com.okegarden;

/**
 * Created by LENOVO on 30/07/2017.
 */

public class TanamanData {
    private String judul, harga, dilihat, penjualan;
    private int idGambar;

    public TanamanData(String judul, String harga, String dilihat, String penjualan, int idGambar) {
        this.judul = judul;
        this.harga = harga;
        this.dilihat = dilihat;
        this.penjualan = penjualan;
        this.idGambar = idGambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDilihat() {
        return dilihat;
    }

    public void setDilihat(String dilihat) {
        this.dilihat = dilihat;
    }

    public String getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(String penjualan) {
        this.penjualan = penjualan;
    }

    public int getIdGambar() {
        return idGambar;
    }

    public void setIdGambar(int idGambar) {
        this.idGambar = idGambar;
    }
}
