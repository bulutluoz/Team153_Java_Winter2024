package day03_dataCasting_wrapperClasses;

public class C07_WrapperClassCasting {


    public static void main(String[] args) {

        /*
            primitive data turlerinden
            sayisal deger icerenler
            kendi aralarinda auto-widening veya explicit narrowing ile casting yapabilirler


            ANCAKKKK

            Wrapper class'lar sadece kendileri ile ayni olan primitive'ler ile etkilesebilirler
            farkli data turundeki Wrapper class'lar arasinda
            CASTING YAPILAMAZ
         */

        short shrt = 45;

        int sayi = shrt ;  // auto widening


        long lng = 46;

        byte byt = (byte)lng;  // explicit narrowing


        int sayi2 = 56;

        Integer sayi3 = sayi2 ;  // Integer <== int Java bunu sorunsuz atama olarak kabul eder

        int sayi4 = sayi3; // int <== Integer


        Short shr1 = 45;

        // Integer sayi5 = shr1 ; //  Integer <== Short
        // Integer sayi6 = (Integer)shr1 ; //  Integer <== Short


        // zorla cozelim

        short sayiGecis1 = shr1;
        int sayiGecis2 = sayiGecis1;

        Integer sayi6 = sayiGecis2;


        System.out.println(sayi6);



    }
}
