package day34_inheritance;

public class C05_Child extends C04_Parent{

    String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";

    public static void main(String[] args) {
        C05_Child obj = new C05_Child();
        obj.method1();
    }

    public void method1(){

        String str = "Child class method";
        String t = "Cansu";
        String z = "Oguzhan";

        /*
            Bir scope'da herhangi bir variable'i kullanmak istedigimizde
            1- Java once icinde bulundugumuz scope'a bakar
            2- scope'da bulamazsa class level'a bakar
            3- class level'da da bulamazsa parent class(lar)'a bakar

            Kullanici isterse bu siralamayi byPass edebilir
            Eger scope'u byPass edip direkt class level'i kullanmak isterse this. ....
            Eger scope'u ve class level'i byPass edip
            direkt parent class'a gitmek isterse super. .... kullanabilir

            baslangic seviyesi soylendiginde
            o seviyeden aramaya baslar
            bulamazsa ileri dogru gider
            ama asla geri donus olmaz

            method'lar icin de aynisi gecerlidir
            hic bir sey yazilmazsa method2() ==> icinde bulundugu class'da arar
                                                 bulamazsa parent class'a gider

            this.method2() ==> icinde bulundugu class'da arar, bulamazsa parent class'a gider

            super.method2() ==> aramaya direkt parent class'dan baslar

         */

        System.out.println(str); // Child class method  ==> scope'da buldu ve kullandi
        System.out.println(this.str); // Child class ==> class level'dan aramaya baslar
                                      //                 bulur ve kullanir
        System.out.println(super.str); // Java candir ==> aramaya parent class'dan baslar
                                       //                 bulur ve kullanir


        System.out.println(z); // Oguzhan ==> scope'da bulur ve yazar
        //System.out.println(this.z); // direkt class level'a gider,
                                    // bulamayinca parent'a da bakar
                                    // orada da yok CTE
        //System.out.println(super.z); // aramaya parent'dan baslar
                                     // parent'da z yok CTE


        System.out.println(t); // Cansu  ==> scope'da buldu ve kullandi
        System.out.println(this.t); // Hamza  scope'u pass gecti, direkt class level'a gitti
        //System.out.println(super.t); // aramaya parent'dan baslar
                                       // bulamadigi icin CTE olur

        System.out.println(k); // Ahmet ==> scope'da bulamadi class level'a gitti
        System.out.println(this.k); // Ahmet scope'u pass gecip direk class'da aradi
        //System.out.println(super.k); // aramaya parent'dan baslar, bulamadigi icin CTE olur

        System.out.println(s); // Anil ==> scope'da ve class level'da bulamadi
                               //          parent class'a gider
        System.out.println(this.s); // Anil ==> class'da bulamayinca parent'a gitti
        System.out.println(super.s); // Anil ==> direkt parent'a gider





    }

}
