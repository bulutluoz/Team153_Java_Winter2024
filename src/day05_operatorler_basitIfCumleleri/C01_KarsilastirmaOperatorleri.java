package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C01_KarsilastirmaOperatorleri {

    public static void main(String[] args) {


        // kullanicidan bir tamsayi isteyin
        // girilen tamsayi cift ise true, cift degilse false yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        long girilenSayi = scanner.nextLong();

        System.out.println( girilenSayi % 2 == 0  );


        // girilen sayi 23'un kati ise true, 23'un kati degilse false yazdirin

        System.out.println( girilenSayi % 23 == 0 );


    }
}
