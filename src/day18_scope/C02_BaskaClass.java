package day18_scope;

public class C02_BaskaClass {

    public static void main(String[] args) {

        /*

            Baska class'dan method'lara ve
            class level variable'lara ulasmak isterseniz
            yine static keyword'une dikkat etmelisiniz

            static olarak isaretlenen hersey
            class'la ilintilidir ve class ismi ile kullanilabilir

            instance variable'lar ve
            static olmayan method'lar ise
            obje ile ilintilidir ve
            obje ismi ile cagrilirlar
         */

        System.out.println(C01_Hastane.hastaneIsmi);
        C01_Hastane.staticMethod();


        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1.perAdresi);
        per1.staticOlmayanMethod();

        C01_Hastane.bashekim = "Aldemir";



    }
}
