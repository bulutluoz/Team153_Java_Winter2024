package day10_stringManipulations;

public class C04_substringIkiParametreli {

    public static void main(String[] args) {

        /*
            java'da genel olarak
            baslangic index'leri dahil (inclusive)
            bitis index'leri haric(exclusive)dir.
         */

        String str = "Java candir";

        System.out.println(str.substring(2, 8)); // va can

        System.out.println(str.substring(5,9)); // cand

       // bastan n tane karekteri yazdirmak icin index olarak (0,n) yazabiliriz
        System.out.println(str.substring(0, 7)); // Java ca

        System.out.println(str.substring(0,3)); // Jav


        System.out.println(str.substring(1, 2)); // a 1.index'deki karakter
        System.out.println(str.substring(0,1)); // J  0.index'deki karakter

        System.out.println(str.substring(7,8).toUpperCase()); // N 7.index'deki karakter String
        System.out.println(str.charAt(7)); // n char

        /*
                str.substring(7,8) ve str.charAt(7) ikisi de bize n getirir
                ANCAAAKKK
                str.substring(7,8) n'yi String olarak getirir
                str.charAt(7) n'yi char olarak getirir
         */


        // "Java candir";
        System.out.println(str.substring(2, 2)); // hiclik (bos satir) yazdirir


        // System.out.println(str.substring(5, 2));
        // StringIndexOutOfBoundsException: begin 5, end 2, length 11




    }
}
