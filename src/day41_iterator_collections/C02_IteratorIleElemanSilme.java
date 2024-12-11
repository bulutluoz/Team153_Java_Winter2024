package day41_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_IteratorIleElemanSilme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,6,2,8,1,2,5,3,8,1,9));

        // iterator ile tum elementleri gozden gecirip
        // cift sayilari silin

        Iterator iterator = sayilar.iterator();

        while ( iterator.hasNext() ){ // yaninda eleman oldugu surece isleme devam et

            int sayi = (Integer)iterator.next();

            if (sayi%2==0){
                iterator.remove();
            }

        }

        System.out.println(sayilar); // [3, 1, 5, 3, 1, 9]

        // iterator kullanarak
        // 4'den buyuk sayilari silin

        //Iterator biz demeden hic bir hareket yapmaz
        // yukaridaki islemi dusunecek olursak
        // iterator su an sonda
        // yeni bir islem yapmak istersek
        // iterator'a yeniden deger atamaliyiz

        iterator = sayilar.iterator();  // boylece iterator en bastan yeniden baslar


        while (iterator.hasNext()) { // yanında eleman olduğu sürece devam et

            if ((Integer)  iterator.next() > 4){
                iterator.remove();
            }

        }
        System.out.println(sayilar);


    }
}
