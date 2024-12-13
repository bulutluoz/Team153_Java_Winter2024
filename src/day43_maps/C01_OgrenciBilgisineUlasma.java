package day43_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_OgrenciBilgisineUlasma extends MapDepo{

    public static void main(String[] args) {

        /*
            1- bir ogrencinin bilgisine ulasma
            2- bir ogrencinin bilgisini update etme
            3- tum ogrencileri gozden gecirip, istenen ozelliklerdeki ogrencilerin
               istenen ozelliklerini yazdirma
            4- tum ogrencileri gozden gecirip, istenen ozelliklerdeki ogrencileri bulup
               bilgilerini verilen yeni degerlere gore update etme
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
