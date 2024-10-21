package day06_IfStatements;

import java.util.Scanner;

public class C05_SusluParantezKullanimi {

    public static void main(String[] args) {

        // kullanicidan bir pozitif tamsayi alin
        // sayi 3'e bolunuyorsa, "sayi 3'un tam kati" yazdirin
        // sayi 5'e bolunuyorsa, "sayi 5'in tam kati" yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        /*
            EGER bir if statement'da { } kullanilmazsa
            ilk ; 'e kadar olan kismi if body'si olarak kabul eder

            Sonuc : Eger if body sadece 1 satir ise {} kullanmasak da olur
                    ama if body birden fazla satir ise MUTLAKA {} kullanilmalidir
         */


        if (sayi % 3 == 0 )  System.out.println("3 ile bölünüyor");

        if (sayi % 5 == 0 ) System.out.println("5 ile bölünüyor");


        // sayi 7'ye bolunuyorsa iki farkli sout icinde
        // "7 ile bolunuyor"  "guzel sayi"

        if (sayi % 7 == 0)
            System.out.println("7 ile bolunuyor"); // if body buraya kadar olan kisim olur
            System.out.println("guzel sayi"); // bu satir if cumlesinden ayridir
                                              // HER DURUMDA calisir




    }
}
