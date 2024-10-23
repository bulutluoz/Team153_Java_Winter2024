package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C08_NestedTernary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi pozitifse cift sayi olup olmadigini yazdirin
        // sayi pozitif degilse 3'un kati olup olmadigini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        System.out.println(
                sayi > 0
                ?
                sayi % 2 == 0 ? "cift sayi" : "tek sayi"
                :
                sayi % 3 == 0 ? "3'un kati" : "3'un kati degil"
        );

        // sayi > 0 ? sayi % 2 == 0 ? "cift sayi" : "tek sayi" : sayi % 3 == 0 ? "3'un kati" : "3'un kati degil"

    }
}
