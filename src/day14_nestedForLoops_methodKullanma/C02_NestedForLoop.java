package day14_nestedForLoops_methodKullanma;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satir sutun sayisini alip
            asagidaki sekli olusturun

            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();

        System.out.println("Lutfen satir sayisini giriniz...");
        int sutunSayisi = scanner.nextInt();


        for (int i = 1; i <=satirSayisi ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=sutunSayisi ; j++) { // her satirdaki sutunlari kontrol eder

                System.out.print(i+j-1 + " ");
            }

            System.out.println("");
        }

    }
}
