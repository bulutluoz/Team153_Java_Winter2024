package day14_nestedForLoops_methodKullanma;

import java.util.Scanner;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satir sayisini alip
            asagidaki sekli olusturun

            1
            1 2
            1 2 3
            1 2 3 4

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();


        for (int i = 1; i <= satirSayisi ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=i ; j++) { // her satirdaki sutunlari kontrol eder

                System.out.print(j+" ");

            }
            System.out.println("");
        }

    }
}
