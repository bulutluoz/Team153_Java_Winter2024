package day44_mapsUpdate_nestedMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        //sayilar.add("Ali");
        //sayilar.add(true);
        //sayilar.add('a');

        int[] arr = {3,5,6};
        //sayilar.add(arr);


        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","c"));
        //sayilar.add(harfler);


        List<Object> nesneler = new ArrayList<>();
        nesneler.add(10);
        nesneler.add("Ali");
        nesneler.add(true);
        nesneler.add('a');
        nesneler.add(arr);
        nesneler.add(harfler);

        /*
            Data turu olarak daha genel olan Object secmek
            farkli data turundeki degerleri ve variable'lari koymak acisindan kolaylik olsa da
            sonrasinda erisim ve kullanma aninda sorunlara yol acabilir
         */

        System.out.println(nesneler);
        // [10, Ali, true, a, [I@1cd072a9, [a, b, c]]

        // 0.index'deki sayinin 2 katini yazdirin
        System.out.println(    (int)nesneler.get(0)  * 2  ); // 20

        // 1.index'deki String'in length'ini yazdirin
        System.out.println(  ((String) nesneler.get(1)).length()   ); // 3

        // 4.index'deki array'i yazdirin
        System.out.println( Arrays.toString( (int[])nesneler.get(4) )  ); // [3, 5, 6]

        // 5.index'deki harfler listesinde "a" harfinin olup olmadigini yazdirin
        System.out.println(  ((List<String>)nesneler.get(5)).contains("a")    ); // true



    }
}
