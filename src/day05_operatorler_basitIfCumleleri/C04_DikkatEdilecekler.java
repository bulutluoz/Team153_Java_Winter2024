package day05_operatorler_basitIfCumleleri;

import java.util.Scanner;

public class C04_DikkatEdilecekler {


    public static void main(String[] args) {

        // Kullanicidan bir karakter alin
        // girilen karakter kucuk harf ise true, kucuk harf degilse false yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char girilenKarakter = scanner.next().charAt(0);


        // istenen islemi 2 turlu yapabiliriz
        // 1. Charecter wrapper class ile

        System.out.println(  Character.isLowerCase(girilenKarakter) );

        // 2.yontem ASCII table ve karsilastirma operatoru kullanabiliriz
        // istenen durum 2 degerin arasi ise AND kullanilir

        System.out.println( girilenKarakter>='a' && girilenKarakter <= 'z'   );



        // istenen durum bir araligin disinda kalan kisim ise OR kullanilir

        // girilen harf buyuk harf degilse true
        // buyuk harf ise false yazdirin


        System.out.println( girilenKarakter<'A' || girilenKarakter>'Z' );






    }
}
