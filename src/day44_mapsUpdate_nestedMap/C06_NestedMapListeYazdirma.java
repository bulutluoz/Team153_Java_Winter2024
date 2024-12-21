package day44_mapsUpdate_nestedMap;

import java.util.Set;

public class C06_NestedMapListeYazdirma extends NestedMapDepo{

    public static void main(String[] args) {

        // Verilen siniftaki tum ogrencilerin
        // numara, isim, soyisim ve subelerini yazdirin

        int sinif = 11;

        // 1.adim tum key'leri bir set olarak kaydet
        Set<Integer> ogrenciKeySeti = ogrenciNestedMap.keySet();


        // 2.adim key'leri gozden gecirmek icin bir for-each loop olusturup
        //        istenen bilgileri yazdir
        /*
            {
                101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
                105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
                106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
                107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra}
                }
         */

        for (Integer eachKey :ogrenciKeySeti){

            String ogrenciSinif = ogrenciNestedMap.get(eachKey).get("sinif");
            if (ogrenciSinif.equals("11")){

                System.out.println(  eachKey + " "
                                        + ogrenciNestedMap.get(eachKey).get("isim") +" "
                                        + ogrenciNestedMap.get(eachKey).get("soyisim")+ " "
                                        + ogrenciNestedMap.get(eachKey).get("sube")    );
            }


        }

    }
}
