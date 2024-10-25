package day10_stringManipulations;

public class C03_substring {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.substring(3)); // a candir

        System.out.println(str.substring(9)); // ir

        System.out.println(str.substring(10)); // r


        System.out.println(str.charAt(str.length() - 1)); // sondan 1. karakteri yazdirir r
        System.out.println(str.substring(str.length() - 1)); // r
        // sondan 1.karakterden baslayip, sona kadar butun karakterleri yazdirir


        // "Java candir";
        System.out.println(str.charAt(str.length() - 2)); // sondan 2. karakteri yazdirir i
        System.out.println(str.substring(str.length() - 2)); // ir  son 2 karakteri yazdirir
        // sondan 2.karakterden baslayip, sona kadar butun karakterleri yazdirir

        System.out.println(str.charAt(str.length() - 4)); // sondan 4. karakteri yazdirir n
        System.out.println(str.substring(str.length() - 4)); // ndir  son 4 karakteri yazdirir
        // sondan 4.karakterden baslayip, sona kadar butun karakterleri yazdirir


        // "Java candir";

        System.out.println(str.length()); // 11
        // str'in son karakterinin index'i : 10

        // System.out.println(str.charAt(str.length()));
        // str.charAt(11) ==> StringIndexOutOfBoundsException


        System.out.println(str.substring(str.length())); // hiclik (bos satir) yazdirir
        // str.substring(11)

        // System.out.println(str.charAt(12)); // StringIndexOutOfBoundsException

        // System.out.println(str.substring(12)); // StringIndexOutOfBoundsException
    }
}
