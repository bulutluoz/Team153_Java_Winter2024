package day43_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_OgrenciBilgisineUlasma extends MapDepo{

    public static void main(String[] args) {

        /*
            1- bir ogrencinin bilgisine ulasma
                    1.adim ogrenci no ile value'ye ulasabiliriz
                    2.adim bilgilere erisebilmek icin value'yu split ederiz
                    3.adim istenen bilgileri yazdir
            2- bir ogrencinin bilgisini update etme
                    1.adim ogrenci no ile value'ye ulasabiliriz
                    2.adim bilgilere erisebilmek icin value'yu split ederiz
                    3.adim istenen bilgileri update et
                    4.adim degisiklik array'de yapildi, array'i birlestirip yeni value'yu bulalim
                    5.adim ogrenciNo ve yeniValue ile ogrenciMap'i update et
            3- tum ogrencileri gozden gecirip, istenen ozelliklerdeki ogrencilerin
               istenen ozelliklerini yazdirma
                    1.adim tum key'leri kaydet
                    2.adim herbir key'i ele almak icin for-each loop kullan
                    3.adim ogrenci no ile value'ye ulasabiliriz
                    4.adim bilgilere erisebilmek icin value'yu split ederiz
                    5.adim istenen bilgileri yazdir

            4- tum ogrencileri gozden gecirip, istenen ozelliklerdeki ogrencileri bulup
               bilgilerini verilen yeni degerlere gore update etme
                    1.adim tum key'leri kaydet
                    2.adim herbir key'i ele almak icin for-each loop kullan
                    3.adim ogrenci no ile value'ye ulasabiliriz
                    4.adim bilgilere erisebilmek icin value'yu split ederiz
                    5.adim istenen bilgileri update et
                    6.adim degisiklikler array'de yapildi, array'i birlestirip yeni value'yu bulalim
                    7.adim ogrenciNo ve yeniValue ile ogrenciMap'i update et

         */

        List<String> isimler = new ArrayList<>(Arrays.asList("Canan","Yusuf","Seyyid","Sumeyra","Burak"));

        // Sumeyra ismini Ayse olarak update edin

        isimler.set(3,"Ayse");


        System.out.println(ogrenciMap);

        /*

                {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-TM,
                    103=Ali-Cem-11-K-TM,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ
                    }
         */

        ogrenciMap.put(108,"Berkay-Yilmaz-10-K-MF");
        System.out.println(ogrenciMap);

                /*

                {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-TM,
                    103=Ali-Cem-11-K-TM,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ,
                    108=Berkay-Yilmaz-10-K-MF

                    }
         */

        // 103 numarali ogrencinin ismini yazdirin

        int ogrenciNo = 105;

        //1.adim key 103 ile ogrencinin value'sune ulasabiliriz

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        //2.adim bilgilere ulasabilmek icin split yapalim

        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        //3.adim istenen bilgileri yazdir

        System.out.println(ogrenciNo + " numarali ogrencinin ismi : " + ogrenciValueArr[0]);



    }
}
