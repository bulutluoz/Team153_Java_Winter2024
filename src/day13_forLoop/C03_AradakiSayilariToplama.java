package day13_forLoop;

import java.util.Scanner;

public class C03_AradakiSayilariToplama {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir başlangıç değeri girin: ");
        int baslangic = scanner.nextInt();

        System.out.print("Lütfen pozitif bir bitiş değeri girin: ");
        int bitis = scanner.nextInt();

        int toplam = 0;


        if (baslangic<0 || bitis<0){
            System.out.println("Baslangic ve bitis degerleri pozitif tamsayi olmali");
        } else if ( baslangic < bitis ) {

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;
            }

        }else{ // baslangic >= bitis

            for (int i = bitis; i <=baslangic ; i++) {
                toplam += i;
            }

        }

        System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);

    }
}
