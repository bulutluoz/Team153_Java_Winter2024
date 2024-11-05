package day16_methodOverloading_whileLoop;

import java.util.Scanner;

public class C08_DoWhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere tamsayilar alin ve toplayin
        // kullanici 0'a basincaya kadar islemi devam ettirin
        // ve 0'a bastiginda
        // toplam kac sayi girildigini ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 0; // 0 disinda ne yazsak olur
                             // atanan ilk degerin amaci loop'u bir kere calistirmak
        int toplam = 0 ;
        int sayac = 0;



        while ( girilenSayi != 0 ){

            System.out.println("Lutfen toplanmak uzere bir tamsayi giriniz...");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi ;
                sayac++;
            }

        }


        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);


    }
}
