package day13_forLoop;

import java.util.Scanner;

public class C06_SayininRakamlarToplaminiBUlma {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi;

        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;

        for (int i = 0; i <basamakSayisi ; i++) {

            rakamlarToplami += sayi%10;
            sayi /= 10;
        }

        System.out.println("Verilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
















    }
}
