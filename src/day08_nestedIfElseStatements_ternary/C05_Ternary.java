package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk", degilse "birinci sayi daha kucuk degil"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" , degilse "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk", degilse "ikinci sayi 50'den buyuk degil"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati", degilse "ikinci sayi 5'in tam kati degil"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi girin...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
    }
}
