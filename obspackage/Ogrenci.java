package obspackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrahimsengun
 */
public class Ogrenci {
    private String Ad;
    private String Soyad;
    private float GNO;
    private int BNo;
    private String Sifre;

    public Ogrenci(String Ad, String Soyad, float GNO, String Sifre) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.GNO = GNO;
        this.Sifre = Sifre;
    }

    public Ogrenci(String Ad, String Soyad, float GNO, int BNo, String Sifre) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.GNO = GNO;
        this.BNo = BNo;
        this.Sifre = Sifre;
    }

    public int getBNo() {
        return BNo;
    }

    public void setBNo(int BNo) {
        this.BNo = BNo;
    }
    
    
    
    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public float getGNO() {
        return GNO;
    }

    public void setGNO(float GNO) {
        this.GNO = GNO;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }
    
    
}
