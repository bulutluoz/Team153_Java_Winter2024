package day44_mapsUpdate_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class NestedMapDepo {

    /*
        sinifMap= { 101={Isim=Ali, soyisim=Can, sinif=10, sube=H, bolum=MF },

     */
    static protected Map<Integer, Map<String,String> > ogrenciNestedMap = new HashMap<>();

    static {

        Map<String,String> ogrenci101Map = new HashMap<>();
        ogrenci101Map.put("isim","Ali");
        ogrenci101Map.put("soyisim","Can");
        ogrenci101Map.put("sinif","11");
        ogrenci101Map.put("sube","H");
        ogrenci101Map.put("bolum","MF");

        ogrenciNestedMap.put(101,ogrenci101Map);

        mapeOgrenciEkle(102,"Veli","Cem","10","K","TM");
        mapeOgrenciEkle(103,"Ali","Cem","11","K","TM");
        mapeOgrenciEkle(104,"Ayse","Can","10","H","MF");
        mapeOgrenciEkle(105,"Sevgi","Cem","11","M","TM");
        mapeOgrenciEkle(106,"Sevgi","Can","10","K","MF");
        mapeOgrenciEkle(107,"Esra","Han","11","M","SOZ");

    }

    public static void mapeOgrenciEkle(int ogrNo, String isim, String soyisim, String sinif, String sube,String bolum){
        Map<String,String> eklenecekOgrenciMap = new HashMap<>();
        eklenecekOgrenciMap.put("isim",isim);
        eklenecekOgrenciMap.put("soyisim",soyisim);
        eklenecekOgrenciMap.put("sinif",sinif);
        eklenecekOgrenciMap.put("sube",sube);
        eklenecekOgrenciMap.put("bolum",bolum);

        ogrenciNestedMap.put(ogrNo,eklenecekOgrenciMap);

    }
}
