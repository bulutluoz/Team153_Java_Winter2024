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
    }
}
