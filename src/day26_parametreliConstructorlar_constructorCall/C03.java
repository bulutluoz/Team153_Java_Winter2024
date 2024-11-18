package day26_parametreliConstructorlar_constructorCall;

public class C03 {

    C03(){
        // Bir constructor'in icinden baska bir constructor'i ismi ile call edemezsiniz
        // cunku isim(); syntax'i method call'a ozeldir.
        // eger constructor call yapmak istiyorsaniz
        // constructor'in ismi yerine this(5) yazariz

        this(5); // once 5'i parametre olarak kabul edecek constructor'i calistir

        System.out.println("parametresiz constructor calisti");
    }
    C03(int a){

        System.out.println("int parametreli constructor calisti");
    }

    C03(String a){

        System.out.println("String parametreli constructor calisti");
    }



    public static void main(String[] args) {

        C03 obj1 = new C03(5); // int parametreli constructor calisti

        C03 obj2 = new C03();





    }
}
