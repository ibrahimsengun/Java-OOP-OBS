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
public class Akademisyen {
    private String BNo;
    private String Ad;
    private String Soyad;
    private String Unvan;
    private String Sifre;

    public Akademisyen(String Ad, String Soyad, String Unvan, String Sifre) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Unvan = Unvan;
        this.Sifre = Sifre;
    }

    public Akademisyen(String BNo, String Ad, String Soyad, String Unvan, String Sifre) {
        this.BNo = BNo;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Unvan = Unvan;
        this.Sifre = Sifre;
    }

    public String getBNo() {
        return BNo;
    }

    public void setBNo(String No) {
        this.BNo = No;
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

    public String getUnvan() {
        return Unvan;
    }

    public void setUnvan(String Unvan) {
        this.Unvan = Unvan;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }
    
    
}
