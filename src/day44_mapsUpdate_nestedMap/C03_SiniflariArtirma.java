package day44_mapsUpdate_nestedMap;

import day43_maps.MapDepo;

import java.util.Set;

public class C03_SiniflariArtirma extends MapDepo {

    public static void main(String[] args) {

        // yil sonu icin tum ogrencilerin siniflarini bir artirin
        // 12.siniftakilerin sinif bilgisi olarak Mezun yazin
        // mezun olanlara bir islem yapmayin

        System.out.println(ogrenciMap);

        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2.adim herbir key'i ele almak icin for-each loop kullan

        for (Integer eachKey :ogrenciKeySeti){

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String eachValue = ogrenciMap.get(eachKey);

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri update et
            // yil sonu icin tum ogrencilerin siniflarini bir artirin
            // 12.siniftakilerin sinif bilgisi olarak Mezun yazin
            // mezun olanlara bir islem yapmayin

            String eskiSinif = eachValueArr[2];

            switch (eskiSinif){

                case "9" :
                    eachValueArr[2] = "10";
                    break;
                case "10" :
                    eachValueArr[2] = "11";
                    break;
                case "11" :
                    eachValueArr[2] = "12";
                    break;
                case "12" :
                    eachValueArr[2] = "Mezun";
                    break;
            }

            // 6.adim degisiklikler array'de yapildi, array'i birlestirip yeni value'yu bulalim
            String yeniValue = String.join("-",eachValueArr);

            // 7.adim ogrenciNo ve yeniValue ile ogrenciMap'i update et
            ogrenciMap.put(eachKey,yeniValue);

        }

        System.out.println(ogrenciMap);

        yilSonuSiniflariArtirma();

        System.out.println(ogrenciMap);
    }
}
