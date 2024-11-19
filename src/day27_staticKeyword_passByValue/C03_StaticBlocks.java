package day27_staticKeyword_passByValue;

public class C03_StaticBlocks {

    C03_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    static {
        System.out.println("static blok2 calisti");
        /*
            Bir class'da birden fazla static blok varsa
            kendi iclerinde once ustteki static blok calisir
         */
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");



    }


    static {
        System.out.println("static blok1 calisti");
        /*
            static blok class'daki herseyden hatta main method'dan bile once calisir

            EGER class calismaya baslamadan once
            yapilmasi gereken bir islem varsa
            (ornegin database baglantisi yapamk, belirli variable'lara baslangic degeri atamak...)
            static variable kullanilir

            EGER boyle bir ihtiyaciniz yoksa
            hic kullanmasaniz da olur
         */

    }


    public static void method1(){
        System.out.println("method1 calisti");
    }
}
