package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public static void numaraIleSoyisimUpdateEt(int ogrenciNo, String yeniSoyisim){
        //1.adim ogrenciNo ile value'ye ulas
        String eskiValue = ogrenciMap.get(ogrenciNo); // Veli-Cem-10-K-TM

        //2.adim bilgilere erismek icin split
        String[] eskiValueArr = eskiValue.split("-"); //  [Veli, Cem, 10, K, TM]

        //3.adim artik soyismi guncelleyebiliriz
        eskiValueArr[1] = yeniSoyisim; //  [Veli, Yilmaz, 10, K, TM]

        //4.adim array'de yaptigimiz guncellemeyi map'e islemeliyiz
        //        map'i guncellemek icin key ==> ogrenciNo
        //                        yeni value ==> eski value arr'inin birlestirilmis hali

        String yeniValue = String.join("-",eskiValueArr); //  Veli-Yilmaz-10-K-TM

        ogrenciMap.put(ogrenciNo,yeniValue);
    }

    public static void numaraIleBolumUpdateEt(int ogrenciNo, String yeniBolum){
        // 1.adim numara ile value'e ulasabilirim
        String eskiValue = ogrenciMap.get(ogrenciNo); // Sevgi-Cem-11-M-TM

        // 2.adim bilgilere ulasabilmek icin split yapalim
        String[] eskiValueArr = eskiValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        // 3.adim artik bolumu update edebiliriz
        eskiValueArr[4] = yeniBolum;  // [Sevgi, Cem, 11, M, MF]

        // 4.adim degisiklik array'de yapildi
        //        array'i birlestirip yeni value'yu bulalim
        String yeniValue = String.join("-",eskiValueArr); // Sevgi-Cem-11-M-MF

        // 5.adim ogrenci no ve yeni value ile map'i update edelim
        ogrenciMap.put(ogrenciNo,yeniValue);
    }

    public static void numaraIleSinifVeSubeUpdateEt(int ogrenciNo, int yeniSinif, String yeniSube){
        // 1.adim numara ile value'e ulasabilirim
        String eskiValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2.adim bilgilere ulasabilmek icin split yapalim
        String[] eskiValueArr = eskiValue.split("-"); // [Ali, Cem, 11, K, TM]

        // 3.adim istenen bilgileri update et
        eskiValueArr[2] = yeniSinif+"" ;
        eskiValueArr[3] = yeniSube;
        // [Ali, Cem, 11, P, TM]

        // 4.adim degisiklik array'de yapildi
        //        array'i birlestirip yeni value'yu bulalim
        String yeniValue = String.join("-",eskiValueArr); // Ali-Cem-11-P-TM

        // 5.adim ogrenci no ve yeni value ile map'i update edelim
        ogrenciMap.put(ogrenciNo,yeniValue);

    }

    public static void sinifListesiYazdir(int sinif) {
        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]

        System.out.println(sinif + ". siniftaki ogrenciler");
        // 2.adim herbir key'i ele almak icin
        for (Integer eachKey : ogrenciKeySeti) {

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String value = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri yazdir
            // Verilen siniftaki tum ogrencilerin
            // numara, isim, soyisim ve subelerini yazdirin

            if (valueArr[2].equals(sinif + "")) {

                System.out.println(eachKey + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[3]);

            }
        }
    }

}
