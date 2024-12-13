package day43_maps;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }

    public static void numaradanIsimYazdirma(int ogrenciNo){
        //1.adim key 103 ile ogrencinin value'sune ulasabiliriz

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        //2.adim bilgilere ulasabilmek icin split yapalim

        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        //3.adim istenen bilgileri yazdir

        System.out.println(ogrenciNo + " numarali ogrencinin ismi : " + ogrenciValueArr[0]);
    }

    public static void numaradanIsimSoyisimYazdirma(int ogrenciNo){
        // 1.adim ogrenci no ile value'ye ulasabiliriz
        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Sevgi-Cem-11-M-TM

        // 2.adim bilgilere erisebilmek icin value'yu split ederiz
        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        // 3.adim istenen bilgileri yazdir

        System.out.println(ogrenciNo + " numarali ogrencinin isim ve soyismi : " +
                ogrenciValueArr[0] + " " + ogrenciValueArr[1]);
    }


}
