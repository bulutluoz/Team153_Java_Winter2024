package day11_stringManipulations;

public class C06_replace {

    public static void main(String[] args) {

        String str = "java ogrenmek cok zevkli";

        System.out.println(str.replace('a', 'A')); // jAvA ogrenmek cok zevkli

        System.out.println(str.replace("zevkli", "eglenceli")); // java ogrenmek cok eglenceli

        str = str.replace("j","J");

        System.out.println(str); // Java ogrenmek cok zevkli


        // butun e'leri silin
        System.out.println(str.replace("e", "")); // Java ogrnmk cok zvkli

        // str'da space haric kac karakter var?
        System.out.println(str.replace(" ", "").length()); // 21


        System.out.println(str.replace('x', 'y')); // Java ogrenmek cok zevkli




    }
}
