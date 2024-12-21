package day44_mapsUpdate_nestedMap;

import java.util.Set;

public class C09_NestedMapTopluBolumUpdate extends NestedMapDepo{

    public static void main(String[] args) {

        // tum ogrencileri gozden gecirip
        // eski bolumu verilen ogrencilerin bolumunu
        // verilen yeni bolum ile update edin

        String eskiBolum = "MF";
        String yeniBolum = "Say";

        Set<Integer> ogrenciKeySeti = ogrenciNestedMap.keySet();

        for (Integer eachKey :ogrenciKeySeti){

            String ogrenciBolum = ogrenciNestedMap.get(eachKey).get("bolum");

            if (ogrenciBolum.equalsIgnoreCase(eskiBolum)){
                ogrenciNestedMap.get(eachKey).replace("bolum",yeniBolum);
            }

        }

        System.out.println(ogrenciNestedMap);

    }
}
