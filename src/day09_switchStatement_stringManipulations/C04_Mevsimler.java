package day09_switchStatement_stringManipulations;

import java.util.Scanner;

public class C04_Mevsimler {

    public static void main(String[] args) {

        // Kullanicidan ay numarasini alin
        // 12,1,2 . aylar icin Kis
        // 3,4,5. aylar icin Ilkbahar
        // 6,7,8. aylar icin Yaz
        // 9,10,11.aylar icin Sonbahar yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Ay numarasini giriniz");
        int ayNumarasi = scan.nextInt();

        switch (ayNumarasi){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Ay icin 1-12 arasi degerler girilmeli");

        }



    }
}
