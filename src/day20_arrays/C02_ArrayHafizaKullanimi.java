package day20_arrays;

import java.util.Arrays;

public class C02_ArrayHafizaKullanimi {

    public static void main(String[] args) {
        // Array’ler hafizada primitive data turundeki datalarin degerlerini,
        // non-primitive data turundeki datalarin ise referanslarini barindirirlar

        String[] isimler = {"Yusuf","Yigit","Canan"};

        int[] sayilar = {4,5,6,7};

        isimler[0] = "Sumeyra";

        System.out.println(Arrays.toString(isimler)); // [Sumeyra, Yigit, Canan]



        /*
            NOT 1 : sort() natural order'a gore siralama yapar
                    sayilar icin kucukten buyuge,
                    metinler icin ise sozluk sirasi
                    ANCAKKK Java'nin kucuk buyuk harf duyarli oldugunu
                    ve kucuk harflerin ascii table'da buyuk harflerden sonra geldigini unutmamaliyiz

            NOT 2 : String'de atama yapmazsak degisiklik kalici olmaz
                    ANCCAAKKK bu ozellik tum non primitive'lerde boyle degildir
                    Simdilik bu ozellik Stringe mahsustur diyebiliriz
                    Array ve ArrayList'te atama olmazsa da
                    method ile yapilan degisiklikler KALICI olur
         */

        String[] srr = {"Metin","Mehmet","mahmut","Mustafa","Faig","elif"};

        Arrays.sort(srr);

        System.out.println(Arrays.toString(srr));
        //[Faig, Mehmet, Metin, Mustafa, elif, mahmut]

    }
}
