package day38_interfaces;

public interface I02_ParentInterface1 {

    int sayi1 = 20;
    int sayi2 = 40;

    public void boyut();

    //public int gramaj();

    public String isim();

    // sonradan abstract bir method ekleyelim

    //public void method10();
    /*
        Bir interface'e sonradan
        abstract bir method eklemek mumkundur
        ANCAAAKKK devam eden bir projede
        bir interface'e abstract method eklendiginde
        o interface'i daha once implement etmis
        BUTUN CLASS'lar yeni method'u implement etmek zorunda kalir

        Bu sebeple
        Java8'e kadar interface'e sonradan method eklemek
        cok riskli bir hareket olarak tanimlaniyordu

        Java8 ile buna bir istisna getirildi

     */
}
