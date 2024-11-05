package day17_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        /*
            Do while loop'un while loop'a gore en buyuk avantaji

            loop body'si kontrol olmadan 1 kere calisir
            ve kullanicidan deger alma gibi durumlari halleder


            Do while loop'un while loop'a gore en buyuk dezavantaji

            loop body'si kontrol olmadan 1 kere calisir
            hic calismamasi gereken degerler icin bile
            loop body'si 1 kere calismis olur

         */

        // Kullanicidan baslangic ve bitis harflerini alip,
        // o harfleri ve aralarindaki harfleri yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("baslangic ve bitis icin birer harf giriniz...");

        char baslangic = scanner.next().charAt(0);

        char bitis = scanner.next().charAt(0);


        // for loop ile yapalim

        for (char i = baslangic; i <=bitis ; i++) {

            System.out.print( i + " ");
        }

        System.out.println("");

        // for loop ile yapalim

        for (int i = baslangic; i <=bitis ; i++) {

            System.out.print( (char)i + " ");
        }

        System.out.println("");


        // while loop ile yapalim

        char harf = baslangic;

        while ( harf <= bitis ){

            System.out.print( harf + " ");
            harf++;

        }
        System.out.println("");


        // do while loop ile yapalim

        harf = baslangic;

        do{
            System.out.print( harf + " ");
            harf++;

        }while (harf <=bitis);

    }
}
