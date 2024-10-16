package day03_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_IstedigimizDataTuruneCast {


    public static void main(String[] args) {


        // kullanicidan bir karakter girmesini isteyin
        // ascii table'da girilen karakterden sonraki 3 karakteri
        // sirasiyla yanyana yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");

        char girilenKarakter = scanner.next().charAt(0);

        System.out.println( "girilen karakterden 1 sonraki karakter : " + (char)(girilenKarakter+1)  );
        System.out.println( "girilen karakterden 2 sonraki karakter : " + (char)(girilenKarakter+2)  );
        System.out.println( "girilen karakterden 3 sonraki karakter : " + (char)(girilenKarakter+3)  );




    }
}
