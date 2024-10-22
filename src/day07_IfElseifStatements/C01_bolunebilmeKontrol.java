package day07_IfElseifStatements;

import java.util.Scanner;

public class C01_bolunebilmeKontrol {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // sayi 3'e bolunuyorsa "3'un kati"
        // sayi 5'e bolunuyorsa "5'in kati"
        // hem 3'e hem 5'e bolunuyorsa "mukemmel"
        // ikisine de bolunemiyorsa "kotu" yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        if (sayi %3 == 0 && sayi % 5 == 0) {
            System.out.println("mukemmel");
        } else if (sayi % 5 == 0){
            System.out.println("5'in kati");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        } else {
            System.out.println("kotu");
        }


    }
}
