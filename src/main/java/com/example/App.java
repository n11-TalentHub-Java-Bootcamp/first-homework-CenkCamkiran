package com.example;

import java.util.List;

import com.Entities.Kategori;
import com.ServiceLayer.KategoriService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        KategoriService kategoriService = new KategoriService();
        List<Kategori> liste = kategoriService.findAll();

        for (Kategori kategori : liste) {
            System.out.println(kategori.getAdi());
        }
    }
}
