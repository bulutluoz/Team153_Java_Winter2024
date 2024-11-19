package day27_staticKeyword_passByValue;

public class C04_StaticOlmayanBlok {

    C04_StaticOlmayanBlok(){
        System.out.println("constructor calisti");
    }

     {
        System.out.println("static olmayan blok2 calisti");

    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C04_StaticOlmayanBlok obj1 = new C04_StaticOlmayanBlok();

        C04_StaticOlmayanBlok obj2 = new C04_StaticOlmayanBlok();

        C04_StaticOlmayanBlok obj3 = new C04_StaticOlmayanBlok();
    }


     {
        System.out.println("static olmayan blok1 calisti");
        /*
            static olmayan bloklar ise
            EGER bir obje olusturulmadan once yapilmasi gereken ayarlar varsa
            bu ayarlari yapmak uzere kullanilir
         */


    }


    public static void method1(){
        System.out.println("method1 calisti");
    }
}
