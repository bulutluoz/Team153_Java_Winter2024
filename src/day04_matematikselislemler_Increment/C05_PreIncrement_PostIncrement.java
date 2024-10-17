package day04_matematikselislemler_Increment;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        /*
            EGER yazildiklari satirda tek basina iseler

            ++sayi ile sayi++

            --sayi ile sayi--

            ayni islemi yaparlar ve aralarinda bir fark olmaz

            bu islemlerin oldugu satirda yazdirma veya baska bir islem varsa
            aralarinda bir fark olur
         */


        int sayi = 20 ;

        sayi++;

        System.out.println(sayi); // 21

        ++sayi;

        System.out.println(sayi); // 22


        sayi--;

        System.out.println(sayi); // 21


        --sayi;

        System.out.println(sayi); // 20


    }
}
