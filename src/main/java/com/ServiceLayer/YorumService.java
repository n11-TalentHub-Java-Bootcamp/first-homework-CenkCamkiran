package com.ServiceLayer;

import java.util.List;

import com.DTO.UrunYorumDto;
import com.DataAccessLayer.UrunDal;

public class YorumService {
    private UrunDal urunDal;

    public YorumService() {
        urunDal = new UrunDal();
    }

    public List<UrunYorumDto> findAllUrunYorumlar() {
        return urunDal.findAllUrunYorumlar();
    }

    public List<UrunYorumDto> findUrunYorumlar(Long id) {
        return urunDal.findUrunYorumlar(id);
    }
}
