package day31_strinBuilder_accessModifier;

public class C04_Karsilastirma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Ali");
        StringBuilder sb2 = new StringBuilder("Ali");

        String str = "Ali";

        // == ile karsilastirma
        // non-primitive data turlerinde farkli data turlerini == ile KARSILASTIRAMAYIZ

        // System.out.println(  sb1 == str  );
        // Operator '==' cannot be applied to 'StringBuilder', 'String'

        System.out.println( sb1 == sb2  ); // false
        // 2 StringBuilder == ile karsilastirilirsa
        // Java CTE vermez ama sonuc DAIMA false olur
        System.out.println(sb1 == sb1); // true

        System.out.println("==============");

        // equals ile karsilastirma

        System.out.println(sb1.equals(str)); // false
        // Java CTE vermez ama sonuc DAIMA false olur

        System.out.println(sb1.equals(sb2)); // false
        // Suspicious call to 'equals()' on 'StringBuilder' object
        // Sonuc yine false olur ancak 1 istisna var
        System.out.println(sb1.equals(sb1)); // true

        System.out.println("==============");


        // StringBuilder'da metinleri nasil birbiriyle karsilastiracagiz ?

        System.out.println(sb1.toString().equals(str)); // true
        System.out.println(sb1.toString().equals(sb2.toString())); // true


        // StringBuilder method'lariyla yapmak istersek

        System.out.println(sb1.compareTo(sb2)); // Ali <==> Ali ==> 0


        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Hava");
        StringBuilder sb5 = new StringBuilder("Hala");
        StringBuilder sb6 = new StringBuilder("Kala");
        StringBuilder sb7 = new StringBuilder("kala");

        System.out.println(sb3.compareTo(sb4)); // Java <==> Hava  ==>2
        System.out.println(sb4.compareTo(sb5)); // Hava <==> Hala  ==>10  v u t s r q p o n m l
        System.out.println(sb5.compareTo(sb6)); // Hala <==> Kala  ==>-3  H I J K
        System.out.println(sb6.compareTo(sb7)); // Kala <==> kala  ==>-32
        System.out.println(sb3.compareTo(sb7)); // Java <==> kala  ==>-33




    }
}
