package day28_passByValue;

public class C02_IndirimliFiyat {
    // Main method’da verilen fiyat degerine
    // %10, %20 ve %30 indirim yaparak,
    // indirimli fiyati bize döndüren 3 method olusturun.

    public static void main(String[] args) {

        int fiyat = 200;

        // yuzde10Indirim(fiyat); // konsolda birsey gorunmez cunku yazdirmadik
                                  // atama yapmadigimiz icin yapilan degisiklik kalici olmaz
                                  // 12.satir CALISIR ama bize bir faydasi olmaz

        System.out.println(   yuzde10Indirim(fiyat)   ); // 180.0
        System.out.println("yuzde 10 indirimli fiyati yazdirdiktan sonra, main method'daki fiyat : " + fiyat);

        System.out.println(   yuzde20Indirim(fiyat)   ); // 160.0
        System.out.println("yuzde 20 indirimli fiyati yazdirdiktan sonra, main method'daki fiyat : " + fiyat);

        System.out.println(   yuzde30Indirim(fiyat)   ); // 140.0
        System.out.println("yuzde 30 indirimli fiyati yazdirdiktan sonra, main method'daki fiyat : " + fiyat);


        // degisikligi kalici yapmak istersek
        // fiyati kalici olarak %10 indirimli fiyat degerine indirin
        // virgulden sonrasini silin

        fiyat = (int)yuzde10Indirim(fiyat);

        System.out.println("Kalici indirimden sonra main method'daki fiyat : " + fiyat); // 180


        // fiyati indirimli fiyat uzerinden bir kere daha
        // kalici olarak %20 indirin

        fiyat = (int)yuzde20Indirim(fiyat);
        System.out.println("Kalici 2. indirimden sonra main method'daki fiyat : " + fiyat); // 144


    }


    public static double yuzde10Indirim(double fiyat){

        fiyat = fiyat * 90 / 100 ;

        return fiyat;
    }

    public static double yuzde20Indirim(double fiyat){

        fiyat = fiyat * 80 / 100 ;

        return fiyat;
    }

    public static double yuzde30Indirim(double fiyat){

        fiyat = fiyat * 70 / 100 ;

        return fiyat;
    }
}
