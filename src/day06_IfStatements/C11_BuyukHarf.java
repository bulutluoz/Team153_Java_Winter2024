package day06_IfStatements;

import java.util.Scanner;

public class C11_BuyukHarf {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char karakter = scan.next().charAt(0); // Berkay Can ==> B


        // 1.yontem : Character Wrapper Class

        if (Character.isUpperCase(karakter)){
            System.out.println( "Girilen karakter buyuk harf");
        }else {
            System.out.println( "Girilen karakter buyuk harf degil");
        }

        // 2.yontem : ASCII table degerlerini kullanabiliriz


        if (karakter>='A' && karakter<='Z'){

            System.out.println( "Girilen karakter buyuk harf");

        }else {
            System.out.println( "Girilen karakter buyuk harf degil");
        }





    }
}
