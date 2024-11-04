package day16_methodOverloading_whileLoop;

public class C02_MethodOverloading {

    public static void main(String[] args) {

        ortalama(40,70); // 1 ==> 55
        ortalama(45.7,67.8); // 2 ==> 56.75
        ortalama(56,75.6); // 4 ==> 65.8

        /*
            Java hangi method'un calisacagina karar vermek icin adim adim ilerler
            1- eger method call'daki signature ile %100 uyusan method varsa o calisir
            2- %100 uyumlu olani bulamazsa, auto widening kullanip casting ile
               calistirabilecegi var mi diye kontrol eder
            3- %100 uyumlu bulmadigimizda, casting ile calisabilecek
               birden fazla method olursa
               daha az casting ile islem yapan method'u tercih eder
         */
        ortalama(45.7,67); // 2  2 ondalikli sayinin ortalamasi =56.35
        ortalama(45.6F, 34.7F); // 2 casting ile 2 numara calisir 2 ondalikli sayinin ortalamasi =40.14999961853027


        short sayi = 46;
        ortalama(sayi, 78); // 1    2 tamsayinin ortalamasi =62
        ortalama('a','t'); // 1   2 tamsayinin ortalamasi =106



    }


    public static void ortalama ( int a , int b ){ // ortalama int int

        System.out.println( "Girilen 2 tamsayinin ortalamasi =" + (a+b)/2 );
    }// ortalama int int  1

    public static void ortalama ( double a , double b ){

        System.out.println( "Girilen 2 ondalikli sayinin ortalamasi =" + (a+b)/2 );
    } // ortalama double double 2

    public static void ortalama ( float a , int b ){

        System.out.println( "Float ve tamsayinin ortalamasi =" + (a+b)/2 );
    } // ortalama float int 3

    public static void ortalama ( int a , double b ){

        System.out.println( "tamsayi ve ondalikli sayinin ortalamasi =" + (a+b)/2 );
    } // ortalama int double 4

    //public static void ortalama ( double a , int b ){
        // ortalama double int ile ortalama int double signature olarak farklidir
        //System.out.println( "tamsayi ve ondalikli sayinin ortalamasi =" + (a+b)/2 );
    //} // ortalama int double 4


}
