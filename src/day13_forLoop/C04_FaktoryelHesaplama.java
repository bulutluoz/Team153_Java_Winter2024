package day13_forLoop;

import java.util.Scanner;

public class C04_FaktoryelHesaplama {

    public static void main(String[] args) {

        // Kullanicidan 18’den kucuk pozitif bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        //  5! = 5 * 4 * 3 * 2 * 1 => 120


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 18'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        long carpim = 1;

        for (int i = sayi; i >=1 ; i--) {

            carpim *= i;

        }

        System.out.println(sayi + "! = " + carpim);

    }
}
