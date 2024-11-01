package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_FaktoryelYazdirma {

    public static void main(String[] args) {

        // verilen 17'den kucuk bir pozitif tamsayiyi parametre olarak alip
        // faktoryel degerini yazdiran bir method olusturun

        faktoryelYazdir(5); // 5! = 120

        faktoryelYazdir(7); // 7! = 5040



    }

    public static void faktoryelYazdir(int sayi){

        long carpim = 1;

        for (int i = sayi; i >=1 ; i--) {

            carpim *= i;

        }

        System.out.println(sayi + "! = " + carpim);
    }

}
