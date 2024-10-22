package day07_IfElseifStatements;

import java.util.Scanner;

public class C04_Emeklilik {

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


        if (yas < 20 || yas > 80){
            System.out.println("Girilen yas icin emeklilik hesaplanamaz");
        } else if (cinsiyet == 'K' & yas >= 60) {
            System.out.println("60 yasindan buyuk kadinlar emekli olabilir");
        } else if ( cinsiyet == 'K' && yas<60 ){
            System.out.println("Emekli olmak icin " +(60-yas) + " yil daha calismalisin");
        } else if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("65 yasindan buyuk erkekler emekli olabilir");
        } else if (cinsiyet == 'E' && yas<65) {
            System.out.println("Emekli olmak icin " +(65-yas) + " yil daha calismalisin");
        } else {
            System.out.println("Girilen degerler hatali");
        }


    }
}
