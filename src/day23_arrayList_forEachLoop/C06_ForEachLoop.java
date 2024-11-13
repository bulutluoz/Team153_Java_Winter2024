package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {3,6,7,8};

        // arr'deki tum elementlerin toplamini bulun

        int toplam = 0 ;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println(toplam); // 24


        List<String> isimler = new ArrayList<>(Arrays.asList("Yigit","Elif","Yusuf","Tugba"));

        // listedeki isimlerde kullanilan toplam harf sayisini bulun

        toplam = 0 ;

        for (int i = 0; i < isimler.size() ; i++) {

           toplam += isimler.get(i).length();

        }

        System.out.println("Isimlerdeki toplam harf sayisi : " + toplam);


        // Array sorusunu for-each loop ile yapalim

        System.out.println(Arrays.toString(arr)); // [3, 6, 7, 8]

        toplam = 0;

        for (int each :arr){ // arr'deki herbir int'i bana getir
                             // artik bizim oglan : each
            toplam += each;
        }

        System.out.println("array'deki sayilarin toplami : " + toplam);


        // List sorusunu for-each loop ile yapalim

        System.out.println(isimler); // [Yigit, Elif, Yusuf, Tugba]
        toplam = 0;

        for ( String each :isimler){ // isimler listesindeki herbir String'i bana getir
            toplam += each.length();
        }


    }
}
