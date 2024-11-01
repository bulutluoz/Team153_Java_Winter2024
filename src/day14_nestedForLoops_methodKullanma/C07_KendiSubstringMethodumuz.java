package day14_nestedForLoops_methodKullanma;

import java.util.Scanner;

public class C07_KendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str = "Java her gecen gun daha da guzellesiyor.";

        /*
            Kullanicidan baslangic ve bitis degerlerini alin
            ve baslangic index'i dahil, bitis index'i haric olacak sekilde
            str'daki baslangic ve bitis index'leri arasindaki karakterleri yazdirin
            - eger kullanicinin verdigi index'ler negatif veya str'in sinirlari disinda ise
              uyari mesaji yazdirin
            - baslangic degeri bitis degerinden buyuk olursa
              hata mesaji yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic index'ini giriniz...");
        int baslangic= scanner.nextInt();

        System.out.println("Lutfen bitis index'ini giriniz...");
        int bitis= scanner.nextInt();

        /*
        if (baslangic<0 || bitis<0 || baslangic>str.length() || bitis>str.length()){
            System.out.println("Index'ler metnin sinirlari icinde olmali");
        } else if ( baslangic > bitis) {
            System.out.println("baslangic degeri bitis degerinden buyuk OLAMAZ");
        } else {

            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("");

         */


        System.out.println(str.substring(baslangic, bitis));





    }
}
