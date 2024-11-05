package day17_doWhileLoop_scope;

public class C04_KodBloklariIcinScope {

    /*
        Bir kod blogu icin ( method, loop vb..) scope
        o kod blogunun suslu parantezlerinin arasidir

        Java'da bir variable'lar ise scope acisindan 2'ye ayrilir
        1- eger bir kod blogunun icerisinde olusturulmussa
           bu variable'lara local variable denir
           ve scope'lari (gecerli olduklari alan)
           icinde olusturulduklari kod blogudur
           ve o kod blogunun disinda KULLANILAMAZLAR
        2- Class level variable'lar
           ilgili class'da aciklama var

     */

    public static void main(String[] args) {

        int sayi = 10;


        for (int i = 0; i <10 ; i++) {
            System.out.println(sayi);
            String str = "Tava";
            System.out.println(i);

        }

        // System.out.println(str);
        // i = 20;

        method1(5);
    }


    public static void method1( int a ){

        // int a da local bir variable'dir
        // ve scope'u icinde olusturuldugu method'dur

        System.out.println(a);
    }



}
