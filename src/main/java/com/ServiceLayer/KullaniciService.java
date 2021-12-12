package com.ServiceLayer;

import java.util.List;

import com.DTO.KullaniciYorumSayisiDto;
import com.DataAccessLayer.KullaniciDal;

public class KullaniciService {
    private KullaniciDal kullaniciDal;

    public KullaniciService() {
        kullaniciDal = new KullaniciDal();
    }

    public List<KullaniciYorumSayisiDto> findAllKullaniciYorumlar() {
        return kullaniciDal.findAllKullaniciYorumlar();
    }

    public List<KullaniciYorumSayisiDto> findKullaniciYorumlar(Long id) {
        return kullaniciDal.findKullaniciYorumlar(id);
    }
}
