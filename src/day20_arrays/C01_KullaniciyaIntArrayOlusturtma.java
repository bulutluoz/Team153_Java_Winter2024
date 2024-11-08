package day20_arrays;

import day19_arrays.C08_ArrayeElemanEkleme;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaIntArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip
        // C08'deki method'u kullanarak array’i olusturun ve yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturmak istediginiz array'in uzunlugunu girin");

        int arrayLength = scanner.nextInt(); // 5

        int[] arr = new int[1]; // [0]

        System.out.println("Lutfen array'in ilk elemanini giriniz.."); // 3
        arr[0] = scanner.nextInt(); // [3]


        for (int i = 1 ; i < arrayLength; i++) {

            System.out.println("array'e eklemek uzere bir tamsayi giriniz...");

            int eklenecekSayi = scanner.nextInt();

            arr = C08_ArrayeElemanEkleme.arrayeElemanEkle(arr,eklenecekSayi);

        }

        System.out.println("Olusturdugunuz arr : " + Arrays.toString(arr));

    }
}
