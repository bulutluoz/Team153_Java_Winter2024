package day19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniDegerEkleme {

    public static void main(String[] args) {

        int[] arr = {3,6,9};

        int[] sayilar = {1,2,3,4,5};


        // arr'yi 5 elemanli yapip 1,2,3,4,5 elemanlarini kaydedin

        // arr[3] = 4; // ArrayIndexOutOfBoundsException
        // arr[4] = 5; //ArrayIndexOutOfBoundsException


        // arr = {1,2,3,4,5};
        // var olan bir array'e liste seklinde atama yapamazsiniz

        // Ya icinde default degerler olan yeni bir array atayabilirsiniz

        arr = new int[5];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        // Ya da istenen array'i once olusturur,
        // sonra arr'ye atama yaparsiniz

        arr = sayilar;

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]



    }
}
