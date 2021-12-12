package com.example;

import com.Entities.Urun;
import com.ServiceLayer.UrunService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        UrunService service = new UrunService();
        List<Urun> urunList = service.findAll();

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
