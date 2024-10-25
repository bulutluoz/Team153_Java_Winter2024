package day10_stringManipulations;

import java.util.Scanner;

public class C08_emailKontrol {

    public static void main(String[] args) {

        //kullanicidan bir mail alin
        //  - mail @ icermiyorsa "gecersiz mail"
        //  - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //  - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //  yazdirin.

        /*
            bu 3 kontrolu if else ile yapmak ve bagimsiz if cumleleri ile yapmak arasindaki fark

            if else if cumlesi olusturursak, elek mantigi olacagindan
            ilk hata oldugunda durur, diger hatalari vermez

            bagimsiz if cumlesi ise tum hatalari tek seferde verir

            bagimsiz if cumlelerinin negatif tarafi ise
            eger en sonda basarili olarak kaydedildi gibi bir degerlendirme olsaydi
            bagimsiz if cumlelerinin disinda bir de kontrol amacli degisken kullanmak zorunda kalirdik

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz...");
        String email = scanner.nextLine();

        if ( !email.contains("@") ){
            System.out.println("gecersiz mail");
        }

        if ( !email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }

        if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }




    }
}
