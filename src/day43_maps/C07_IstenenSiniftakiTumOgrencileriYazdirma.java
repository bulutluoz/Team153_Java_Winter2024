package day43_maps;

import java.util.Set;

public class C07_IstenenSiniftakiTumOgrencileriYazdirma extends MapDepo{

    public static void main(String[] args) {

        // Verilen siniftaki tum ogrencilerin
        // numara, isim, soyisim ve subelerini yazdirin

        int sinif = 11;

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

        // onceki sorularda belirli bir tek numaraya bakiyorduk
        // tum ogrencileri gozden gecirmemiz gerektiginde
        // tum ogrencilerin key'lerini kaydedip
        // bu key'leri tek tek ele alip onceki islemleri yapabiliriz

        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]

        System.out.println(sinif + ". siniftaki ogrenciler");
        // 2.adim herbir key'i ele almak icin
        for (Integer eachKey :ogrenciKeySeti){

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String value = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri yazdir
            // Verilen siniftaki tum ogrencilerin
            // numara, isim, soyisim ve subelerini yazdirin

            if (valueArr[2].equals(sinif+"")){

                System.out.println( eachKey +" "+ valueArr[0] + " " + valueArr[1] +" " +valueArr[3]);

            }

        }

    }
}
