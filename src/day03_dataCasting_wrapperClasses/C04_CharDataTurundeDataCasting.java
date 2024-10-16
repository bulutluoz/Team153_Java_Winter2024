package day03_dataCasting_wrapperClasses;

public class C04_CharDataTurundeDataCasting {

    public static void main(String[] args) {

        /*
            char data turundeki bir variable veya deger
            MATEMATIKSEL bir isleme girerse
            ASCII table'daki degeri devreye girer
         */


        char chr = 'a';

        byte byt = (byte)chr;
        short shrt = (short) chr;
        int sayi = chr;
        long lng = chr;
        float flt = chr;
        double dbl = chr;


        System.out.println( "a" + "b" + "c"); // abc

        System.out.println( 'a' + 'b' + 'c'); // 97+98+99 ==> 294

        System.out.println( '1' + '2'); // 99

        System.out.println(  'g' > 'a'); // true


        // s'den sonraki harfi yazdirin

        System.out.println( 's' + 1 ); // 116

        System.out.println(   (char) ('s' + 1)  ); // t


        // benim istedigime cevir





    }
}
