package day02_variables_scanner;

import java.util.Scanner;

public class C09_sayilarinDegerleriniDegistirme {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1.tamsayiyi giriniz...");
        int sayi1 = scanner.nextInt(); // 25

        System.out.println("Lutfen 2.tamsayiyi giriniz...");
        int sayi2 = scanner.nextInt(); // 10

        int temp = 0 ;



        temp = sayi2;


        sayi2 = sayi1 ;


        sayi1 = temp;


        System.out.println("Son durum sayi1 : " + sayi1 + " ve sayi2 : " + sayi2);





















    }
}
