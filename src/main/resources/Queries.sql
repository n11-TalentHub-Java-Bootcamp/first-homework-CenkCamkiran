select urun.id, urun.adi as urun_adi, kategori.adi as kategori_adi, urun.fiyat, kullanici.adi, 
kullanici.soyadi, kullanici.email, kullanici.telefon, yorum.yorum, 
yorum.yorumtarihi
from Urun urun
inner join Kategori kategori on urun.kategori_id = kategori.id
inner join UrunYorum yorum on yorum.urun_id = urun.id
inner join Kullanici kullanici on yorum.kullanici_id = kullanici.id
where urun.id = 1