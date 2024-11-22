package day29_mutable_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_StringPool {

    public static void main(String[] args) {

        String str1 = "Ali"; //
        String str2 = "Ali"; //
        String str3 = new String("Ali"); // havuzda degil
        String str4 = "A" + "li"; //
        String s = "A"; //
        String t = "li"; //
        String str5 = s + t ; // havuzda degil
        String r = "ali"; //
        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1); //


        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true

        System.out.println("======================");

        System.out.println(str1 == str2); // Ali h<==>h Ali  ==> true <==> ikisi de havuzda ikisi de Ali
        System.out.println(str1 == str3); // Ali h<==>D Ali  ==> false <==> havuzda olmayan var, sonuc false
        System.out.println(str2 == str4); // Ali h<==>h Ali  ==> true <==> ikisi de havuzda ikisi de Ali
        System.out.println(str2 == r);    // Ali h<==>h ali  ==> false <==> ikisi de havuzda ama metinler farkli false
        System.out.println(str1 == str5); // Ali h<==>D Ali  ==> false <==> havuzda olmayan var, sonuc false
        System.out.println(str1 == str6); // Ali h<==>D Ali  ==> false <==> havuzda olmayan var, sonuc false
        System.out.println(str1 == "Ali"); // Ali h<==>h Ali  ==> true <==> ikisi de havuzda ikisi de Ali


        /*
            equals() sadece metinlere bakar,
            metinler ayni ise true, metinlerde farklilik varsa false verir

            == ise hem metin degerine hem de referansa bakar
            hem metin hem de referans ayni ise sonuc true olur
            metin veya referans degerleri farkli ise sonuc false olur

            Bizim referans degerini bilme sansimiz yok
            onun icin == ile karsilastirmada kontrol etmemiz gereken 2 sart vardir
            1- ikisi de havuzda mi ?
            2- metinler ayni mi ?
            eger bu 2 sorunun da cevabi evet ise sonuc true,
            bu 2 sorudan cevabi hayir olan varsa sonuc false

         */






    }
}
