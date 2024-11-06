package day17_doWhileLoop_scope;

public class C03_Scope {

    String  s = "Super";
    static int k = 20;

    public static void main(String[] args) {
        String str =  "Java candir";
        // a = 40;
        System.out.println(k);
        //System.out.println(s);
        method1();
        // method2();


    }

    public static void method1(){
        // System.out.println(str);
        int a = 10;
        k = 25;
        //System.out.println(s);
        //method2();
    }

    public void method2(){
        // str = "Tava";
        // System.out.println(a);
        k= 30;
        System.out.println(s);
        method1();
    }

}
