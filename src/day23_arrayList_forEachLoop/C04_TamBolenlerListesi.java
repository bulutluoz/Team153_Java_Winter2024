package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_TamBolenlerListesi {

    public static void main(String[] args) {

        // Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari
        // bir liste olarak donduren method olusturun

        System.out.println(pozitifTamBolenlerListesi(30)); // [1, 2, 3, 5, 6, 10, 15, 30]

        System.out.println(pozitifTamBolenlerListesi(102)); // [1, 2, 3, 6, 17, 34, 51, 102]

        System.out.println(pozitifTamBolenlerListesi(103)); // [1, 103]   asal sayi

        System.out.println(pozitifTamBolenlerListesi(13)); // [1, 13]

    }


    public static List<Integer> pozitifTamBolenlerListesi( int sayi ){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if ( sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;

    }
}
