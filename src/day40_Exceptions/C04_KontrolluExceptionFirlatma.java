package day40_Exceptions;

import java.util.Scanner;

public class C04_KontrolluExceptionFirlatma {

    public static void main(String[] args) {

        // kullanicidan yasini, yasadigi sehrin plakasini
        // ve posta kodunu isteyin

        // girilen yas 40-60 arasi (sinirlar dahil)
        // yasadigi sehrin plakasi 40-60 arasi (sinirlar dahil)
        // ve posta kodu 40000-69999 arasi(sinirlar dahil) ise
        // "Cok sanslisin yazdirin
        // eger kullanicidan aldiigimiz degerlerden uygun olmayan varsa
        // "Sansli degilsin" yazdirsin
        // ve geriye kalan sorulari sormasin

        Scanner scanner = new Scanner(System.in);
        int yas = 0;
        int plaka = 0;
        int postaKodu = 0;

        try {

            System.out.println("Lutfen yasinizi giriniz...");
            yas = scanner.nextInt();
            if (yas<40 || yas>60){
                System.out.println("Sansli degilsin");
                throw new RuntimeException("Yasin uygun degil kaybettin..");
            }

            System.out.println("Lutfen yasadiginiz sehrin plaka kodunu giriniz...");
            plaka = scanner.nextInt();
            if (plaka<40 || plaka>60){
                System.out.println("Sansli degilsin");
                throw new RuntimeException("Sehrin uygun degil kaybettin..");
            }

            System.out.println("Posta kodunuzu giriniz...");
            postaKodu = scanner.nextInt();

            if (postaKodu<40000 || postaKodu>69999){
                System.out.println("Sansli degilsin");
                throw new RuntimeException("Posta kodu uygun degil kaybettin..");
            }

            System.out.println("Cok sanslisin...");

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }






    }
}
