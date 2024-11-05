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


     */

    public static void main(String[] args) {


        for (int i = 0; i <10 ; i++) {

            String str = "Tava";
        }



    }


    public static void method1(){


    }



}
