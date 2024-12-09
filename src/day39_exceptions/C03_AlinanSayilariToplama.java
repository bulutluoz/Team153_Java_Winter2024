package day39_exceptions;

import java.util.Scanner;

public class C03_AlinanSayilariToplama {

    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir
        // Kullanici Q veya q'ya bastiginda
        // girilen sayi adedini ve girilen sayilarin toplamini yazdirin

        Scanner scanner = new Scanner(System.in);

        double girilenSayi = 0;
        double toplam = 0;
        String girilenMetin = "";
        int sayiAdedi = 0;


        do {

            System.out.println("lutfen toplamak icin sayi giriniz,\nbitirmek icin Q'ya basiniz...");

            girilenSayi = scanner.nextDouble();
            toplam += girilenSayi;
            sayiAdedi++;

        }while(  ! girilenMetin.equalsIgnoreCase("q") );
    }
}
