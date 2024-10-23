package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C01_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // 20 yasdan kucuk veya 80 yasdan buyukler icin hata mesaji verin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas= scanner.nextDouble();

        System.out.println("Cinsiyetinizi giriniz.. K : kadin, E : Erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        /*
            Birden fazla degiskene bagli gorevlerde
            nested if else daha ANLASILIR olacaktir

            - Once degiskenlerden birini ana degisken secip
              ana degiskene gore if else-if ... yapisi olusturun
              Bu gorevde ana dehisken olarak cinsiyet secelim

         */

        if (cinsiyet == 'K'){ // cinsiyet KADIN
            // sadece Kadinlar icin yasa gore emekliligi degerlendirelim

            if (yas<20 || yas>80){
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas >=60) {
                System.out.println("60 yasindan buyuk kadinlar emekli olabilir");
            } else{
                System.out.println("Emekli olabilmek icin daha " +(60-yas) + " yil calismalisin.");
            }

        } else if (cinsiyet == 'E') { // cinsiyet ERKEK
            if (yas<20 || yas>80){
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas >=65) {
                System.out.println("65 yasindan buyuk erkekler emekli olabilir");
            } else{
                System.out.println("Emekli olabilmek icin daha " +(65-yas) + " yil calismalisin.");
            }

        } else{ // cinsiyet secimi yanlis
            System.out.println("Cinsiyet icin K veya E secmelisiniz...");
        }


    }

}
