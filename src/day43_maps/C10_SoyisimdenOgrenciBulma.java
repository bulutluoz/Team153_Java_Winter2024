package day43_maps;

import java.util.Set;

public class C10_SoyisimdenOgrenciBulma extends MapDepo{

    public static void main(String[] args) {

        // Verilen soyisme sahip ogrencilerin
        // numara, sinif, sube , isim ve soyisimlerini yazdirin
        String verilenSoyisim = "Can";


        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2.adim herbir key'i ele almak icin for-each loop kullan

        for (Integer eachKey :ogrenciKeySeti){ // ogrenciNo ==> eachKey

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String value = ogrenciMap.get(eachKey);

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri yazdir
            // Verilen soyisme sahip ogrencilerin
            // numara, sinif, sube , isim ve soyisimlerini yazdirin

            if ( valueArr[1].equalsIgnoreCase(verilenSoyisim)){

                System.out.println( eachKey + " " + valueArr[2] + " "+ valueArr[3] + " " +
                        valueArr[0] + " " + valueArr[1]);
            }



        }


    }
}
