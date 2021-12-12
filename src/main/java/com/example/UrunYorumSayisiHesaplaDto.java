package com.example;

import java.util.List;

import com.DTO.UrunYorumSayisiDto;
import com.ServiceLayer.UrunService;

public class UrunYorumSayisiHesaplaDto {
    public static void main(String[] args) {

        UrunService service = new UrunService();
        List<UrunYorumSayisiDto> liste = service.findUrunYorumSayisiById(1L);

        for (UrunYorumSayisiDto yorumsayisi : liste) {
            System.out.println(yorumsayisi);
        }

        System.out.println("****************************************************************");

        List<UrunYorumSayisiDto> liste2 = service.findUrunYorumSayisi();

        for (UrunYorumSayisiDto yorumsayisi : liste2) {
            System.out.println(yorumsayisi);
        }
    }

}
