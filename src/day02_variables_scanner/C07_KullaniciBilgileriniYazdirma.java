package day02_variables_scanner;

import java.util.Scanner;

public class C07_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //		girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        System.out.println(
                "girilen bilgiler : " +isim.toUpperCase().charAt(0)+
                " " + soyisim +
                ", "+ yas

        );


    }
}
