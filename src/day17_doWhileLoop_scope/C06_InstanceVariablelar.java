package day17_doWhileLoop_scope;

public class C06_InstanceVariablelar {
    /*
        Class level variable'larda
        ister static olsun isterse Instance olsun
        deger atama mecburiyeti YOKTUR

        biz deger atamazsak
        Java default degerler atayacaktir
        non-primitive       ==> null
        sayisal primitive   ==> 0
        char                ==> hiclik
        boolean             ==> false
     */

    static String strS = "Hava";
    static int sayiS;
    static char chrS = 't';
    static boolean blS ;


    String strI ;
    int sayiI = 45;
    char chrI ;
    boolean blI = true;

    public static void main(String[] args) {

        System.out.println(strS); // Hava
        System.out.println(sayiS); // 0
        System.out.println(chrS); // t
        System.out.println(blS); // false

        // static olmayan variable'lar static method'larda direkt kullanilamazlar
        // Ancak obje olusturularak, obje uzerinden kulllanilabilirler

        // System.out.println(strI); //
        // System.out.println(sayiI); //
        // System.out.println(chrI); //
        // System.out.println(blI); //


        C06_InstanceVariablelar obj = new C06_InstanceVariablelar();

        System.out.println(obj.strI); // null
        System.out.println(obj.sayiI); // 45
        System.out.println(obj.chrI); // hiclik
        System.out.println(obj.blI); // true




    }
}
