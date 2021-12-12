package com.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class UrunYorumDto {

    public String urunAdi;
    public String kategoriAdi;
    public BigDecimal fiyat;
    public String kullaniciAdi;
    public String kullaniciSoyadi;
    public String kullaniciEmail;
    public String kullaniciTelefon;
    public String yorum;
    public Date yorumTarihi;

    public UrunYorumDto(String urunAdi, String kategoriAdi, BigDecimal fiyat, String kullaniciAdi,
            String kullaniciSoyadi, String kullaniciEmail, String kullaniciTelefon, String yorum, Date yorumTarihi) {
        this.urunAdi = urunAdi;
        this.kategoriAdi = kategoriAdi;
        this.fiyat = fiyat;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSoyadi = kullaniciSoyadi;
        this.kullaniciEmail = kullaniciEmail;
        this.kullaniciTelefon = kullaniciTelefon;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSoyadi() {
        return kullaniciSoyadi;
    }

    public void setKullaniciSoyadi(String kullaniciSoyadi) {
        this.kullaniciSoyadi = kullaniciSoyadi;
    }

    public String getKullaniciEmail() {
        return kullaniciEmail;
    }

    public void setKullaniciEmail(String kullaniciEmail) {
        this.kullaniciEmail = kullaniciEmail;
    }

    public String getKullaniciTelefon() {
        return kullaniciTelefon;
    }

    public void setKullaniciTelefon(String kullaniciTelefon) {
        this.kullaniciTelefon = kullaniciTelefon;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    @Override
    public String toString() {
        return "UrunYorumDto [fiyat=" + fiyat + ", kategoriAdi=" + kategoriAdi + ", kullaniciAdi=" + kullaniciAdi
                + ", kullaniciEmail=" + kullaniciEmail + ", kullaniciSoyadi=" + kullaniciSoyadi + ", kullaniciTelefon="
                + kullaniciTelefon + ", urunAdi=" + urunAdi + ", yorum=" + yorum + ", yorumTarihi=" + yorumTarihi + "]";
    }

}
