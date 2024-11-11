package day21_multiDimensioanalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_List {

    public static void main(String[] args) {

        // List<Integer> sayilar1 = new List<>(); // List'den obje olusturulamaz

        List<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> sayilar3 = new ArrayList<>(Arrays.asList(99,98,97));

        sayilar.add(45);
        sayilar.add(36);
        sayilar.add(4);

        // elemanlari listenin sonuna ekler

        System.out.println(sayilar); // [45, 36, 4]

        // listenin basina 10 ekleyin

        sayilar.add(0,10); // [10, 45, 36, 4]

        System.out.println(sayilar); // [10, 45, 36, 4]

        // 45 ile 36 arasina 20 ekleyin

        sayilar.add(2,20);

        System.out.println(sayilar); // [10, 45, 20, 36, 4]


        sayilar.addAll(sayilar3);

        System.out.println(sayilar); // [10, 45, 20, 36, 4, 99, 98, 97]

        // sayilar3 listesini, sayilar listesinin basina ekleyin

        sayilar.addAll(0,sayilar3);

        System.out.println(sayilar); // [99, 98, 97, 10, 45, 20, 36, 4, 99, 98, 97]




    }
}
