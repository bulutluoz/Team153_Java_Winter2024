package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C02_GunIsminiYazdirma {

    public static void main(String[] args) {

        // kullanicidan gun numarasini alin
        // sayi olarak girilen gunun ismini yazdirin
        // 1- pazartesi ..... 7-pazar
        // 1-7 arasi rakamlar disinda bir deger girilirse, hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini yaziniz.. (1-7)");
        int gun = scanner.nextInt();

        if (gun == 1) {System.out.println("Pazartesi");
        } else if (gun == 2) {System.out.println("Sali");
        } else if (gun == 3) {System.out.println("Carsamba");
        } else if (gun == 4) {System.out.println("Persembe");
        } else if (gun == 5) {System.out.println("Cuma");
        } else if (gun == 6) {System.out.println("Cumartesi");
        } else if (gun == 7) {System.out.println("Pazar");
        } else {System.out.println("Girilen gun numarasi 1-7 arasinda olmalidir..");
        }


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
