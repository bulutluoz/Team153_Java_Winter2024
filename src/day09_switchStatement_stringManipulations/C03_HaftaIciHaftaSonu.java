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
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girilen gun numarasi 1-7 arasinda olmalidir..");
        }

    }
}
