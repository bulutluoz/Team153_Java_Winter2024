package day34_inheritance;

public class C03_Child extends C02_P{
    /*
        1- Java extends keyword kullanan bir class'daki
           her constructor'in ilk satirinda
           Constructor Call olmasini ZORUNLU kilmistir

        2- Kodu yazan kisi ilk satira
           constructor Call koymazsa
           Java otomatik olarak super(); koyar

        3- Java'nin koydugu super();
           hangi constructor'in icinde olursa olsun
           parametresizdir.

        4- Child class'da bir obje olusturdugumuzda
           constructor'lar super(); mekanizmasi sayesinde
           extends kullanmayan ilk class'a kadar
           otomatik olarak gider

        5- extends kullanmayan class'a ulasildiginda
           obje olusturulur,
           ve her class'daki ilk calisan constructor
           o class'daki instance variable'lar ve degerlerinin
           birer kopyasini alip objeye yapistirir

        6- eger constructor variable'a atama yaparken
           o variable daha onceki parent'larda olusturulmussa
           o variable'i yeni olusturmaz, update eder

           boylece child class'a kadar variable'lara
           en GUNCEL degerler atanmis olur.

        7- Kodu yazanlar super(ilgiliParametreler) yerine
           this(ilgiliParametreler) de kullanabilir
           super() ==> parent class'daki constructor
           this()  ==> icinde olunan class'daki
                        constructor'lari cagirir



     */

    C03_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }

    C03_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }

    C03_Child(int a){
        // super(); java default olarak koyar
        System.out.println("C int parametreli constructor calisti");
    }

    public static void main(String[] args) {

        C03_Child child3 = new C03_Child(25);
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //C int parametreli constructor calisti








        //C03_Child child2 = new C03_Child("a");
        //GP int parametreli constructor calisti
        //GP String parametreli constructor calisti
        //P int parametreli constructor calisti
        //C String parametreli constructor calisti



        //C03_Child child1 = new C03_Child();
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //P String parametreli constructor calisti
        //C parametresiz constructor calisti

    }
}
