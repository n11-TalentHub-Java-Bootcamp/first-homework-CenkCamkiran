CREATE TABLE public.KATEGORI
(
    ID numeric(19) NOT NULL,
    KIRILIM numeric(2) NOT NULL,
    ADI character(50) NOT NULL,
    UST_KATEGORI_ID numeric(19) REFERENCES KATEGORI(ID) MATCH SIMPLE,
    PRIMARY KEY (ID)
);


CREATE TABLE PUBLIC.URUN 
(
    ID NUMERIC(19) NOT NULL,
    ADI CHARACTER(50) NOT NULL,
    FIYAT NUMERIC(19,2) NOT NULL,
    KAYIT_TARIHI TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_DATE,
    KATEGORI_ID NUMERIC(19) NOT NULL REFERENCES KATEGORI(ID) MATCH SIMPLE,
    PRIMARY KEY (ID)
);


INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    1    ,    1    ,'Moda',    null    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    2    ,    1    ,'Elektronik',    null    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    3    ,    1    ,'Ev & Yaşam',    null    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    4    ,    2    ,'Elbise',    1    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    5    ,    2    ,'Gömlek',    1    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    6    ,    2    ,'Bilgisayar',    2    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    7    ,    3    ,'Dizüstü Bilgisayar',    6    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    8    ,    2    ,'Mobilya',    3    );
INSERT INTO public.kategori(id, kirilim, adi, ust_kategori_id) VALUES (    9    ,    3    ,'Sehpa',    8    );
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    1    ,'Mavi Elbise',    200    , now(),     4);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    2    ,'Kırmızı Elbise',    300    , now(),     4);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    3    ,'Mavi Gömlek',    500    , now(),     5);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    4    ,'Sarı Gömlek',    450    , now(),     5);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    5    ,'HP ',    15000    , now(),     7);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    6    ,'MSI',    20000    , now(),     7);
INSERT INTO public.URUN( ID, ADI, FIYAT, KAYIT_TARIHI, KATEGORI_ID) VALUES (    7    ,'Orta Sehpa',    600    , now(),     9);
