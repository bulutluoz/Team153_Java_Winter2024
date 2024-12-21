package day44_mapsUpdate_nestedMap;

public class C05_NestedOgrenciMapKullanma extends NestedMapDepo{

    public static void main(String[] args) {

        System.out.println(ogrenciNestedMap);

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

        mapeOgrenciEkle(108,"Sumeyra","Yilmaz","11","K","MF");

        System.out.println(ogrenciNestedMap);

        /*
            {
                101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
                105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
                106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
                107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra},
                108={sinif=11, sube=K, soyisim=Yilmaz, bolum=MF, isim=Sumeyra}
                }
         */


        // numarasi verilen ogrencinin isim ve soyismini yazdirin

        int ogrenciNo = 105;
        System.out.println(ogrenciNestedMap.get(105).get("soyisim")); // Cem


        // numarasi verilen ogrencinin
        // soyismini verilen yeniSoyisim olarak update edin
        ogrenciNo = 102;
        String yeniSoyisim = "Yilmaz";

        ogrenciNestedMap.get(ogrenciNo).replace("soyisim",yeniSoyisim);


        // numarasi verilen ogrencinin bolumunu
        // verilen yeni bolum olarak update edin
        ogrenciNo = 105;
        String yeniBolum = "MF";

        ogrenciNestedMap.get(ogrenciNo).replace("bolum",yeniBolum);



        // numarasi verilen ogrencinin sinifini ve subesini
        // verilen yeni sinif ve yeni sube olarak update edin

        ogrenciNo = 103;
        int yeniSinif = 11;
        String yeniSube = "P";

        ogrenciNestedMap.get(103).replace("sinif","11");
        ogrenciNestedMap.get(103).replace("sube","P");


        System.out.println(ogrenciNestedMap);

    }
}
