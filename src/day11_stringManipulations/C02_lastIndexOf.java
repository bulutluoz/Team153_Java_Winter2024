package day11_stringManipulations;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String metin = "Bu java halledilecek.";

        // ilk a'nin index'i
        System.out.println(metin.indexOf('a')); // 4

        // cumlede gecen son a'nin index'i
        System.out.println(metin.lastIndexOf("a")); // 9

        // a'nin 2. kullanimin index'i
        int birinciIndexa = metin.indexOf('a');
        System.out.println(metin.indexOf('a', birinciIndexa+1)); // 6

        // a'nin sondan 2. kullaniminin index'i
        int aninSonIndexi = metin.lastIndexOf("a");
        System.out.println( metin.lastIndexOf("a",aninSonIndexi-1)  ); // 6


        // java'nin ilk kulaniminin index'i
        System.out.println(metin.indexOf("java")); // 3

        // java'nin son kulaniminin index'i
        System.out.println( metin.lastIndexOf("java")); // 3


        // "Bu java halledilecek.";

        // h'nin ilk kulaniminin index'i
        System.out.println(metin.indexOf('h')); // 8

        // h'nin son kulaniminin index'i
        System.out.println( metin.lastIndexOf("h")); // 8


        // Java'nin ilk kulaniminin index'i
        System.out.println(metin.indexOf("Java")); // -1


        // Java'nin son kulaniminin index'i
        System.out.println(metin.lastIndexOf("Java")); // -1

    }
}
