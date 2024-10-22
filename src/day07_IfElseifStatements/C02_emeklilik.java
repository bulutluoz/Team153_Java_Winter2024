package day07_IfElseifStatements;

import java.util.Scanner;

public class C02_emeklilik {

    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // yas 65'den buyukse emekli olabilirsin,
        // yas 65'den kucukse "emekli olmak icin daha ... yil calismalisin" yazdirin
        // kullanici 20'den kucuk bir yas veya 80'den buyuk bir yas girerse
        // "girilen yas icin emeklilik hesaplanamaz" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if ( yas < 20  || yas>80   ){
            System.out.println("girilen yas icin emeklilik hesaplanamaz");
        } else if (yas>=65) {
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("Emekli olmak icin daha " + (65-yas) + " yil daha calismalisin");
        }


    }
}
