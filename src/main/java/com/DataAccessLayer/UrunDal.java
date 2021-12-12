package com.DataAccessLayer;

import java.math.BigDecimal;
import java.util.List;

import com.DBConnection.DBConnection;
import com.DTO.UrunDetayDto;
import com.DTO.UrunYorumDto;
import com.DTO.UrunYorumSayisiDto;
import com.Entities.Urun;

import org.hibernate.query.Query;

public class UrunDal extends DBConnection {

    public List<Urun> findAll() {

        String sql = "select urun from Urun urun";

        Query query = GetSession().createQuery(sql);

        return query.list();
    }

    public Urun findById(Long id) {

        String sql = "select urun from Urun urun where urun.id = :givenId";

        Query query = GetSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (Urun) query.uniqueResult();
    }

    public List<Urun> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe) {

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null) {
            sql = sql + " and urun.fiyat >= :fiyatGe ";
        }

        if (fiyatLe != null) {
            sql = sql + " and urun.fiyat <= :fiyatLe ";
        }

        Query query = GetSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Urun> findAllUrunListByFiyatBetween(BigDecimal fiyatGe, BigDecimal fiyatLe) {

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null && fiyatLe != null) {
            sql = sql + " and urun.fiyat between :fiyatGe and :fiyatLe ";
        }

        Query query = GetSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Urun> findAllUrunByKategoriKirilim(Long kirilim) {

        String sql = " select urun from Urun urun " +
                " left join Kategori kategori  on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = GetSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

    public List<UrunDetayDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim) {

        String sql = " select " +
                " new com.DTO.UrunDetayDto( urun.adi, kategori.adi, urun.fiyat ) " +
                " from Urun urun " +
                " left join Kategori kategori on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = GetSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

    public List<UrunYorumDto> findAllUrunYorumlar() {
        String sql = " select " +
                " new com.DTO.UrunYorumDto( urun.adi, kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, yorum.yorum, yorum.yorum_tarihi ) "
                +
                " from Urun urun " +
                " inner join Kategori kategori on urun.kategori.id = kategori.id " +
                " inner join UrunYorum yorum on yorum.urun.id = urun.id " +
                " inner join Kullanici kullanici on yorum.kullanici.id = kullanici.id ";

        Query query = GetSession().createQuery(sql);

        return query.list();
    }

    public List<UrunYorumDto> findUrunYorumlar(Long id) {
        String sql = " select " +
                " new com.DTO.UrunYorumDto( urun.adi, kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, yorum.yorum, yorum.yorum_tarihi ) "
                +
                " from Urun urun " +
                " inner join Kategori kategori on urun.kategori.id = kategori.id " +
                " inner join UrunYorum yorum on yorum.urun.id = urun.id " +
                " inner join Kullanici kullanici on yorum.kullanici.id = kullanici.id " +
                " where urun.id = :id ";

        Query query = GetSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }

    public List<UrunYorumSayisiDto> findUrunYorumSayisiById(Long id) {
        String sql = " select new com.DTO.UrunYorumSayisiDto(urun.id, urun.fiyat, count(yorum.yorum), urun.adi) " +
                " from Urun urun" +
                " left join UrunYorum yorum on yorum.urun.id = urun.id " +
                " where urun.id = :id " +
                " group by urun.id ";

        Query query = GetSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }

    public List<UrunYorumSayisiDto> findUrunYorumSayisi() {
        String sql = " select new com.DTO.UrunYorumSayisiDto(urun.id, urun.fiyat, count(yorum.yorum), urun.adi) " +
                " from Urun urun " +
                " left join UrunYorum yorum on yorum.urun.id = urun.id " +
                " group by urun.id ";

        Query query = GetSession().createQuery(sql);

        return query.list();
    }

}
