package day04_matematikselislemler_Increment;

import java.util.Scanner;

public class C02_MatematikselIslemler {

    public static void main(String[] args) {

        int sayi = 423; // rakamlar toplami 4+2+3 ==> 9

        System.out.println( sayi % 10 ); // 3

        System.out.println( sayi / 10 ); // 42.3 ==> 42


        // kullanicidan 3 basamakli pozitif bir tamsayi alin
        // ve sayinin rakamlar toplamini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi girin...");
        int girilenSayi = scanner.nextInt(); //

        int toplam = 0;


        int birlerBasamagi = girilenSayi % 10;

        toplam = toplam + birlerBasamagi;

        girilenSayi = girilenSayi / 10;



        birlerBasamagi = girilenSayi % 10;

        toplam = toplam+ birlerBasamagi;

        girilenSayi = girilenSayi / 10;

        toplam = toplam + girilenSayi;

        System.out.println("Rakamlar toplami : " + toplam); // 11




    }
}
