package day31_strinBuilder_accessModifier;

public class C03_StringMethodlari {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir");
        /*
            1- StringBuilder'da olmayan ama String'de olan method'lari kullanmak icin
               toString() ile String'e cevirebiliriz

            2- Kullandigimiz hazir method'lar
               StringBuilder donduruyorsa yapilan degisiklik KALICI olur
               (append, insert, replace...)
               ANNNCAAAKKK baska data turunde bir deger donduruyorsa
               yapilan degisiklik kalici olmaz
               (charAt, substring, indexOf...)
         */


        // sb'de "a" harfi var mi ?
        System.out.println(sb.toString().contains("a")); // true


        System.out.println(sb.substring(4)); //  Candir

        // sb kalici olarak degisti mi ?
        System.out.println(sb); // Java Candir

        System.out.println(sb.length()); // 11

        System.out.println(sb.indexOf("a")); // 1
        System.out.println(sb.lastIndexOf("a")); // 6






    }
}
