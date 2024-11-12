package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,4,5,6,7,3,4,5,4,3,2,3,4,5,6,7,6,5,4,9};

        // arr'deki tum elementleri bir listeye aktarin

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println("sayilar listesi : " + sayilar);
        // sayilar listesi : [3, 4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9]


        sayilar.add(20);
        sayilar.remove(0);

        System.out.println("sayilar listesi : " + sayilar);
        // sayilar listesi : [4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9, 20]



        /*

            Arrays.asList() method'u tek satirda
            var olan bir array'i List'e donusturmemizi saglar
            AMMAAA 2 tane cok buyuk dezavantaji vardir

            1- bu sekilde donusturulen bir List
               List olmasina ragmen add() ve remove() gibi
               uzunlugu degistiren method'lar KULLANAMAZ

            2- Array ve array'den donusturulen liste ayni degerleri kullanir
               Array'e atama yaparsaniz list,
               List'e atama yaparsaniz array degisir

         */

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Method ile listeye donusturulen : " + arraydenList);
        // [3, 4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9]

        // arraydenList.add(20); // UnsupportedOperationException
        // arraydenList.remove(0); // UnsupportedOperationException


        System.out.println("Array : " + Arrays.toString(arr));
        //[3, 4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9]
        System.out.println("Method ile listeye donusturulen : " + arraydenList);
        //[3, 4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9]


        arr[0] = 20;
        arr[1] = 30;


        System.out.println("Array'e atama yaptiktan sonra Array : " + Arrays.toString(arr));
        //[3, 4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9]
        System.out.println("Array'e atama yaptiktan sonra sayilar list : " + arraydenList);
        //[3, 4, 5, 6, 7, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 7, 6, 5, 4, 9]




    }
}
