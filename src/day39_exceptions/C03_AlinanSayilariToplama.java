package day39_exceptions;

import java.util.InputMismatchException;
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

            try {
                girilenSayi = scanner.nextDouble(); // kullanici Q veya istenmeyen bir input girerse
                                                    // InputMismatchException olusur
                toplam += girilenSayi;
                sayiAdedi++;


            }  catch (InputMismatchException e){
                // Kod buraya geldiyse kullanici Q/q  yada gecersiz bir deger girmistir
                girilenMetin = scanner.nextLine();

                if (girilenMetin.equalsIgnoreCase("Q")){
                    break;
                }else { // gecersiz bir deger girilmis demektir
                    System.out.println("Ya sayi gir ya da Q'ya bas");
                }
            }

        }while(  ! girilenMetin.equalsIgnoreCase("q") );

        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : " + toplam);





    }
}
