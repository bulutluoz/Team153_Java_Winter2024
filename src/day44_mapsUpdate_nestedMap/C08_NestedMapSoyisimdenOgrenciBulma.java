package day44_mapsUpdate_nestedMap;

import java.util.Set;

public class C08_NestedMapSoyisimdenOgrenciBulma extends NestedMapDepo {

    public static void main(String[] args) {

        // Verilen soyisme sahip ogrencilerin
        // numara, sinif, sube , isim ve soyisimlerini yazdirin
        String verilenSoyisim = "Can";


        Set<Integer> ogrenciKeySeti = ogrenciNestedMap.keySet();

        for(Integer eachKey :ogrenciKeySeti){

            String  ogrenciSoyisim = ogrenciNestedMap.get(eachKey).get("soyisim");

            if (ogrenciSoyisim.equalsIgnoreCase(verilenSoyisim)){
                System.out.println(  eachKey + " "
                        + ogrenciNestedMap.get(eachKey).get("sinif") +" "
                        + ogrenciNestedMap.get(eachKey).get("sube")+ " "
                        + ogrenciNestedMap.get(eachKey).get("isim")+ " "
                        + ogrenciNestedMap.get(eachKey).get("soyisim"));
            }

        }

    }
}
