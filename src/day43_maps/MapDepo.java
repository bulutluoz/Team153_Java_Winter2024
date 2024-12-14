package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    static protected Map<Integer,String> ogrenciMap = new HashMap<>();

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

    public static void bolumListesiOlustur(String istenenBolum){
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

    public static void isimVeSoyisimIleOgrenciBulma(String arananIsim, String arananSoyisim) {
        // 1.adim tum key'leri kaydet
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2.adim herbir key'i ele almak icin for-each loop kullan

        for (Integer eachKey : ogrenciKeySeti) { // ogrenciNo ==> eachKey

            // 3.adim ogrenci no ile value'ye ulasabiliriz
            String value = ogrenciMap.get(eachKey);

            // 4.adim bilgilere erisebilmek icin value'yu split ederiz
            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            // 5.adim istenen bilgileri yazdir
            // ismi ve soyismi verilen ogrencinin
            // Numara, sinif, sube , isim ve soyisim bilgilerini liste olarak yazdirin

            if (valueArr[0].equalsIgnoreCase(arananIsim) && valueArr[1].equalsIgnoreCase(arananSoyisim)) {

                System.out.println(eachKey + " " + valueArr[2] + " " + valueArr[3] + " " +
                        valueArr[0] + " " + valueArr[1]);
            }

        }
    }

    public static void verilenBolumuYenisiyleDegistir(String eskiBolum, String yeniBolum){
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

    }

    public static void yilSonuSiniflariArtirma(){
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

    }

}
