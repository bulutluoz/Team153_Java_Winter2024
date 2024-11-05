package day17_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoopVsDoWhileLoop {

    public static void main(String[] args) {
        /*
            Bir dongunun baslangic ve bitis degerleri veya kac kere calisacagi belliyse
            For Loop tercih edilir

            Dongu sayisi belli olmadiginda veya
            dongunun bitmesi farkli bir variable'a bagli oldugunda
            While Loop iyidir

            While loop kullanacagimiz durumlarda
            while loop'un 2 negatif durumunu bilmek gerekir
            - (cok onemli degil) loop kontrolu,
              loop body'den daha fazla calisir
            - Ozellikle kullanicidan deger alindigi durumlarda
              biz ilk atamayi yapiyorsak
              yanlis deger atadigimizda Loop hic calismayabilir

            Eger while loop ile yapacagimiz durumlarda
            loop body en azindan 1 kere calissin,
            kullanicidan degeri alsin ve o degere gore
            bitirip bitirmemeye karar versin derseniz
            while loop yerine do while loop kullanabiliriz

         */


        // Kullanicidan toplanmak uzere tamsayilar alin ve toplayin
        // kullanici 0'a basincaya kadar islemi devam ettirin
        // ve 0'a bastiginda
        // toplam kac sayi girildigini ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 0;
        int toplam = 0 ;
        int sayac = 0;

        do{
            System.out.println("Lutfen toplanmak uzere bir tamsayi giriniz...");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi ;
                sayac++;
            }


        }while (girilenSayi != 0);

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);




    }
}
