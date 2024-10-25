package day10_stringManipulations;

public class C06_contains {

    public static void main(String[] args) {

        String str = "Bugun cok ama cok mutluyum";

        System.out.println(str.contains("u")); // true

        System.out.println(str.contains("b")); // false

        System.out.println(str.contains("cok ama")); // true


        /*
            CharSequence : char dizilim
                           char'larin yan yana gelmesiyle olusan nesne
                           yaaannniii bildigimiz String
         */

        System.out.println(str.contains("n a")); // false
        // yan yana 3 karakter olarak "n a" arar

        System.out.println(str.contains("")); // true


        // "Bugun cok ama cok mutluyum"

        // verilen str metninin case sensitive olmadan B icerdigini kontrol edin

        // containsIgnoreCase() diye bir method olmadigindan
        // hem ana metni hem de aranan metni toLowerCase() veya toUpperCase() yapip
        // case farkliliklarindan kurtuluruz


        // "Bugun cok ama cok mutluyum"  == "B"

        System.out.println(str.toUpperCase().contains("B")); // true
        System.out.println(str.toLowerCase().contains("b") ); // true

    }

}
