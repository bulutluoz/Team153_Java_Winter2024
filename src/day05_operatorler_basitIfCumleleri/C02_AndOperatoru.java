package day05_operatorler_basitIfCumleleri;

public class C02_AndOperatoru {

    public static void main(String[] args) {


        boolean deger1 = true;
        boolean deger2 = false;
        boolean deger3 = true;
        boolean deger4 = false;

        int a = 10;
        int b = 15;

        boolean genelSonuc = (deger1= a<b) && (deger2= a>0 ) && (deger3 = b<0) && (deger4=b>10);


        System.out.println("genel sonuc : " + genelSonuc); // false
        System.out.println("deger4 : " + deger4); // false

        // islem sirasinda son atama yapilmadigi icin islem kismen hizli olur
        // AMMMA son atamadaki islem onemli ise o islem yapilmamis oldu


        deger1 = true;
        deger2 = false;
        deger3 = true;
        deger4 = false;


        genelSonuc = (deger1= a<b) & (deger2= a>0 ) & (deger3 = b<0) & (deger4=b>10);


        System.out.println("genel sonuc : " + genelSonuc); // false
        System.out.println("deger4 : " + deger4); // true

        // islem odakli oldugu icin & operatoru 4 islemi de yapar
        // 4 islemi de kontrol ettigi icin &&'e gore biraz yavas olur
        // tum islemleri yaptigi icin deger4'e dogru degerin atanmasini saglar




    }
}
