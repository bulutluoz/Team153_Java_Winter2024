package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C03_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        // Kullanicidan gun numarasini alin
        // girilen gun numarasi hafta ici ise
        // hafta sonuna kadar kalan gunleri yazdirin
        // en sonuna "veeee hafta sonu" yazdirin
        // girilen gun hafta sonu ise
        // "bugun hafta sonu yan geeel yat" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini yaziniz.. (1-7)");
        int gun = scanner.nextInt();


        switch (gun) {

            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Sali");
            case 3:
                System.out.println("Carsamba");
            case 4:
                System.out.println("Persembe");
            case 5:
                System.out.println("Cuma");
                System.out.println("veeee hafta sonu");
                break;
            case 6:
            case 7:
                System.out.println("bugun hafta sonu yan geeel yat");
                break;
            default:
                System.out.println("Girilen gun numarasi 1-7 arasinda olmalidir..");
        }

    }
}
