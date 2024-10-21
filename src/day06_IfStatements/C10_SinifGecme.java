package day06_IfStatements;

import java.util.Scanner;

public class C10_SinifGecme {

    public static void main(String[] args) {

        // Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not = scan.nextInt();


        if (not >= 50){
            System.out.println("Sinifi gectin");

        }else {
            System.out.println("Maalesef kaldin");
        }
    }
}
