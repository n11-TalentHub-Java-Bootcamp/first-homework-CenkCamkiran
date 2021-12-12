package com.example;

import java.util.List;

import com.DTO.KullaniciYorumSayisiDto;
import com.ServiceLayer.KullaniciService;

public class KullaniciYorumlarDto {
    public static void main(String[] args) {

        KullaniciService kullaniciService = new KullaniciService();
        List<KullaniciYorumSayisiDto> tumYorumlar = kullaniciService.findAllKullaniciYorumlar();

        for (KullaniciYorumSayisiDto kullaniciYorumlar : tumYorumlar) {
            System.out.println(kullaniciYorumlar);
        }

        System.out.println("************************************************************************************* \n");
        // ***********************************************************************************

        List<KullaniciYorumSayisiDto> kullaniciYorumlar = kullaniciService.findKullaniciYorumlar(3L);

        for (KullaniciYorumSayisiDto yorum : kullaniciYorumlar) {
            System.out.println(yorum);
        }

    }
}
