package day20_arrays;

import day19_arrays.C05_EnKisaEnUzunKelime;

import java.util.Scanner;

public class C04_EnUzunKelimeyiBulma {

    public static void main(String[] args) {

        // Kullanicidan bir cumle isteyin
        // ve cumledeki en uzun ve en kisa kelimeleri yazdirin

        // Ali okula gitti, ogleden sonra saat 3'de gelecegini soyledi

        // , kelime uzunlugunu etkiledigi icin
        // ,'den kurtulalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");

        String str = scanner.nextLine();

        str = str.replace(",","");
        str = str.replace(".","");
        str = str.replace("-","");

        String[] kelimeler = str.split(" ");

        C05_EnKisaEnUzunKelime.enUzunEnKisayiYazdir(kelimeler);

    }
}
