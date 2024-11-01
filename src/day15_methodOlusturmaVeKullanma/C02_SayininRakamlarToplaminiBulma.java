package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C02_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin rakamlar toplamini yazdiran
        // bir method olusturun

        rakamlarToplaminiYazdir(521); // 8

        rakamlarToplaminiYazdir(10002); // 3


    }

    public static void rakamlarToplaminiYazdir(int verilenSayi ){

        int sayi = verilenSayi;

        int basamakSayisi = (sayi+"").length();
        int rakamlarToplami = 0;

        for (int i = 0; i <basamakSayisi ; i++) {

            rakamlarToplami += sayi%10;
            sayi /= 10;
        }

        System.out.println("Verilen " + verilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);



    }
}
