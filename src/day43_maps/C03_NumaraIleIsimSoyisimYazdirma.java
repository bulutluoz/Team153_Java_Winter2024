package day43_maps;

public class C03_NumaraIleIsimSoyisimYazdirma extends MapDepo{

    public static void main(String[] args) {

        // numarasi verilen ogrencinin isim ve soyismini yazdirin

        int ogrenciNo = 105;

        // 1.adim ogrenci no ile value'ye ulasabiliriz
        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Sevgi-Cem-11-M-TM

        // 2.adim bilgilere erisebilmek icin value'yu split ederiz
        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        // 3.adim istenen bilgileri yazdir

        System.out.println(ogrenciNo + " numarali ogrencinin isim ve soyismi : " +
                                        ogrenciValueArr[0] + " " + ogrenciValueArr[1]);




    }
}
