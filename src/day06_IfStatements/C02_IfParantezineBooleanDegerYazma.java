package day06_IfStatements;


import java.util.Scanner;

public class C02_IfParantezineBooleanDegerYazma {

    public static void main(String[] args) {


        // kullanicidan yasini alin
        // yasin 65'e esit yada buyuk oldugunu kontrol edip
        // olusturdugunuz sonuc variable'ina bu sonucu kaydedin
        // sonuc variable'inin degeri true ise "emekli olabilirsin"
        //                            false ise "emekli olamazsin" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();


        boolean sonuc = yas >= 65 ; // true veya false


        if (sonuc){ // sonuc == true
            System.out.println("emekli olabilirsin");
        }


        if (!sonuc){ // sonuc == false
            System.out.println("emekli olamazsin");
        }




    }
}
