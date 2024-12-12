package day42_collections_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Map {

    public static void main(String[] args) {
        /*
            Map'i olusturmadan once su sorularin cevaplarini belirlemeliyiz
            1- Key hangi bilgi olacak ==> Ogrenci No
            2- Kalan bilgileri nasil tek bir value haline getiririz? ==> String olarak birlestirelim
            3- Bilgilere daha sonra ulasabilmemiz icin, bilgileri bir duzen icinde birlestirmeliyiz
               bilgileri hangi sira ile birlestirelim ? ==> isim, soyisim, sinif, sube, bolum
               bilgilerin karismamasi icin araya nasil bir ayirac koyalim ? ==>   -
         */

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        // daha fazla bilgi koymak iyi mi kotu mu ? ==>
        // bilginin fazla olmasi kesinlikle daha iyidir
        // ammmaaa bilgi fazla oldukca, bilgiye erismek ve kullanmak emek isteyecektir

        System.out.println(ogrenciMap);

        /*
            {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF
                }
         */

        /*
            Map'de key ve value ayri yapilardir
            ve map'de index yapisi yoktur
         */

        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF
        System.out.println(ogrenciMap.get(102)); // Veli-Cem-10-K-TM
        System.out.println(ogrenciMap.get(110)); // null

        System.out.println(ogrenciMap.getOrDefault(103, "girilen numaraya sahip ogrenci yok"));
        // Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.getOrDefault(107, "girilen numaraya sahip ogrenci yok"));
        // girilen numaraya sahip ogrenci yok


        ogrenciMap.putIfAbsent(103,"yeni deger"); // 103 var, bir islem yapmaz
        ogrenciMap.putIfAbsent(105,"Yigit-Han-12-K-TM"); // 105 yok, bu kaydi map'e ekler

        System.out.println(ogrenciMap);

        /*
                {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Yigit-Han-12-K-TM
                }
         */

        System.out.println(ogrenciMap.containsKey(104)); // true
        System.out.println(ogrenciMap.containsKey(107)); // false


        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value'su "Ali" olan bir key var mi ?
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true
        // containsValue() bir butun olarak value'leri gozden gecirir
        // valulerin icindeki metin parcalarina bakmaz

        System.out.println(ogrenciMap.size()); // 5

        ogrenciMap.replace(103,"Ali-Han-11-P-TM");
        ogrenciMap.put(104,"Ayse-Han-11-P-TM");
        // var olan bir eleman icin replace ile put ayni islemi yapar

        System.out.println(ogrenciMap);
                /*
                {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Han-11-P-TM,
                104=Ayse-Han-11-P-TM,
                105=Yigit-Han-12-K-TM
                }
         */

        ogrenciMap.replace(107,"Ali-Yan-10-K-TM"); // 107'nin bilgisini guncelle , 107 yok ki guncelleyeyim dediu
        ogrenciMap.put(108,"Ayse-Fan-10-P-TM"); // 108'i ekle deyince, ekledi

        /*
            put ==> key varsa gunceller, yoksa yeni kayit ekler
            replace ==> key varsa gunceller, yoksa islem yapmaz
         */

        System.out.println(ogrenciMap);
                /*
                {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Han-11-P-TM,
                104=Ayse-Han-11-P-TM,
                105=Yigit-Han-12-K-TM
                }
         */

        System.out.println(ogrenciMap.keySet());
        //[101, 102, 103, 104, 105, 108]
        // tum key'leri bir Set olarak getiriyor


        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Han-11-P-TM, Ayse-Han-11-P-TM, Yigit-Han-12-K-TM, Ayse-Fan-10-P-TM]
        // tum value'leri bir Collection olarak getirir


        // Map'in tum elemanlarini gozden gecirmek istersek
        // Map'de bu islemi direkt yapmamiz mumkun degil
        // Eger sadece value'ler lazimsa, value'leri bir collection olarak kaydedip
        // for-each loop ile gozden gecirebiliriz

        // Key'ler de lazimsa
        // Key'leri bir Set olarak kaydedip
        // Key'leri for-each loop ile gozden geciririz,
        // her bir key'i ele aldigimizda ona ait value'yu ogrenciMap.get(eachKey) ile ele alabiliriz
    }
}
