package day08_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C09_Switch {

    public static void main(String[] args) {

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









    }
}
