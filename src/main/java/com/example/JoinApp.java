package com.example;

import java.util.List;

import com.Entities.Urun;
import com.ServiceLayer.UrunService;

public class JoinApp {

    public static void main(String[] args) {

        UrunService service = new UrunService();
        List<Urun> urunList = service.findAllUrunByKategoriKirilim(3L);
//
        for (Urun urun : urunList) {
            System.out.println("***************************************************");
            System.out.println(urun);
            System.out.println("***************************************************");
        }
    }
}
