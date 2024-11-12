package day22_arrayList;

import java.util.*;

public class C01_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,2,3,6));

        // sayilar listesindeki tum sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i <sayilar.size() ; i++) {

            toplam += sayilar.get(i);      // array'deki arr[i] 'nin yerine

        }

        System.out.println("Listedeki elementlerin toplami : " + toplam); // 38



        // sayilar array'indeki 2.ve 5.index'deki elementlerin carpini yazdirin

        System.out.println(sayilar.get(2) * sayilar.get(5)); // 4 * 7 ==> 28


        System.out.println("sayilar listesi : " + sayilar);

        // sayilar listesi : [2, 3, 4, 5, 6, 7, 2, 3, 6]

        // sayilar listesindeki 4 ile 5'in arasina 13 ekleyin

        sayilar.add(3,13);

        System.out.println("sayilar listesi : " + sayilar);
        // sayilar listesi : [2, 3, 4, 13, 5, 6, 7, 2, 3, 6]


        // 5.index'deki elementi 20 olarak update edin

        sayilar.set(5,20);
        System.out.println("sayilar listesi : " + sayilar);
        // sayilar listesi : [2, 3, 4, 13, 5, 20, 7, 2, 3, 6]

        /*
            add() araya eleman ekler,
            eklenen elemandan sonraki elementler bir geriye kaydirilir
            ve list'in uzunlugu 1 artar

            set() var olan bir elementi update eder
            yeni element eklemedigi icin listenin uzunlugu degismez


            Java'da GENEL OLARAK

            get.... () : bize bilgi getirir
            set.... () : update yapar
         */


        System.out.println(sayilar.indexOf(2)); // 0
        System.out.println(sayilar.lastIndexOf(2)); // 7

        System.out.println(sayilar.indexOf(13)); // 3
        System.out.println(sayilar.lastIndexOf(13)); // 3


        Collections.sort(sayilar);
        System.out.println("sayilar listesi : " + sayilar);
        // sayilar listesi : [2, 2, 3, 3, 4, 5, 6, 7, 13, 20]


    }
}
