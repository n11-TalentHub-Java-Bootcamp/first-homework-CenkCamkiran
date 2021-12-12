package com.example;

import com.Entities.Urun;
import com.ServiceLayer.UrunService;
import java.math.BigDecimal;
import java.util.List;

public class FindBetweenApp {

    public static void main(String[] args) {

        UrunService service = new UrunService();
        List<Urun> urunList = service.findAllUrunListByFiyatBetween(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
