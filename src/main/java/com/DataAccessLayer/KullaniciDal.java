package com.DataAccessLayer;

import java.util.List;

import com.DBConnection.DBConnection;
import com.DTO.KullaniciYorumSayisiDto;

import org.hibernate.query.Query;

public class KullaniciDal extends DBConnection {

    public List<KullaniciYorumSayisiDto> findAllKullaniciYorumlar() {
        String sql = " select " +
                " new com.DTO.KullaniciYorumSayisiDto( kullanici.id, kullanici.adi, urun.adi, yorum.yorum, yorum.yorum_tarihi ) "
                +
                " from Kullanici kullanici " +
                " inner join UrunYorum yorum on yorum.kullanici.id = kullanici.id " +
                " inner join Urun urun on urun.id = yorum.urun.id";

        Query query = GetSession().createQuery(sql);

        return query.list();
    }

    public List<KullaniciYorumSayisiDto> findKullaniciYorumlar(Long id) {
        String sql = " select " +
                " new com.DTO.KullaniciYorumSayisiDto( kullanici.id, kullanici.adi, urun.adi, yorum.yorum, yorum.yorum_tarihi ) "
                +
                " from Kullanici kullanici " +
                " inner join UrunYorum yorum on yorum.kullanici.id = kullanici.id " +
                " inner join Urun urun on urun.id = yorum.urun.id " +
                " where kullanici.id = :id ";

        Query query = GetSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }

}
