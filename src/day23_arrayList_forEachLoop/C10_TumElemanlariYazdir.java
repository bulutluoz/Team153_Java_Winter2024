package day23_arrayList_forEachLoop;

import java.util.Arrays;

public class C10_TumElemanlariYazdir {

    public static void main(String[] args) {

        int[] arr = {3,78,34,98,1,34,67,43,78,11,84,45};

        // for-each loop ile tum elemanlari yanyana yazdirin

        for ( int each: arr ) {

            System.out.print( each + " ");

        }
        System.out.println("");

        // 3 78 34 98 1 34 67 43 78 11 84 45


        Arrays.sort(arr);
        for ( int each: arr ) {

            System.out.print( each + " ");

        }
        // 1 3 11 34 34 43 45 67 78 78 84 98
        System.out.println("");

        // For each loop GENEL OLARAK array veya list'deki siralamaya gore elemanlari getirir
        // ANCAAAKKKK buna guvenerek kod yazamayiz
        // for-each loop sirali getirmeyi garantilemez

        for ( int each: arr ) {

            System.out.print( each + " ");

        }
        // 1 3 11 34 34 43 45 67 78 78 84 98

    }
}
