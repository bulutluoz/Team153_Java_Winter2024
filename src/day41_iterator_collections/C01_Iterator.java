package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // sayilar listesindeki tum elemanlarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);

        }

        System.out.println("Elemanlarin toplami for loop : " + toplam);


        // INDEX KULLANMADAN elemanlarin toplamini bulun

        toplam = 0;

        for (Integer each : sayilar){

            toplam += each;
        }

        System.out.println("Elemanlarin toplami for each loop : " + toplam);


        // sayilar listesindeki her elemani 1 artirin

        for (int i = 0; i < sayilar.size() ; i++) {

            int eskiDeger = sayilar.get(i);

            sayilar.set(i, eskiDeger+1);

        }

        //                               3, 4, 6, 2, 8, 1, 2, 5, 3, 8, 1, 9
        System.out.println(sayilar); // [4, 5, 7, 3, 9, 2, 3, 6, 4, 9, 2, 10]


        // INDEX KULLANMADAN sayilar listesindeki elemanlari 1 artirin

        // Collections da bazi yapilar INDEX desteklemez
        // Bu durumda index olmadan arrayList vb.. yapilardaki elemanlari
        // tek tek bize getiren for-each loop var ama o da atama yapamaz

        for (Integer each : sayilar){

            each += 1;
            System.out.print(each + " ");
        } // 5 6 8 4 10 3 4 7 5 10 3 11

        System.out.println("");

        System.out.println(sayilar); // [4, 5, 7, 3, 9, 2, 3, 6, 4, 9, 2, 10]


        // Eger index olmadan elemanlari gozden gecirmek
        // ve gerekirse degistirmek icin alternatif olarak
        // Iterator veya ListIterator kullanilabilir

        List<Integer> numaralar = new ArrayList<>(Arrays.asList(4,5,7,3,9));

        //    [  4,   5,   7,   3,   9  ]

        Iterator iterator = numaralar.iterator();

        System.out.println(iterator.hasNext()); // true iterator'a daha eleman var mi ? diye sorar

        System.out.println(iterator.next()); // 4 iterator'i bir sonraki konuma gecirir

        iterator.remove(); // uzerine aldigi elementi siler

        System.out.println(numaralar); // [5, 7, 3, 9]

        iterator.next(); // 5'i atlayip 7'nin onune gelir ve 5 uzerine alir

        iterator.remove(); // uzerine aldigi 5'i siler

        System.out.println(numaralar); // [7, 3, 9]

        // iterator.remove(); // uzerine aldigi 5'i 90.satirda sildi, uzerinde eleman kalmadi
        // calistirirsaniz IllegalStateException verir
    }
}
