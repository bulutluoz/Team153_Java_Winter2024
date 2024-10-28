package day11_stringManipulations;

public class C07_replaceFirst {

    public static void main(String[] args) {

        String str = "13 sen ver, 5 de ben ekleyeyim 18 olsun";

        // ilk s'yi S yapin

        System.out.println(str.replaceFirst("s", "S")); // 3 Sen ver, 5 de ben ekleyeyim 8 olsun

        // ilk space'i * yapin

        System.out.println(str.replaceFirst(" ", "*")); // 3*sen ver, 5 de ben ekleyeyim 8 olsun

        // ilk sayi yerine * yapin
        System.out.println(str.replaceFirst("3", "*")); // dinamik degildir,
                                                                        // cumle degisirse bu kod calismayabilir
        System.out.println(str.replaceFirst("\\d", "*")); // dinamiktir
                                                                         // cumle ne olursa olsun calisir

        /*
            \\s : space	                \\S : space olmayan hersey         \\s+ : yanyana birden fazla space
\           \\d : digits		        \\D : digit olmayan hersey
\           \\w : harf, rakam veya _	\\W : harf, rakam veya _ olmayan hersey

         */

    }
}
