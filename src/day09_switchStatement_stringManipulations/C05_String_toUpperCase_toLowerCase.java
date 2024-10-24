package day09_switchStatement_stringManipulations;

import java.util.Locale;

public class C05_String_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); //  JAVA CANDIR

        System.out.println(str); // Java Candir

        /*
            String'de method ile yapilan degisiklikler
            sadece o satira aittir.
            String'de kalici degisiklik yapmaz

            Eger method ile yapilan degisikligin kalici olmasini istiyorsak
            ATAMA yapmaliyiz
         */

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        /*
            Eger bir dilde
            bir harfin kucuk ve buyuk hali ingilizde'den farkli ise
            ornegin
                I'yi ingilizce olarak kucuk yaparsak i, ama Turkce yaparsak ı olur
                i'yi ingilizce buyuk harf yapsak I , ama turkce yaparsak İ olur
         */

        System.out.println(str.toLowerCase()); // java candir

        System.out.println( str.toLowerCase(Locale.forLanguageTag("Tr")) ); // java candır

        str = str.toLowerCase();

        System.out.println(str); // java candir

        System.out.println( str.toUpperCase()); // JAVA CANDIR

        System.out.println( str.toUpperCase(Locale.forLanguageTag("Tr")));// JAVA CANDİR




    }
}
