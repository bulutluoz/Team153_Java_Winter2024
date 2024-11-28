package day33_Inheritance;

public class C07_Child extends C06_Parent{

    C07_Child(){
        // super();
        System.out.println("Child class parametresiz constructor calisti");
    }
    /*
        Child class'da olusturulan bir objenin
        parent class'daki variable'lara sahip olabilmesi icin
        parent class'daki Constructor'in MUTLAKA CALISMASI gerekir

        Java bunu bildigi icin
        "extends" keyword kullanan class'larda (child class'larda)
        olusturulan veya var olan HER CONSTRUCTOR'in ilk satirina
        super(); koyar

        super(); ==> once parent class'daki parametresiz constructor'i calistir
                     demektir

        constructor call() sadece 1 kere yapilabilir
        ve ilk satirda olmalidir
        Eger ilk satira kod yazan kisi baska bir constructor call yazarsa
        yani gorunur bir constructor call varsa
        java'nin otomatik koydugu super() silinir
     */


    String isim = "Child isim";
    String tel = "Child telefon";
    String meslek = "Child meslek";

    public static void main(String[] args) {

        // parent-child iliskisi olusturmadan once
        // C07_Child class'indan olusturulan objeler
        // sadece C07 class'indaki ozelliklere sahip olurlar

        //C07_Child child1 = new C07_Child();

        //System.out.println(child1.isim); // Child isim
        //System.out.println(child1.meslek); // Child meslek
        //System.out.println(child1.tel); // Child telefon
        //System.out.println(child1.adres);
        // parent olarak tanimlanmadigi icin ulasilamaz

        // parent-child iliskisi olusturulduktan sonra
        /*
            Bir obje olusturuldugunda
            class'daki instance variable'larin birer kopyasini alip
            objeye yapistiran Constructor'dir

            Child class'dan bir obje olusturuldugunda
            parent class'daki variable'larin da objeye yapistirilmasi icin
            parent class constructor'i CALISMAK ZORUNDADIR

            Java bunu super() sayesinde yapar

            boylece child class constructor'i calismadan once
            varsa parent constructor'lari calisir
            ve o class'lardaki instance variable'larin
            birer kopyasini objeye yapistirir

         */

        C07_Child child2 = new C07_Child();
        System.out.println(child2.isim); // Child isim
        System.out.println(child2.tel); // Child telefon
        System.out.println(child2.meslek); // Child meslek

        System.out.println(child2.adres); // Parent adres
        System.out.println(child2.sehir); // Parent sehir


    }
}
