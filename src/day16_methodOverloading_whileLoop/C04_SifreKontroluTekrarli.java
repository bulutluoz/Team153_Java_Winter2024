package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C04_SifreKontroluTekrarli {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol eden ve kullaniciya duzeltmesi gereken tum eksikleri soyleyen,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdiran bir method olusturun
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        // Method, kullanici uygun sifre girinceye kadar
        // yeniden sifre istemeye devam etmeli

        sifreKontrolEt();









    }

    public static void sifreKontrolEt(){

        Scanner scanner = new Scanner(System.in);

        boolean sifreIstemeyeDevam = true;
        String sifre = "";


        while (sifreIstemeyeDevam == true ){

            System.out.println("Lutfen sifrenizi giriniz...");
            sifre = scanner.nextLine();

            int sayac = 0 ;

            // - ilk harf kucuk harf olmali

            char ilkHarf= sifre.charAt(0);

            if ( ! Character.isLowerCase(ilkHarf)){
                System.out.println("ilk harf kucuk harf olmali");
                sayac++;
            }

            // - son karakter rakam olmali

            char sonKarakter = sifre.charAt(sifre.length()-1);

            if ( ! (sonKarakter >= '0' && sonKarakter <= '9')  ){

                System.out.println("son karakter rakam olmali");
                sayac++;
            }


            // - sifre bosluk icermemeli

            if (sifre.contains(" ")){
                System.out.println("sifre bosluk icermemeli");
                sayac++;
            }


            // - uzunlugu en az 10 karakter olmali

            if ( sifre.length() < 10){
                System.out.println("uzunlugu en az 10 karakter olmali");
                sayac++;
            }


            if (sayac == 0){
                System.out.println("sifre basariyla kaydedildi");
                sifreIstemeyeDevam = false;
            }

        }



    }

}
