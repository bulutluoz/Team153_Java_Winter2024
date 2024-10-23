package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C04_TernaryOperatoru {


    public static void main(String[] args) {

        /*
            basit bir if-else ile yapabilecegimiz
            if ve else body'sinin tek satirdan ibaret oldugu durumlarda
            Ternary KULLANABILIRIZ
         */

        // Kullanicidan bir tamsayi isteyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        // sayinin tek veya cift oldugunu yazdirin

        if ( sayi % 2 == 0) System.out.println("Sayi cift");
        else System.out.println("sayi tek");


        System.out.println( sayi % 2 == 0 ? "Sayi cift"  : "sayi tek" );




        // sayinin 3 basamakli pozitif bir sayi olup olmadigini yazdirin

        if (sayi>=100 && sayi<=999){
            System.out.println("sayi 3 basamakli pozitif sayi");
        }else {
            System.out.println("sayi 3 basamakli pozitif sayi degil");

        }


        System.out.println( sayi>=100 && sayi<=999 ? "sayi 3 basamakli pozitif sayi" : "sayi 3 basamakli pozitif sayi degil"  );

    }


}
