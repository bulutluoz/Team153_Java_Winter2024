package day40_Exceptions;

import java.util.List;

public class C03_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1- StringIndexOutOfBoundsException
        // 2- ArrayIndexOutOfBoundsException

        // 3- NullPointerException
        //    null olarak isaretlenen non-primitive bir variable'i
        //    yazdirma islemi disinda bir islemde kullanirsak olusur
        String str = null;
        System.out.println(str); // null
        System.out.println("Ali" + str); // Alinull
        //System.out.println(str.length()); // NullPointerException
        //System.out.println(str.toUpperCase());//NullPointerException

        List<Integer> sayilar = null;
        System.out.println(sayilar); // null
        //System.out.println(sayilar.size()); // NullPointerException

        // 4- ArithmeticException

        //System.out.println( 9 / 0 ); // ArithmeticException


        // 5- RunTimeException
        //    Run Time'da olusan tum exception'larin parent'idir

        // 6- Exception
        //    Butun exception'larin parent'idir

        // 7- FileNotFoundException
        //    bir dosyaya ulasmak istedigimizde, dosya yolu hatali oldugunda olusur

        // 8- IOException
        //    Dosya okuma ve dosyaya yazma ile ilgili tum exception'larin parent'idir


        // 9- InputMissmatchException :
        //    Scanner ile deger alirken, kullanilan method ile girilen deger
        //    uyumlu olmadiginda olusur

        // 10 - NumberFormatException

        String fiyat1 = "23y";
        String fiyat2 = "45";

        //System.out.println("Fiyatlarin toplami : " +  (Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2)) );

        //Fiyatlarin toplami : 68

        // 11- ClassCastException
        //     Uygun olmayan bir cast islemi yapinca ortaya cikar

        String s = "Ali";

        Object obj = s;

        Integer a = 45;

        obj = a;

        Object c= 56;

        Integer d = (Integer) c;

        System.out.println(d); // 56

        String tt = (String) c; // c'nin data turu Object oldugu icin
                                // String Object'e cast edilebilir ammmmaaa degeri 56
        System.out.println(tt);

        //String k = 56;
    }
}
