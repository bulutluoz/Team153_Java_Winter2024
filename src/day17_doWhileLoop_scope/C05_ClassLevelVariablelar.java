package day17_doWhileLoop_scope;

public class C05_ClassLevelVariablelar {
    /*
        Class Level variable demek
        Local bir kod blogunun icinde degil
        direk class icerisinde olusturulan variable'lardir

        Ve scope'lari tum Class'dir

        Yaniiii teknik olarak tum class'dan kullanilabilirler

        ANCAKKK kullanma yontemi variable'in static olup olmamasina gore degisir

        - static variable'lar tum class'dan direkt kullanilabilirler
        - static olmayan variable'lar icin
          method'lar secici olurlar
          eger method static ise static olmayan hic bir seyi sinirlarindan iceri almaz

         method static degilse (secici degilse)
         o zaman herkese buyur gel der
     */

    static int sayiS = 20;
    int sayiI;

    String strI = "Tava";
    static String strS ;


    public static void main(String[] args) {
        // static int a = 20;
        // Modifier 'static' not allowed here
        // Local variable'lar static olarak olusturulamaz
        sayiS = 45;
        System.out.println(strS);
        // System.out.println(sayiI);
        // strI= "";
        method1();
        // method2();
    }

    public static void method1(){
        System.out.println(sayiS);
        strS= "Hava";
    }

    public void method2(){
        sayiS = 67;
        System.out.println(strS);
        System.out.println(strI);
        System.out.println(sayiI);
    }
}
