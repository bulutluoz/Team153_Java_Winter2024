package day44_mapsUpdate_nestedMap;

import day43_maps.MapDepo;

import java.util.Set;

public class C04_SoyisimleriBuyukHarfYap extends MapDepo {

    public static void main(String[] args) {

        // tum ogrencilerin soyisimlerini
        // tamamen buyuk harf olarak guncelleyin


        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2.adim herbir key'i ele almak icin for-each loop kullan

        for (Integer eachKey : ogrenciKeySeti){

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String eachValue = ogrenciMap.get(eachKey);

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri update et
            // tum ogrencilerin soyisimlerini
            // tamamen buyuk harf olarak guncelleyin
            eachValueArr[1] = eachValueArr[1].toUpperCase();

            // 6.adim degisiklikler array'de yapildi, array'i birlestirip yeni value'yu bulalim
            String yeniValue = String.join("-",eachValueArr);

            // 7.adim ogrenciNo ve yeniValue ile ogrenciMap'i update et
            ogrenciMap.put(eachKey,yeniValue);

        }

        System.out.println(ogrenciMap);

    }
}
