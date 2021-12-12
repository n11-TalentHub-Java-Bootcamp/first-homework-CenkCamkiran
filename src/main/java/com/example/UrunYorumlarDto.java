package com.example;

import java.util.List;
import com.ServiceLayer.YorumService;
import com.DTO.UrunYorumDto;

public class UrunYorumlarDto {
    public static void main(String[] args) {

        YorumService yorumService = new YorumService();

        List<UrunYorumDto> urunyorumlar = yorumService.findAllUrunYorumlar();

        for (UrunYorumDto yorumlar : urunyorumlar) {
            System.out.println(yorumlar);
        }

        System.out.println("*******************************************************");

        List<UrunYorumDto> urunyorum = yorumService.findUrunYorumlar(1L);

        for (UrunYorumDto yorum : urunyorum) {
            System.out.println(yorum);
        }

    }
}
