package day21_multiDimensioanalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_Remove {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","g","y","t","y","g","b"));

        System.out.println(harfler); // [a, g, y, t, y, g, b]

        harfler.remove(0);

        System.out.println(harfler); // [g, y, t, y, g, b]

        harfler.remove("y");

        System.out.println(harfler); // [g, t, y, g, b]



        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,7,4,5,3,6));

        System.out.println(sayilar); // [3, 6, 7, 4, 5, 3, 6]

        sayilar.remove(3);

        System.out.println(sayilar); // [3, 6, 7, 5, 3, 6]

        // biz illa da element olan 3'u silmesini istersek
        // o zaman once bir object(non-primitive variable) olarak silinecek element olusturmalisiniz

        Integer silinecekSayi = 3;

        sayilar.remove(silinecekSayi);


        System.out.println(sayilar); // [6, 7, 5, 3, 6]











    }
}
