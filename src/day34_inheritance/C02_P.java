package day34_inheritance;

public class C02_P extends C01_GP{

    C02_P(){
        // super(); java default olarak koyar
        System.out.println("P parametresiz constructor calisti");
    }

    C02_P(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C02_P(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
    }
}
