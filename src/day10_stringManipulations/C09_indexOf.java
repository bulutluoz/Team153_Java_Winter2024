package day10_stringManipulations;

public class C09_indexOf {

    public static void main(String[] args) {

        String str = "Java bana cok mantikli geliyor";

        System.out.println(str.contains("cok")); // true
        System.out.println(str.startsWith("cok")); // false
        System.out.println(str.endsWith("cok")); // false
        System.out.println(str.equals("cok")); // false
        System.out.println(str.equalsIgnoreCase("cok")); // false

        // verilen metinde "cok" kelimesi kullanildigini biliyoruz
        // ama yerini bilmiyoruz
        // indexOf(arananMetin) aranan metnin cumledeki ILK KULLANIMINI bulur
        // ve index'ini bize getirir


        System.out.println(str.contains("a")); // true
        System.out.println(str.indexOf("a")); // 1

        // "Java bana cok mantikli geliyor"

        System.out.println(str.indexOf("cok")); // 10

        System.out.println(str.indexOf("mantik")); // 14

        // a'nin ilk kullanim index'inin 1 oldugu bilindigine gore
        // a'nin ikinci kullanim index'ini yazdirin

        System.out.println(str.indexOf('a', 1)); // 1

        System.out.println(str.indexOf('a', 2)); // 3

        // a'nin 2.kullanim index'inin 3 oldugunu biliyorsak
        // 3.kullanim index'ini yazdirin

        System.out.println(str.indexOf("a", 4)); // 6

        System.out.println(str.indexOf("B")); // -1


    }
}
