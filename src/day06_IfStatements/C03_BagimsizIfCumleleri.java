package day06_IfStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0 ){
            System.out.println("Sayi 5’in tam kati");
        }

    }
}
