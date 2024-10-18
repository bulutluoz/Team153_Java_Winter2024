package day05_operatorler_basitIfCumleleri;

public class C03_OrOperatoru {

    public static void main(String[] args) {

        /*
            || operatoru de && gibi sonuc odaklidir
            bir tane true buldugunda sonucun true olacagini bilir
            ve geriye kalan islemleri yapmaz

            EGER atamalar onemli ise
            atama islemlerini || isleminden once yapabilirsiniz
         */


        boolean deger1 = false;
        boolean deger2 = false;
        boolean deger3 = false;

        int a = 10;
        int b = 15;


        boolean genelSonuc = (deger1 = a<b) || (deger2=a>0) || (deger3= b>5);


        System.out.println("deger1 : " + deger1); // true
        System.out.println("deger2 : " + deger2); // false
        System.out.println("deger3 : " + deger3); // false
        System.out.println("genel sonuc : " + genelSonuc); // true


        deger1 = false;
        deger2 = false;
        deger3 = false;

        deger1 = a<b;
        deger2=a>0;
        deger3= b>5;


        genelSonuc = deger1 || deger2 || deger3;

        System.out.println("deger1 : " + deger1); // true
        System.out.println("deger2 : " + deger2); // true
        System.out.println("deger3 : " + deger3); // true
        System.out.println("genel sonuc : " + genelSonuc); // true



    }
}
