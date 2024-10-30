package day13_forLoop;

import java.util.Scanner;

public class C09_MetninTersiniKaydetme {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        String tersMetin = "";


        for (int i = metin.length()-1; i >= 0  ; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println(tersMetin);


        // tersten yazilisi kendisine esit olan metinlere PALINDROME denir

        // girilen metin icin palindrome veya palindrome degil yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        }else {
            System.out.println("Girilen metin PALINDROME degil");
        }


    }
}
