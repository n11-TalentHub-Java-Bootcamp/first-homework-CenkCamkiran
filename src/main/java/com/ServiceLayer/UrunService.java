package com.ServiceLayer;

import java.math.BigDecimal;
import java.util.List;

import com.DTO.UrunDetayDto;
import com.DTO.UrunYorumSayisiDto;
import com.DataAccessLayer.UrunDal;
import com.Entities.Urun;

public class UrunService {

    private UrunDal urunDal;

    public UrunService() {
        urunDal = new UrunDal();
    }

    public List<Urun> findAll() {
        return urunDal.findAll();
    }

    public Urun findById(Long id) {
        return urunDal.findById(id);
    }

    public List<Urun> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe) {
        return urunDal.findAllUrunListByFiyatGeAndFiyatLe(fiyatGe, fiyatLe);
    }

    public List<Urun> findAllUrunListByFiyatBetween(BigDecimal fiyatGe, BigDecimal fiyatLe) {
        return urunDal.findAllUrunListByFiyatBetween(fiyatGe, fiyatLe);
    }

    public List<Urun> findAllUrunByKategoriKirilim(Long kirilim) {
        return urunDal.findAllUrunByKategoriKirilim(kirilim);
    }

    public List<UrunDetayDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim) {
        return urunDal.findAllUrunDetayDtoByKategoriKirilim(kirilim);
    }

    public List<UrunYorumSayisiDto> findUrunYorumSayisiById(Long id) {
        return urunDal.findUrunYorumSayisiById(id);
    }

    public List<UrunYorumSayisiDto> findUrunYorumSayisi() {
        return urunDal.findUrunYorumSayisi();
    }

}
