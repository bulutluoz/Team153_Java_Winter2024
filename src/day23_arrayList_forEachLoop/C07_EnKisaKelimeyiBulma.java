package day23_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C07_EnKisaKelimeyiBulma {

    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // ve cumledeki en kisa kelimeyi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();
        // Java ile herseyin kolay yolu var.

        String[] kelimeler = cumle.split(" ");
        // [Java, ile, herseyin, kolay, yolu, var.]


        String enKisaKelime = kelimeler[0];

        for ( String each  : kelimeler){

            if (  each.length() < enKisaKelime.length() ){
                enKisaKelime = each;
            }
        }

        System.out.println("Girilen cumledeki en kisa kelime : " + enKisaKelime);
    }
}
