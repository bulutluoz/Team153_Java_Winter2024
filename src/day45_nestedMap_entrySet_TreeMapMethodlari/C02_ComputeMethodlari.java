package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",34);
        harfler.put("T",25);
        harfler.put("L",15);
        harfler.put("S",97);
        harfler.put("E",20);

        System.out.println(harfler); //  {A=34, E=20, L=15, S=97, T=25}

        // E'nin degerini 10 artirin
        int eskiDeger = harfler.get("E"); // 20
        harfler.put("E",eskiDeger+10);


        // map'de K varsa degerini 2 katina cikarin
        if (harfler.containsKey("K")){

            eskiDeger = harfler.get("K");
            harfler.replace("K",eskiDeger*2);

        }

        // map'de L varsa degerini 2 katina cikarin

        if (harfler.containsKey("L")){
            eskiDeger = harfler.get("L");
            harfler.replace("L",2*eskiDeger);
        }


        System.out.println(harfler); // {A=34, E=30, L=30, S=97, T=25}


        // map'de "H" yoksa, degeri 75 olarak map'e "H" ekleyin
        // yukardaki L ile ilgili kodda ! kullanarak yapabiliriz

        if (  ! harfler.containsKey("H")  ){

            harfler.put("H",75) ;
        }



        // map'de "S" yoksa, degeri 45 olarak map'e "S" ekleyin
        harfler.putIfAbsent("S",45);

        System.out.println(harfler); // {A=34, E=30, H=75, L=30, S=97, T=25}


        // E'nin degerini 10 artirin
        harfler.compute("E",(k,v) -> v+10   );

        // R'nin degerini 10 artirin
        // harfler.compute("R",(k,v)->v+10 ); // NullPointerException

        // A'nin degerini 10 azaltin
        harfler.compute("A", (a,b) -> b-10 );


        // map'de K varsa degerini 2 katina cikarin
        harfler.computeIfPresent("K" , (k,v) -> v*2 );

        // map'de L varsa degerini 2 katina cikarin
        harfler.computeIfPresent("L", (k,v)-> v*2 );

        // map'de "C" yoksa, degeri 15 olarak map'e "C" ekleyin

        // harfler.putIfAbsent("C",15);
        harfler.computeIfAbsent("C", v-> 15 );


        System.out.println(harfler); // {A=24, C=15, E=40, H=75, L=60, S=97, T=25}
    }
}
