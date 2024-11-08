package day19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // Verilen int bir array’e
        // istenen bir elemani ekleyip
        // yeni halini yazdirin


        int[] arr = {3,4,5};
        int eklenecekSayi = 8;

        arr = arrayeElemanEkle(arr,eklenecekSayi);
        arr = arrayeElemanEkle(arr,6);
        arr = arrayeElemanEkle(arr,0);
        arr = arrayeElemanEkle(arr,3);


        System.out.println("arr'nin son hali : " + Arrays.toString(arr));



    }


    // Verilen int bir array’e
    // istenen bir elemani ekleyip
    // yeni halini bize donduren bir method yazin,

    // [3,4,5,8]

    public static int[] arrayeElemanEkle(  int[] arr , int eklenecekSayi    ){

        // once uzunlugu arr'den 1 fazla olan baska bir array olusturalim
        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0]

        // arr'deki eski elemanlari yeni array'e kopyalayin

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        } // [3, 4, 5, 0]

        // yeni array'in son elemani olarak eklenecek sayiyi atayin
        yeniArr[yeniArr.length-1] = eklenecekSayi; //  // [3, 4, 5, 8]

        // yeni array istenen hale gelince, arr'ye yeniArray degerini atayin
        arr = yeniArr;

        return arr;

    }


}
