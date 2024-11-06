package day18_scope;

public class C01_Hastane {

    static String hastaneIsmi = "Java Hastanesi";
    static String hastaneTel = "03122343434";
    static String hastaneAdresi = "Cankaya";
    static String bashekim = "Dr Yusuf";

    // personel bilgileri kisiye ozeldir
    // ve sadece O kisiyi ilgilendirir
    String perIsmi = "Isim atanmadi";
    String perTel = "Tel atanmadi";
    String perAdresi = "Adres atanmadi";

    public static void main(String[] args) {

        System.out.println(hastaneIsmi); // Java Hastanesi
        System.out.println(hastaneTel); // 03122343434
        System.out.println(hastaneAdresi); // Cankaya
        System.out.println(bashekim); // Dr Yusuf

        hastaneAdresi= "Yenimahalle";
        System.out.println(hastaneAdresi); // Yenimahalle


        // personel bilgileri Instance olarak olusturuldu
        // Yaniii objeye baglidir
        // obje olmadan kullanilamaz
        // System.out.println(perIsmi); // Java Hastanesi
        // System.out.println(perTel); // 03122343434
        // System.out.println(perAdresi); // Cankaya

        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1.perIsmi); // Isim atanmadi
        System.out.println(per1.perTel); // Tel atanmadi
        System.out.println(per1.perAdresi); // Adres atanmadi


        per1.perIsmi = "Aldemir";
        per1.perTel = "5324323232";
        per1.perAdresi = "Cevizlidere";

        System.out.println(per1.perIsmi); // Aldemir
        System.out.println(per1.perTel); // 5324323232
        System.out.println(per1.perAdresi); // Cevizlidere


        C01_Hastane per2 = new C01_Hastane();
        System.out.println("pers2 : "+per2.perIsmi); // Isim atanmadi
        System.out.println("pers2 : "+per2.perTel); // Tel atanmadi
        System.out.println("pers2 : "+per2.perAdresi); // Adres atanmadi

        per2.perIsmi = "Yigit";
        per2.perTel = "5434323434";
        per2.perAdresi = "Balgat";

        System.out.println("pers1 : "+per1.perIsmi); // Aldemir
        System.out.println("pers2 : "+per2.perIsmi); // Yigit


        C01_Hastane per3 = new C01_Hastane();
        per3.perIsmi="Mehmet";
        per3.perTel="5453664055";
        per3.perAdresi="Saskatoon";

        System.out.println("pers1 : "+per1.perIsmi); // Aldemir
        System.out.println("pers2 : "+per2.perIsmi); // Yigit
        System.out.println("pers3 : "+per3.perIsmi); // Mehmet


        per3.bashekim = "Dr Canan";
        // static variable'lar tum class'dan direkt kullanilabilir
        // AMMA obje uzerinden de yazilsa Java CTE vermez, kodu calistirir

        System.out.println("pers1 : "+per1.bashekim); // Dr Canan
        System.out.println("pers2 : "+per2.bashekim); // Dr Canan
        System.out.println("pers3 : "+per3.bashekim); // Dr Canan


        per2.hastaneAdresi = "Balgat";

        System.out.println("pers1 : "+per1.hastaneAdresi); // Balgat
        System.out.println("pers2 : "+per2.hastaneAdresi); // Balgat
        System.out.println("pers3 : "+per3.hastaneAdresi); // Balgat
        System.out.println(hastaneAdresi); // Balgat





    }

    public static void staticMethod(){

    }

    public void staticOlmayanMethod(){

    }
}
