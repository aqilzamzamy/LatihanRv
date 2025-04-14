package com.example.latihanrv;

public class MakananModel {
    private String namaMakanan;
    private String hargaMakanan;
    private String levelMakanan;
    private int imgMakanan;

    public MakananModel(String namaMakanan, String hargaMakanan, String levelMakanan, int imgMakanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.levelMakanan = levelMakanan;
        this.imgMakanan = imgMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getLevelMakanan() {
        return levelMakanan;
    }

    public int getImgMakanan() {
        return imgMakanan;
    }
}
