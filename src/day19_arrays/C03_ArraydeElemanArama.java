package day19_arrays;

public class C03_ArraydeElemanArama {

    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin

        int[] sayilar = {3,4,5,7,3,4,8,5,4,3,8,3,4,3,4,6};

        int arananSayi = 9;


        elemanAra(sayilar,9); // Array'de aranan sayi bulunmuyor.
        elemanAra(sayilar,3); // Aranan sayi array'de 5 adet bulunuyor
        elemanAra(sayilar,6); // Aranan sayi array'de 1 adet bulunuyor

    }

    // Verilen bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void elemanAra( int[] sayilar , int arananSayi ){
        int sayac = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i] == arananSayi){
                sayac++;
            }
        }

        System.out.println(
                sayac==0 ?
                        "Array'de aranan sayi bulunmuyor." :
                        "Aranan sayi array'de " + sayac + " adet bulunuyor"
        );

    }

}
