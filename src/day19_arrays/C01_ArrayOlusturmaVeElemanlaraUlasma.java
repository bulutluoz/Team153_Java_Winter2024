package day19_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeElemanlaraUlasma {

    public static void main(String[] args) {

        int[] arr = {3,7,9,1}; // Java arr'in length'i olarak yazilan eleman sayisini kabul eder
        String[] isimler = new String[5]; //  [null, null, null, null, null]

        // arr 'nin data turu Array'dir
        // onune yazdigimiz int, array'in icine konulacak elemanlarin data turudur

        //9'u yazdirin
        System.out.println(arr[2]); // 9

        // arr'in ilk elemanini yazdirin
        System.out.println( arr[0]  ); // 3

        // arr'nin 1.ve 2.index'indeki sayilarin toplamini yazdirin
        System.out.println(  arr[1] + arr[2] ); // 16


        /*
            Olusturulmus bir array'in uzunlugu sonradan degistirilemez.
         */

        int[] sayilar = {10,11,45};

        // sayilar array'inin 2.index'indeki elemani yazdirin

        System.out.println(sayilar[2]); // 45

        // sayilar array'in 1.index'ine 40 degerini atayin
        sayilar[1] = 40;

        // sayilar array'ine 4.element olarak 20 degerini atayin

        // sayilar[3] = 20 ; // ArrayIndexOutOfBoundsException


        // Sayilar array'ini yazdirin

        System.out.println(sayilar); // [I@2752f6e2

        // Array'i direkt yazdirmak isterseniz, Java array'i degil referansini yazdirir
        // Array'i yazdirmak icin Arrays class'indan toString() kullanmalisiniz

        System.out.println(Arrays.toString(sayilar)); // [10, 40, 45]
        // array'i bir butun olarak yazdirirsaniz, elementlerin arasina ", " birakir


        String str = "Java candir";
        String[] harfler = {"e","r","t"};

        System.out.println(  str.length() ); // 11
        System.out.println(  harfler.length  ); // 3

    }
}
