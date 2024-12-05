package day37_abstractClasses;

public abstract class C07_Toyota extends C05_Araba{

    @Override
    public void motor() {
        System.out.println("Toyota motor");
    }

    @Override
    public void teker() {
        System.out.println("pirelli teker");
    }

    @Override
    public void marka() {
        System.out.println("Toyota");
    }

    public abstract void guvenlik();

    public abstract void cevrecilik();


}
