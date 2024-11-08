package day20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_harfleriSiraliOlarakYazdir {

    public static void main(String[] args) {

        // Kullanicidan bir cumle isteyin
        // cumleden sadace harfleri alip
        // harfleri naturalOrder'a uygun olarak sirali sekilde yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();

        cumle = cumle.replaceAll("\\W",""); // w==> harf, rakam ve _
        cumle = cumle.replaceAll("\\d",""); // d==> sayilar
        cumle = cumle.replaceAll("_","");

        // elimizde sadece harflerden olusan bir cumle kaldi
        // siralama yapabilmek icin array'e cevirelim
        // ve sonra sort() kullanalim

        String[] harfler = cumle.split("");

        Arrays.sort(harfler); //



        for (int i = 0; i < harfler.length ; i++) {
            System.out.print(harfler[i]);
        }


    }
}
