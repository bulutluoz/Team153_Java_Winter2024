package day43_maps;

import java.util.Set;

public class C08_BolumListesiYazdir extends MapDepo {

    public static void main(String[] args) {

        // Verilen bolumdeki tum ogrencileri
        // numara, sinif, isim, soyisim'lerini yazdirin

        String istenenBolum = "TM";


        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2.adim herbir key'i ele almak icin for-each loop kullan
        System.out.println(istenenBolum + " Bolumundeki ogrenci listesi");
        for (Integer eachKey: ogrenciKeySeti){

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String value = ogrenciMap.get(eachKey);

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri yazdir
            // Verilen bolumdeki tum ogrencileri
            // numara, sinif, isim, soyisim'lerini yazdirin

            if (valueArr[4].equals(istenenBolum)){
                System.out.println( eachKey + " " + valueArr[2] + " " + valueArr[0] + " " + valueArr[1]);
            }

        }



    }
}
