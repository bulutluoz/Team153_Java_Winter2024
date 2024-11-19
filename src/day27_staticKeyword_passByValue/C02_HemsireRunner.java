package day27_staticKeyword_passByValue;

public class C02_HemsireRunner {


    public static void main(String[] args) {

        /*
            Bir variable'i static olarak isaretlemek
            variable'a erisimi cok kolaylastirir

            static variable'lara classIsmi.variableIsmi
            seklinde static yolla erismek mumkun oldugu gibi

            objeIsmi.staticVariableIsmi seklinde de ulasilabilir

            ulasim acisindan bu kolaylik
            yaninda her ulasanin o variable'i degistirebilmesi
            gibi bir yan etkiyi de beraberinde getiriyor

            ozetlersek
            static keyword erisim acisindan AVANTAJLI
                           degeri yonetmek acisindan ise DEZAVANTAJLIDIR
         */

        C01_Hemsire hemsire1 = new C01_Hemsire();
        System.out.println(hemsire1.perIsim); // isim atanmamis
        System.out.println(hemsire1.hastaneIsmi); // Yildiz hastanesi
        // Static member 'hastaneIsmi' accessed via instance reference
        System.out.println(C01_Hemsire.hastaneIsmi); // Yildiz hastanesi


        hemsire1.perIsim = "Yildiz";
        hemsire1.perAdres = "Balgat";
        hemsire1.perTel = "5322343434";


        C01_Hemsire hemsire2 = new C01_Hemsire();

        hemsire2.perIsim = "Tugba";
        hemsire2.perAdres = "Yenimahalle";
        hemsire2.hastaneAdresi = "Yenimahalle";
        hemsire2.bashekim= "Dr Yigit";

        System.out.println(hemsire1.perAdres);// Balgat
        System.out.println(hemsire2.perAdres);// Yenimahalle
        System.out.println(hemsire1.hastaneAdresi); // Yenimahalle
        System.out.println(hemsire2.hastaneAdresi); // Yenimahalle
        System.out.println(C01_Hemsire.hastaneAdresi); // Yenimahalle


        C01_Hemsire hemsire3 = new C01_Hemsire();

        hemsire3.perAdres = "Altindag";
        hemsire3.hastaneAdresi= "Mamak";
        hemsire3.bashekim = "Dr Ahmet";


        System.out.println(hemsire1.perAdres); // Balgat
        System.out.println(hemsire2.perAdres); // Yenimahalle
        System.out.println(hemsire3.perAdres); // Altindag
        System.out.println(hemsire1.hastaneAdresi); // Mamak
        System.out.println(hemsire2.hastaneAdresi);// Mamak
        System.out.println(hemsire3.hastaneAdresi);// Mamak
        System.out.println(C01_Hemsire.hastaneAdresi);// Mamak
        System.out.println(hemsire1.bashekim); // Dr Ahmet
        System.out.println(hemsire2.bashekim); // Dr Ahmet
        System.out.println(hemsire3.bashekim); // Dr Ahmet
        System.out.println(C01_Hemsire.bashekim); // Dr Ahmet


        System.out.println(C01_Hemsire.hastaneIsmi); // Yildiz hastanesi
        System.out.println(hemsire1.hastaneIsmi); // Yildiz hastanesi

        // C01_Hemsire.hastaneIsmi = "Java Hastanesi";
        // Cannot assign a value to final variable 'hastaneIsmi'

        // hemsire2.hastaneIsmi = "Java Hastanesi";
    }
}
