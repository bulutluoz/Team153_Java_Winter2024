package day38_interfaces;

public class K02_CokParentliChild extends K01_ParentAbstractClass
                                  implements I02_ParentInterface1,I03_ParentInterface2{


    @Override
    public void boyut() {

    }

    @Override
    public String isim() {
        return null;
    }

    @Override
    public double gramaj() {

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(I02_ParentInterface1.sayi1);
        System.out.println(I03_ParentInterface2.sayi1);
        System.out.println(I03_ParentInterface2.sayi3);
    }

}
