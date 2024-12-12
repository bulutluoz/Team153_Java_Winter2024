package day42_collections_maps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
    public static void main(String[] args) {

        // Set'de her eleman unique'dir
        // Set index yapisi kullanmaz

        Set<String> isimler = new TreeSet<>();

        isimler.add("Ali");
        isimler.add("Sumeyra");
        isimler.add("Yigit");
        isimler.add("Ali");
        isimler.add("Tugba");
        isimler.add("Ali");

        System.out.println(isimler); //  [Ali, Sumeyra, Tugba, Yigit]

        isimler.add("Mehmet");

        System.out.println(isimler); // [Ali, Mehmet, Sumeyra, Tugba, Yigit]


        Set<String> isimler2 = new HashSet<>();

        isimler2.add("Ali");
        isimler2.add("Sumeyra");
        isimler2.add("Yigit");
        isimler2.add("Ali");
        isimler2.add("Tugba");
        isimler2.add("Ali");

        System.out.println(isimler2); // [Tugba, Sumeyra, Yigit, Ali]

        isimler2.add("Mehmet");

        System.out.println(isimler2); // [Tugba, Sumeyra, Yigit, Mehmet, Ali]


    }
}
