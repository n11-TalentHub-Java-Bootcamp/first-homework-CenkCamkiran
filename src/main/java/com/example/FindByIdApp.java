package com.example;

import com.Entities.Urun;
import com.ServiceLayer.UrunService;

public class FindByIdApp {

    public static void main(String[] args) {
        UrunService service = new UrunService();
        Urun urun = service.findById(2L);

        System.out.println(urun);
    }
}
