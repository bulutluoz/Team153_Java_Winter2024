package day33_Inheritance;

public class C03_Corolla extends C02_Toyota {

    String model = "Corolla";
    String kasa = "Corolla kasa";
    String uretimYeri = "Turkiye";
    String lastik = "15 inc pirelli lastik";
    String sanzuman = "VVTI sanzuman";
    String fren = "X marka ABS fren sistemi";

    public static void main(String[] args) {

        C03_Corolla corolla1  = new C03_Corolla();

        System.out.println(corolla1.renk); // A  Renk secilmedi

        System.out.println(corolla1.marka); // T  Toyota
        System.out.println(corolla1.motor); // T Toyota motor
        System.out.println(corolla1.aku); // T inci aku

        System.out.println(corolla1.fren); // C  X marka ABS fren sistemi
        System.out.println(corolla1.kasa); // C  Corolla kasa
        System.out.println(corolla1.lastik); // C  15 inc pirelli lastik
        System.out.println(corolla1.uretimYeri); // C  Turkiye
        System.out.println(corolla1.sanzuman); // C  VVTI sanzuman
        System.out.println(corolla1.model);// C  Corolla

        corolla1.renk= "Mavi";



    }
}
