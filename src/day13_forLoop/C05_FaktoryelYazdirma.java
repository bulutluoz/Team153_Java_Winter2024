package day13_forLoop;

import java.util.Scanner;

public class C05_FaktoryelYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        //	       6! =               6 * 5 * 4 * 3 * 2 * 1           = 720
        //  forloop'dan once   loop her dongude i'yi yazdirsin     loop'dan sonra

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 18'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int carpim = 1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i > 1 ; i--) {

            carpim *= i;

            System.out.print( i + " * ");
        }

        System.out.println("1 = " + carpim);


    }
}
