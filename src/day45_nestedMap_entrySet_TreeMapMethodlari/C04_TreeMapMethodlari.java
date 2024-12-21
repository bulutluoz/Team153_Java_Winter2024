package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C04_TreeMapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",34);
        harfler.put("T",25);
        harfler.put("L",15);
        harfler.put("S",97);
        harfler.put("E",20);

        System.out.println(harfler); // {A=34, E=20, L=15, S=97, T=25}

        // harfler map'inin
        // data turu Map , constructor'i TreeMap()
        // ve hicbir ekstra method yok

        // data turu Map secildigi icin
        // harfler TUM MAP'lerin sahip oldugu ORTAK METHODLARA sahip olur
        // SADECE TREEMAP'lerin sahip oldugu methodlari KULLANAMAZ


        TreeMap<String,Integer> letters = new TreeMap<>();
        // data turu ve constructor TreeMap secildigi icin
        // parent'i olan Map'deki TUM METHODLARA sahiptir
        // o methodlarin disinda
        // SADECE TREEMAP'lerin sahip oldugu ekstra method'lara da sahiptir

        letters.put("A",34);
        letters.put("T",25);
        letters.put("L",15);
        letters.put("S",97);
        letters.put("E",20);

        System.out.println(letters);  // {A=34, E=20, L=15, S=97, T=25}


        // subMap(fromKey, toKey) baslangic(dahil) ile bitis(haric) arasindaki elementleri verir
        // olmayan bir key yazarsak, olsaydi nerede olurdu diye bakar
        // ve ona gore davranir
        // 4 parametreli olani kullanirsak, baslangic ve bitis icin
        // dahil olmalarini istersek true, haric olmalarini istersek false yazabiliriz

        System.out.println(letters.subMap("E", "S")); // {E=20, L=15}
        System.out.println(letters.subMap("B","Y")); // {E=20, L=15, S=97, T=25}

        System.out.println(letters.subMap("E",true,"S",true));
        //{E=20, L=15, S=97}

        System.out.println(letters.subMap("E",false,"S",false));
        //{L=15}

        System.out.println(letters.subMap("E",false,"S",true));
        // {L=15, S=97}


        // {A=34, E=20, L=15, S=97, T=25}
        // higher (daha buyuk) verilen degerden daha buyuk olan ilk degeri getirir
        // olmayan bir deger yazilirsa, , olsaydi nerede olurdu diye bakar ona gore sonuc verir
        System.out.println(letters.higherKey("E")); // L
        System.out.println(letters.higherEntry("E")); // L=15

        System.out.println(letters.higherKey("M")); // S
        System.out.println(letters.higherEntry("M")); // S=97

        System.out.println(letters.higherKey("U")); // null
        System.out.println(letters.higherEntry("U")); // null



    }
}
