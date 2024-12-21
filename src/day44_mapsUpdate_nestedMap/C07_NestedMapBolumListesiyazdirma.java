package day44_mapsUpdate_nestedMap;

import java.util.Set;

public class C07_NestedMapBolumListesiyazdirma extends NestedMapDepo {

    public static void main(String[] args) {

        // Verilen bolumdeki tum ogrencileri
        // numara, sinif, isim, soyisim'lerini yazdirin

        String istenenBolum = "TM";

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

            String ogrenciBolum = ogrenciNestedMap.get(eachKey).get("bolum");
            if (ogrenciBolum.equals(istenenBolum)){

                System.out.println(  eachKey + " "
                        + ogrenciNestedMap.get(eachKey).get("sinif") +" "
                        + ogrenciNestedMap.get(eachKey).get("isim")+ " "
                        + ogrenciNestedMap.get(eachKey).get("soyisim")    );
            }


        }

    }
}
