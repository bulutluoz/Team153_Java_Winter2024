package day06_IfStatements;

import java.util.Scanner;

public class C01_bagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki adet tamsayi giriniz..");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // ilk sayi  ikinci sayidan buyukse "ilk sayi daha buyuk" yazdirin

        if ( sayi1 > sayi2 ){
            System.out.println("Ilk sayi daha buyuk");
        }

        // ikinci sayi cift ise "ikinci sayi cift" yazdirin
        if ( sayi2 % 2 == 0){
            System.out.println("ikinci sayi cift");
        }


        // birinci sayi 100'den buyukse "sayilar cok guzel" yazdirin
        if (sayi1>100){
            System.out.println("sayilar cok guzel");
        }

        // ikinci sayi negatifse "negatif sayilari sevmem" yazdirin

        if ( sayi2 < 0){
            System.out.println("negatif sayilari sevmem");
        }



    }
}
