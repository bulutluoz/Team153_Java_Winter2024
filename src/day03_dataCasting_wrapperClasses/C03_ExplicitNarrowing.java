package day03_dataCasting_wrapperClasses;

public class C03_ExplicitNarrowing {

    public static void main(String[] args) {

        /*

            Explicit narrowing yaptigimizda
            Java atama yaptigimiz degeri,
            atama yapilan variable'in data turune uyacak sekilde daraltir

            bu darltma sirasinda bazi deger kayiplari ( virgulden sonranin silinmesi gibi)
            veya deger donusumleri ( int 130'un byte -126 olmasi gibi) olabilir
         */

        int sayi1 = 50;

        byte byt1 = (byte)sayi1;

        System.out.println("50'nin byte olarak degeri : " + byt1); // 50


        int sayi2 = 130;

        byte byt2 = (byte)sayi2;

        System.out.println("130'nin byte olarak degeri : " + byt2); // -126


        int sayi3 = 140;

        byte byt3 = (byte)sayi3;

        System.out.println("140'nin byte olarak degeri : " + byt3); // -116



        int sayi4 = 260;

        byte byt4 = (byte)sayi4;

        System.out.println("260'nin byte olarak degeri : " + byt4); // 4


        int sayi5 = 780;

        byte byt5 = (byte)sayi5;

        System.out.println("780'nin byte olarak degeri : " + byt5); // 12


        double dbl1 = 34.75;

        byte byt6 = (byte)dbl1 ;

        System.out.println("34.75'nin byte olarak degeri : " + byt6); // 34



        int a = 43;

        int b = a ; // auto widening veya  explicit narrowing degil
                    // bildigimiz atamadir















    }
}
