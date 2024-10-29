package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C02_IsmiDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise,
        //    isim ve soyismi ilk harf buyuk kalanlar kucuk olacak seklinde yazdirin
        //  - soyisim daha uzun ise
        //    ismi ilk harf buyuk digerleri kucuk, soyismin tamami buyuk harf olacak sekilde yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz.");
        String isim =scanner.nextLine();

        System.out.println("Lütfen soyadınızı giriniz.");
        String soyisim = scanner.nextLine();

        if ( isim.length()>soyisim.length()){ // isim daha uzun ise
            //    isim ve soyismi ilk harf buyuk kalanlar kucuk olacak seklinde yazdirin
            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase() +
                    " "+
                    soyisim.substring(0,1).toUpperCase() +
                    soyisim.substring(1).toLowerCase()
            );


        } else if (soyisim.length() > isim.length()) { // soyisim daha uzun ise
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamami buyuk harf olacak sekilde yazdirin.

            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase() +
                    " "+
                    soyisim.toUpperCase()
            );

        }


    }
}
