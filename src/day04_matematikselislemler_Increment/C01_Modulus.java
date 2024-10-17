package day04_matematikselislemler_Increment;

import java.util.Scanner;

public class C01_Modulus {

    public static void main(String[] args) {


        // kullanicidan bir sayi alip cift olup olmadigini bulun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz...");

        int girilenSayi = scanner.nextInt();


        System.out.println( girilenSayi % 2 ); // 1 ise sayi tek, 0 ise cifttir


        // girilen sayinin birler basamagini yazdirin

        System.out.println("Girilen sayinin birler basamagi : " + (girilenSayi % 10) );


        // girilen sayinin 29'un kati olup olmadigini kontrol edin

        System.out.println("29 ile bolumunden kalan : " + (girilenSayi%29)); // 13
        // demek ki 29'un kati degil





    }
}
