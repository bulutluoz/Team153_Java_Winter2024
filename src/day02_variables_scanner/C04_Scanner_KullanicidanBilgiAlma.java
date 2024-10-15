package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        // kullanicidan ismini isteyip
        // girilen ismi buyuk harflerle yazdirin


        // 1.adim scanner objesi olusturma
        Scanner scanner = new Scanner(System.in);


        // 2.adim : Kullaniciya ne istedigimizi soyleme
        System.out.println("Lutfen isminizi giriniz...");


        // 3.adim : uygun method kullanarak, kullanicinin girdigi degeri alip
        //          bilginin icerigine uygun bir variable'a kaydetme

        // String girilenIsim = scanner.next(); // kullanicinin girdigi metnin ilk space'e kadar olan kismini alir
                                             // Ali mert canli ==> Ali

        String girilenIsim = scanner.nextLine(); // kullanicinin girdigi metnin tamamini alir


        System.out.println("Girilen ismin buyuk harflerle yazilmis hali : " + girilenIsim.toUpperCase());




    }
}
