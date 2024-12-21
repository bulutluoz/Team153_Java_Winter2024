package day44_mapsUpdate_nestedMap;

import day43_maps.MapDepo;

import java.util.Set;

public class C01_BolumleriUpdateEtme extends MapDepo {

    public static void main(String[] args) {

        // tum ogrencileri gozden gecirip
        // eski bolumu verilen ogrencilerin bolumunu
        // verilen yeni bolum ile update edin

        String eskiBolum = "MF";
        String yeniBolum = "Say";

        //  1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        //  2.adim herbir key'i ele almak icin for-each loop kullan

        for (Integer eachKey :ogrenciKeySeti){

            //  3.adim ogrenci no ile value'ye ulasabiliriz
            String eachValue = ogrenciMap.get(eachKey);

            //  4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            //  5.adim istenen bilgileri update et
            // eski bolumu verilen ogrencilerin bolumunu
            // verilen yeni bolum ile update edin
            if (eachValueArr[4].equalsIgnoreCase(eskiBolum)){
                eachValueArr[4] = yeniBolum;
            } // [Ali, Can, 11, H, Say]


            //  6.adim degisiklikler array'de yapildi, array'i birlestirip yeni value'yu bulalim
            String yeniValue = String.join("-",eachValueArr); // Ali-Can-11-H-Say

            //  7.adim ogrenciNo ve yeniValue ile ogrenciMap'i update et
            ogrenciMap.put(eachKey,yeniValue);
        }

        System.out.println(ogrenciMap);

    }
}
