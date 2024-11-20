package day28_passByValue;

public class C01_PassByValue {

    public static void main(String[] args) {

        int sayi = 20;
        kareYazdir(sayi); // kare yazdir method'unda 400 yazdirdi

        int a = 10;
        kareYazdir(a); // kare yazdir method'unda 100 yazdirdi


    }


    public static void kareYazdir(int sayi){

        sayi = sayi*sayi ;

        System.out.println(sayi);
    }

}
