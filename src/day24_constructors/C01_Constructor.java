package day24_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {


    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);


        Random rnd = new Random();


        C02_Hemsire hemsire1 = new C02_Hemsire();
        hemsire1.isim = "Canan";
        hemsire1.adres = "Balgat";

        System.out.println(hemsire1.isim); // Canan
        System.out.println(hemsire1.adres); // Balgat
        System.out.println(hemsire1.tel); // Tel atanmadi


            C02_Hemsire    hemsire2    =      new     C02_Hemsire();
        //  Class ismi    obje ismi  atama  keyword    Constructor
        // Bir class'dan obje olusturulup ilk deger atamasi yapmak icin
        // MUTLAKA bir constructor CALISMALIDIR

        hemsire2.isim = "Sumeyra";


        System.out.println(  new C02_Hemsire().isim  );
        // 40.satirda new keyword'u ile yeni bir obje olusturulur
        // sadece o satirda bu obje kullanilabilir
        // ama bir variable'a kaydedilmedigi icin
        // (esitligin sol tarafi olmadigi icin)
        // bu obje o satirda kullanilir ve sonra cop olur


        C02_Hemsire hemsire3;

        // System.out.println(hemsire3.isim);
        // Variable 'hemsire3' might not have been initialized
        // Constructor calismadigi icin
        // obje olusturulup ilk deger atamasi (initialize) yapilmamistir

        // Local'de olusturulan variable'lar
        // deger atanmadan olusturulabilir
        // ama deger atanmadan KULLANILAMAZ


        C02_Hemsire hemsire4 = null ;
        // Constructor calismadigi icin
        // obje olusturulup ilk deger atamasi (initialize) yapilmamistir
        // System.out.println(hemsire4.isim); // NullPointerException


        String str;
        //System.out.println(str);

    }
}
