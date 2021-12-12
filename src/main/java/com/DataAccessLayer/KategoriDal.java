package com.DataAccessLayer;

import java.util.List;

import com.DBConnection.DBConnection;
import com.Entities.Kategori;
import org.hibernate.query.Query;

public class KategoriDal extends DBConnection {

    public List<Kategori> findAll() {
        Query query = GetSession().createQuery("select kategori from Kategori kategori");

        return query.list();

    }

}
