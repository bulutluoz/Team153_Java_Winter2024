package day07_IfElseifStatements;

import java.util.Scanner;

public class C06_IndirimHesabi {

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


        if (kart == 'E' && urunAdedi > 10){
            System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 / 100);
        } else if (kart == 'E' ) { // && urunAdedi<=10
            System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
        } else if (kart == 'H' && urunAdedi > 10) {
            System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
        } else if (kart == 'H' ) { // && urunAdedi<=10
            System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat * 90 / 100);

        }


    }
}
