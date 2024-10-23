package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C02_IndirimHesabi1 {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                     10 urun veya daha az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                     10 urun veya daha az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);

        System.out.println("urun adedini girin");
        int urunAdedi = scanner.nextInt();

        System.out.println("Indirimsiz urun fiyatini girin");
        double urunfiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi E : Evet, H : Hayir");
        char kart = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunfiyat*urunAdedi;

    }
}
