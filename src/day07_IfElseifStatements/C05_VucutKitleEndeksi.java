package day07_IfElseifStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle indeksini hesaplayin
        //  (kilo*10000 / (boy *boy))
        //  vucut kitle endeksi 30’dan buyukse obez,
        //  25-30 arasi ise kilolu,
        //  20-25 arasi ise normal,
        //  20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("kilonuzu kg olarak girin");
        double kilo = scanner.nextDouble();

        System.out.println("boyunuzu cm olarak girin");
        int boy = scanner.nextInt();

        double vki = kilo*10000/(boy*boy);

        System.out.println("Vucut kitle endeksiniz : " + vki);

        if ( vki > 30 ){
            System.out.println("Obez");
        } else if (vki > 25) {
            System.out.println("Kilolu");
        } else if (vki > 20) {
            System.out.println("Saglikli");
        }else {
            System.out.println("Zayif");
        }


    }
}
