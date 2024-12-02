package day34_inheritance;

public class C01_GP {

    C01_GP(){
        System.out.println("GP parametresiz constructor calisti");
    }

    C01_GP(String s){
        this(4);
        System.out.println("GP String parametreli constructor calisti");
    }

    C01_GP(int a){
        System.out.println("GP int parametreli constructor calisti");
    }
}
