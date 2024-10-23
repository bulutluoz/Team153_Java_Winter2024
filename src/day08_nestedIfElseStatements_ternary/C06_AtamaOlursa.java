package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C06_AtamaOlursa {

    public static void main(String[] args) {
        /*
            Ternary operatoru bir sonuc uretir
            bu sonuc YA yazdirilmalidir YA DA bir variable'a atanmalidir
         */

        // kullanicidan bir tamsayi isteyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        // sayi pozitif ise 2 katina cikarin, sayi pozitif degilse degerini 100 artirin

        sayi = sayi>0 ? 2*sayi : sayi+100 ;

        System.out.println( "sayinin yeni degeri : " + sayi);


        // sayinin yeni degeri cift ise degerini yariya indirin, tek ise degerini 2 katina cikarin

        sayi = sayi % 2 == 0 ? sayi/2 : sayi*2 ;

        System.out.println( "sayinin son degeri : " + sayi);


    }
}
