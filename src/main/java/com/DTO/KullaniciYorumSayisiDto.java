package com.DTO;

import java.util.Date;

public class KullaniciYorumSayisiDto {

    private Long kullaniciID;
    private String kullaniciAdi;
    private String urunAdi;
    private String yorum;
    private Date yorumTarihi;

    public KullaniciYorumSayisiDto(
            Long kullaniciID, String kullaniciAdi, String urunAdi, String yorum,
            Date yorumTarihi) {
        this.kullaniciID = kullaniciID;
        this.kullaniciAdi = kullaniciAdi;
        this.urunAdi = urunAdi;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public Long getKullaniciID() {
        return kullaniciID;
    }

    public void setKullaniciID(Long kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
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
        return "KullaniciYorumSayisiDto [kullaniciAdi=" + kullaniciAdi + ", kullaniciID=" + kullaniciID + ", urunAdi="
                + urunAdi + ", yorum=" + yorum + ", yorumTarihi=" + yorumTarihi + "]";
    }

}
