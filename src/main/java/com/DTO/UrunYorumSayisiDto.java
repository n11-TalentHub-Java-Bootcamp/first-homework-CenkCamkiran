package com.DTO;

import java.math.BigDecimal;

public class UrunYorumSayisiDto {

    private Long urunId;
    private BigDecimal fiyat;
    private Long yorumSayisi;
    private String urunAdi;

    public UrunYorumSayisiDto(Long urunId, BigDecimal fiyat, Long yorumSayisi, String urunAdi) {
        this.urunId = urunId;
        this.fiyat = fiyat;
        this.yorumSayisi = yorumSayisi;
        this.urunAdi = urunAdi;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Long getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(Long yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    @Override
    public String toString() {
        return "UrunYorumSayisiDto [fiyat=" + fiyat + ", urunAdi=" + urunAdi + ", urunId=" + urunId + ", yorumSayisi="
                + yorumSayisi + "]";
    }

}
