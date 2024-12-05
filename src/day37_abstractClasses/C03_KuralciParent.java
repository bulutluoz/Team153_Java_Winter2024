package day37_abstractClasses;

public abstract class C03_KuralciParent {

    /*
        java'da parent class'lar child class'larini belirleyemez

        Ama EGER
        "Beni parent edinecek class'lar
         benim belirledigim method'lari bulundurmak zorunda kalsin"
        demek istiyorsaniz
        abstraction kullanmalisiniz.

        1- Eger bir parent class'i
           child class'lar uzerinde soz sahibi kilmak icin
           o class'i abstract class/interface yapmalisiniz

        2- class'da bulunan method'lardan
           hangilerini child class'larin bulundurmasi zorunlu olacaksa
           o method'lari belirlemeli ve
           abstract method yapmalisiniz

           abstaract (soyut) bir body'si olmayan yapi demektir

           bu method'lar bizim bildigimiz method'lardan farklilasirlar
           adete standart'lardaki bir cumle gibi olurlar

     */

    // child class'larin bulundurmasi zorunlu olsun
    // child class'larin method1'i bulundurmasi zorunludur.
    // Abstract methods cannot have a body
    public abstract void method1();

    // child class'larin bulundurmasi zorunlu olsun
    public abstract int method2();

    // child class'larin bulundurmasi zorunlu olmasin
    public String method3(){

        return null;
    }

    // child class'larin bulundurmasi zorunlu olmasin
    public void method4(){

    }


    public static void main(String[] args) {

        /*
            Abstract yapilar OBJE OLUSTURMAK icin degil
            Kendilerini parent edinen class'lar icin
            standartlari belirlemeyi amaclar

            abstract yapilar abstract method'lar barindirdigi icin
            concrete(somut) class'lar gibi
            obje olusturamazlar

            Concrete : abstract olmayan
                       bugune kadar olusturdugumuz tum class'lar ve method'lar
                       soyut olmadiklari icin concrete olarak adlandirilir

         */



        // C03_KuralciParent obj = new C03_KuralciParent();
        // 'C03_KuralciParent' is abstract; cannot be instantiated
        // C03 abstract class oldugundan, obje olusturulamaz
        // obj.method1();

    }
}
