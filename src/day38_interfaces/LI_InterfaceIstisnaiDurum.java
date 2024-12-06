package day38_interfaces;

public interface LI_InterfaceIstisnaiDurum {

    void method1();  // method1 public ve abstract'tir

    public abstract int method2(); // method2 public ve abstract'tir


    public default void method3(){

    }


    public static void method4(){


    }

    // public default void method5(); // Extension method should have a body

    // public static void method6(); // Static methods in interfaces should have a body
}
