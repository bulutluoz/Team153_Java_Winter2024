package day42_collections_maps;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_ArraydenTekrarlariSilme {

    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elementleri silip
        // array'i elemanlarin sadece 1'er kez bulundugu hale getirin

        int[] arr = {2,3,5,4,2,7,6,4,5,6,4,2,3,5,7,5,3,4,5};

        Set<Integer> sayilarSeti = new TreeSet<>();

        for (int each :arr){

            sayilarSeti.add(each);
        }

        System.out.println(sayilarSeti); // [2, 3, 4, 5, 6, 7]

        arr = new int[sayilarSeti.size()]; // [0, 0, 0, 0, 0, 0]

        //  set index kullanmaz, array de index olmadan atama yapamaz

        int index = 0;

        for (Integer each : sayilarSeti ){
            arr[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }
}
