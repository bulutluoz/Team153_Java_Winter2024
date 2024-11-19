package day27_staticKeyword_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {
        /*
            1- ayni scope icinde ayni isimde variable olusturamazsiniz
            2- local variable'lar farkli scope'dan kullanilamaz
            3- farkli scope'larda ayni isimde variable'lar olusturulabilir
               farkli scope'lardaki ismi ayni olan variable'lar ayni variable degillerdir
            4- Java'da bir variable baska method'a yollanirsa
               variable'in kendisi degil value'su gonderilir
               Pass By Value
         */

        String str = "Ali";

        // String str = "Veli";

        int a = 60;
        // method1(a); method'da 300 yazdirdi

        int sayi = 70;
        method1(sayi); // method'da 350 yazdirir

        System.out.println(sayi); // 70

    }


    public static void method1(int sayi){

        // System.out.println(str);

        String str ;


        System.out.println(sayi);

    }
}
