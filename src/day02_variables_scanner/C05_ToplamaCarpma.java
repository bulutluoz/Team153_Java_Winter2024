package day02_variables_scanner;

import java.util.Scanner;

public class C05_ToplamaCarpma {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz...");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz...");
        int tamsayi = scan.nextInt();


        System.out.println("Sayilarin toplami : " + (ondalikliSayi+tamsayi) );
        System.out.println("Sayilarin carpimi : " + (ondalikliSayi*tamsayi) );



    }
}
