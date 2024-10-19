package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C05_DikkatEdilecekler2 {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // kullanici 3 basamakli pozitif bir sayi girerse true
        // 3 basamakli pozitif bir sayi girmezse false yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        System.out.println( girilenSayi >= 100 && girilenSayi<1000 );




        // girilen sayi 2 basamakli pozitif bir tamsayi degilse true
        // 2 basamakli pozitif bir tamsayi ise false yazdirin

        System.out.println( girilenSayi<10 || girilenSayi>=100 );























    }
}
