package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C04_SifreKontrol {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

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

        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

        if ( sayac == 0 ){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
