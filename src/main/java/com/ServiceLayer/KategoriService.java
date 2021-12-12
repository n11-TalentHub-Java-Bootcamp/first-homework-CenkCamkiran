package com.ServiceLayer;

import java.util.List;

import com.DataAccessLayer.KategoriDal;
import com.Entities.Kategori;

public class KategoriService {
    
    private KategoriDal kategoriDal;

    public KategoriService(){
        kategoriDal = new KategoriDal();
    }

    public List<Kategori> findAll(){
        return kategoriDal.findAll();
    }
}
