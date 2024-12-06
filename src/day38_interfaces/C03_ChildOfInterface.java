package day38_interfaces;

public class C03_ChildOfInterface implements I01_Interface {

    public static void main(String[] args) {

        System.out.println(SAYI1); // 10

        // SAYI1 = 45; // Cannot assign a value to final variable 'SAYI1'
    }


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }

    @Override
    public boolean method5() {
        return false;
    }
}
