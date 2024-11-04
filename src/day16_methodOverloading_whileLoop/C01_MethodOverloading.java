package day16_methodOverloading_whileLoop;

public class C01_MethodOverloading {

    public static void main(String[] args) {

        /*
            Bir class'da ayni isimde birden fazla method olusturulmasina
            OVERLOADING denir.

            overloading bir isme birden fazla method yuklenmesi demektir

            Java bir class'da ismi ve signature'i ayni method'lara IZIN VERMEZ

            overloading olmasi icin isim ayni olmak zorunda oldugundan,
            geriye signature degistirmek kaliyor

            ortalama(int, int)
            Signature = method ismi + parametre sayisi + parametrelerin data turleri

         */

        ortalama(45,56); // 2 tamsayinin ortalamasi =50

        ortalama(34.4 , 76.3); // 2 ondalikli sayinin ortalamasi =55.349999999999994

        ortalama(5,78,67); // 3 ==> 3 tamsayinin ortalamasi =50

        ortalama(45.7 , 78); // ortalama double int
                                  // 2 ondalikli sayinin ortalamasi =61.85


    }


    public static void ortalama ( int a , int b ){ // ortalama int int

        System.out.println( "Girilen 2 tamsayinin ortalamasi =" + (a+b)/2 );
    }// ortalama int int  1

    public static void ortalama ( int a  ){ // ortalama int

        System.out.println( "Girilen 1 tamsayinin ortalamasi =" + a );
    }// ortalama int  2

    public static void ortalama ( int a , int b, int c ){ // ortalama int int int

        System.out.println( "Girilen 3 tamsayinin ortalamasi =" + (a+b+c)/3 );
    }// ortalama int int int 3

    public static void ortalama ( double a , double b ){

        System.out.println( "Girilen 2 ondalikli sayinin ortalamasi =" + (a+b)/2 );
    } // ortalama double double 4

    // public static void ortalama ( int sayi1 , int sayi2 ){
        // 'ortalama(int, int)' is already defined in 'day16_C01'

        //System.out.println( "Girilen 2 tamsayinin ortalamasi =" + (sayi1+sayi2)/2 );
    //}

}
