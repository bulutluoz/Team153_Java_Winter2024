package day43_maps;

public class C02_MethodlariKullanma extends MapDepo {
    public static void main(String[] args) {

        // 104 numarali ogrencinin ismini yazdirin
        MapDepo.numaradanIsimYazdirma(104);
        // 104 numarali ogrencinin ismi : Ayse


        // 106 numarali ogrencinin isim ve soyismini yazdirin
        MapDepo.numaradanIsimSoyisimYazdirma(106);
        // 106 numarali ogrencinin isim ve soyismi : Sevgi Can


        // 103 numarali ogrencinin soyismini Onal
        // 104 numarali ogrencinin soyismini Celik yapsin

        MapDepo.numaraIleSoyisimUpdateEt(103,"Onal");
        MapDepo.numaraIleSoyisimUpdateEt(104,"Celik");

        System.out.println(ogrenciMap);

        /*
                {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-TM,
                    103=Ali-Onal-11-K-TM,
                    104=Ayse-Celik-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ
                    }

         */

        // 10.siniftaki ogrencileri yazdirin

        MapDepo.sinifListesiYazdir(10);
        //10. siniftaki ogrenciler
        //102 Veli Cem K
        //104 Ayse Celik H
        //106 Sevgi Can K


        // MF bolumundeki ogrencileri yazdirin
        MapDepo.bolumListesiOlustur("MF");

        //MF Bolumundeki ogrenci listesi
        //101 11 Ali Can
        //104 10 Ayse Celik
        //106 10 Sevgi Can

    }
}
