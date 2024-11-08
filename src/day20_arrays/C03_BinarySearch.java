package day20_arrays;

import java.util.Arrays;

public class C03_BinarySearch {

    public static void main(String[] args) {

        // binarySearch(arr, 4)
        // arr array'inde 4'un index'ini verir

        int[] arr = {3,11,5,0,8,2,9};

        System.out.println(Arrays.binarySearch(arr, 3)); // -7
        System.out.println(Arrays.binarySearch(arr, 11)); // -8
        System.out.println(Arrays.binarySearch(arr, 5)); // -7
        System.out.println(Arrays.binarySearch(arr, 0)); // 3 OK
        System.out.println(Arrays.binarySearch(arr, 8)); // -7
        System.out.println(Arrays.binarySearch(arr, 2)); // 5 OK
        System.out.println(Arrays.binarySearch(arr, 9)); // 6 OK


        // ONEMLI NOT : binary search kullandigi ozel algoritma ile
        //              daha az karsilastirma yaparak istenen elemente ulasmayi hedefler
        //              ANCAKKK algoritmasi geregi array'in MUTLAKA siralanmis olmasi gerekir
        //              siralama yapilmadan binarySearch() calistirilirsa
        //              sonucun ne olacagini bilemeyiz

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 2, 3, 5, 8, 9, 11]
        System.out.println(Arrays.binarySearch(arr, 0)); // 0
        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr, 5)); // 3
        System.out.println(Arrays.binarySearch(arr, 8)); // 4
        System.out.println(Arrays.binarySearch(arr, 9)); // 5
        System.out.println(Arrays.binarySearch(arr, 11)); // 6


        String[] srr = { "K" ,"Q","C","Y","N"};

        // srr'de "C" var mi ?

        Arrays.sort(srr);

        System.out.println(Arrays.toString(srr));  // [C, K, N, Q, Y]

        // array'de olmayan elementler icin
        // olmadigini belirtecek -
        // ve olsaydi kacinci SIRADA olacagini yazdirir

        System.out.println(Arrays.binarySearch(srr,"C")); // 0
        System.out.println(Arrays.binarySearch(srr,"Q")); // 3
        System.out.println(Arrays.binarySearch(srr,"B")); // -1
        System.out.println(Arrays.binarySearch(srr,"L")); // -3
        System.out.println(Arrays.binarySearch(srr,"T")); // -5
        System.out.println(Arrays.binarySearch(srr,"Z")); // -6










    }
}
