package day19_arrays;

public class C02_ArrayinTumElemanlarinaUlasma {

    public static void main(String[] args) {

        int[] sayilar = {3,4,5,7,3,4,8,5,4,3,8,3,4,3,4,6};

        // sayilar array'indeki tum elemanlarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];

        }

        System.out.println("Tum elemanlarin toplami : " + toplam);

        // {3,4,5,7,3,4,8,5,4,3,8,3,4,3,4,6};
        // sayilar array'inde kac adet cift sayi vardir?

        int sayac = 0 ;

        for (int i = 0; i < sayilar.length ; i++) {

            if ( sayilar[i] % 2 == 0 ){
                sayac++;
            }

        }

        System.out.println("Arraydeki cift sayi adedi : " + sayac); // 8


        // sayilar array'indeki tek sayilarin toplamini yazdirin
        // {3,4,5,7,3,4,8,5,4,3,8,3,4,3,4,6};
        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if ( sayilar[i] % 2 != 0 ){

                toplam += sayilar[i];
            }

        }

        System.out.println("Array'deki tek sayilarin toplami : " + toplam ); // 32


        // Array'deki en buyuk sayiyi yazdirin
        // {3,4,5,7,3,4,8,5,4,3,8,3,4,3,4,6};

        int enBuyukSayi = sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {


            if ( sayilar[i] > enBuyukSayi  ){

                enBuyukSayi = sayilar[i];
            }


        }

        System.out.println("Array'deki en buyuk eleman : " + enBuyukSayi); // 8

    }
}
