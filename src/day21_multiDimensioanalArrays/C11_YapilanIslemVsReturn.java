package day21_multiDimensioanalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_YapilanIslemVsReturn {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","g","y","t","y","g","b"));

        harfler.remove(0);

        System.out.println(harfler); // [g, y, t, y, g, b]

        harfler.remove("t");

        System.out.println(harfler); // [g, y, y, g, b]


        System.out.println(harfler.remove(0)); // g


        System.out.println(harfler.remove("b")); // true

        System.out.println(harfler); // [y, y, g]

        System.out.println(harfler.remove("b")); // false

        System.out.println(harfler); // [y, y, g]


        System.out.println(harfler.add("a")); // true


        System.out.println(harfler); // [y, y, g, a]


        harfler.add(2,"k");
        // void demek ILLA DA yazdirir demek degildir
        // void bir sey return etmiyor demektir
        // void olan method'un icinde yazdirma islemi yapilabilir (mutlaka yazdirma olur diyemeyiz)

        System.out.println(harfler); // [y, y, k, g, a]





    }
}
