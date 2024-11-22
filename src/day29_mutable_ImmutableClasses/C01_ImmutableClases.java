package day29_mutable_ImmutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ImmutableClases {

    public static void main(String[] args) {

        String isim = "Canan";

        isim.toUpperCase();

        isim.substring(1,3); // an ==> consol'da goremeyiz, cunku yazdirmadik
                             //    ==> kaydetmedigimiz icin sonra da kullanamayiz
                             // kod calisti ama bir seye yaramadi

        // String'de hazir method ile yapilan degisiklikler kalici olmaz

        System.out.println(isim); // Canan


        List<String> isimler = new ArrayList<>(Arrays.asList("Sumeyra","Yusuf","Faig","Canan"));

        System.out.println(isimler); // [Sumeyra, Yusuf, Faig, Canan]

        System.out.println(isimler.remove(1)); // Yusuf
        System.out.println(isimler.remove("Canan")); // true

        System.out.println(isimler); // [Sumeyra, Faig]

    }
}
