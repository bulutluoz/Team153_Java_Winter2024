package day42_collections_maps;

import java.util.HashSet;
import java.util.Set;

public class C04_Hash {

    public static void main(String[] args) {

        Set<String> isimler = new HashSet<>();

        System.out.println(isimler.hashCode()); // 0

        isimler.add("Yusuf");
        isimler.add("Yigit");

        System.out.println(isimler.hashCode()); // 171216938

    }
}
