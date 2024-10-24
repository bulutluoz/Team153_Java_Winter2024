package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C01_RakamiYaziIleYazdirma {

    public static void main(String[] args) {

        /*
            switch statements
            olasi durum sayisi cok oldugunda if, else if , ... yerine tercih edilir

            switch statement, verilen degere uygun case'den baslar
            break gorunceye veya switch statement bitinceye kadar CALISIR

            switch statement da case olsarak DEGER yazilmalidir
            ama bu deger || veya && gibi operatorler ICERMEMELIDIR

            eger birlestirmemiz gereken case'ler olursa
            break'i kullanarak gruplayabiliriz
         */


        // Kullanicidan bir rakam isteyim ( 0 - 9)
        // kullanicinin rakam olarak girdigi degeri
        // metin olarak yazdirin
        // orn : kullanici 7'ye basarsa, "Girilen rakam : yedi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz..");
        int rakam = scanner.nextInt();


        if (rakam == 0) {System.out.println("Sifir");
        } else if (rakam == 1) {System.out.println("Bir");
        } else if (rakam == 2) {System.out.println("iki");
        } else if (rakam == 3) {System.out.println("uc");
        } else if (rakam == 4) {System.out.println("dort");
        } else if (rakam == 5) {System.out.println("bes");
        } else if (rakam == 6) {System.out.println("alti");
        } else if (rakam == 7) {System.out.println("yedi");
        } else if (rakam == 8) {System.out.println("sekiz");
        } else if (rakam == 9) {System.out.println("dokuz");
        } else { System.out.println("Girilen sayi 0-9 arasi olmalidir");
        }




        switch (rakam){

            case 0 :
                System.out.println("Sifir");
                break;
            case 1 :
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
                break;
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Girilen sayi 0-9 arasi olmalidir");

        }

    }
}
