package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C07_DikkatEdilecekler {

    public static void main(String[] args) {

        /*
            1- eger ternary de istenen 2 sonuctan biri yazdirma, biri atama ise
               ternary ile bu islem YAPILAMAZ

               ternary'de ya iki durumda da yazdirma olmali veya atama olmali

               bu soruda oldugu gibi biri yazdirma, biri atama olsa da
               soruyu ternary ile cozmek icin
               ikisini de yazdirma sekline dondurup, sonuca ulasabiliriz

            2- ternary cok basit islemler icin kullanilmalidir
               asagidaki 2.soru gibi uzun islem gerektiren sorularda
               if-else ile devam etmek gerekir
               TERNARY KULLAMAMAK daha iyi olur
         */

        // kullanicidan bir tamsayi alin
        // girilen sayi pozitif ise "sayi pozitif" yazdirin
        //              pozitif degilse degerine 50 ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();



//        System.out.println(sayi>0 ? "sayi pozitif" : (sayi = sayi+50) );
//
//        System.out.println("sayinin son hali : " + sayi );


         // soru soyle olsaydi HIIICC sorun olmazdi
        //  girilen sayi pozitif ise "sayi pozitif" yazdirin
        //               pozitif degilse degerinin 50 fazlasini yazdirin

        System.out.println(sayi > 0 ? "sayı pozitif" : (sayi + 50));



        // 2.soru girilen sayi 3 basamakli pozitif bir tamsayi ise rakamlar toplamini yazdirin
        //                     3 basamakli pozitif bir tamsayi degilse sayinin 100 fazlasini yazdirin



    }
}
