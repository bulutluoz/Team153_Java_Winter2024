package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // ListIterator kullanarak
        // sayilar listesindeki elemanlari 1'er artirin

        //    3,  4,  6,  2,  8,  1,  2,  5,  3,  8,  1,  9

        ListIterator listIterator = sayilar.listIterator();

        while (listIterator.hasNext()){

            int eskiDeger = (Integer) listIterator.next();

            listIterator.set(eskiDeger+1);

        }

        System.out.println(sayilar); // [4, 5, 7, 3, 9, 2, 3, 6, 4, 9, 2, 10]


        // list iterator kullanarak elemanlari sondan basa dogru yazdirin

        // iterator kullanirken dikkat edecegimiz 2 onemli nokta var
        // 1. while loop icinde sadece 1 kere iteration yapmak iterator.nex(), iterator.previous()
        // 2. iterator'i nerede biraktik

        // su anda iterator sonda
        // iterator'i sondan basa dogru getirecek bir while loop olusturalim

        while (listIterator.hasPrevious()){

            System.out.print(listIterator.previous() + " ");
        }

        System.out.println("");
        // 10 2 9 4 6 3 2 9 3 7 5 4


        // listIterator ile listeyi gozden gecirip
        // tek sayilari 1 artirin, cift sayilari 2 azaltin

        // iterator suan en basta
        System.out.println(sayilar); // [4, 5, 7, 3, 9, 2, 3, 6, 4, 9, 2, 10]

        while (listIterator.hasNext()){

            int sayi = (Integer)listIterator.next();

            if ( sayi % 2 == 0){ // cift sayi
                listIterator.set(sayi-2);
            }else{ // tek sayi
                listIterator.set(sayi+1);
            }

        }

        System.out.println(sayilar); // [2, 6, 8, 4, 10, 0, 4, 4, 2, 10, 0, 8]








    }
}
