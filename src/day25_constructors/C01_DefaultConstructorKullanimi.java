package day25_constructors;

public class C01_DefaultConstructorKullanimi {

    String isim = "isim atanmamis";
    int yas = 40;
    String adres = "Yenimahalle";


    public static void main(String[] args) {

        /*
            Eger default constructor kullanilarak bir obje olusturulursa

            1- Olusturulan her obje baslangic olarak
               class level'da instance variable'lara atanan degerlere sahip olur

            2- Her obje baslangic itibariyle
               instance variable'a atanan degerlere sahip olacagi icin
               bu degerleri verirken
               spesifik degerler atamak yerine
               olusturulacak TUM OBJELER icin gecerli genel bir ifade olmalidir

               Bu ornekteki gibi
               yas 40, adres Yenimahalle atamasi olursa
               her obje 40 yasinda ve Yenimahalle'de oturuyor seklinde olusturulacaktir

            3- Default constructor kullanilarak olusturulan her obje
               basta atanan degerlere sahip olur
               Oysa gercek her obje
               o objeye ait ozel bilgilere sahip olmalidir

               Ornegin bu class'i konusursak
               olusturulan her objeye
               kendi isim, kendi adres ve kendi yas bilgileri
               tek tek atanmak zorunda kalinir.
         */


        C01_DefaultConstructorKullanimi obj1 = new C01_DefaultConstructorKullanimi();

        System.out.println(obj1.yas); // 40
        System.out.println(obj1.adres); // Yenimahalle
        System.out.println(obj1.isim); // isim atanmamis

        obj1.isim = "Yigit";
        obj1.adres = "Romanya";

        System.out.println(obj1.yas); // 40
        System.out.println(obj1.adres); // Romanya
        System.out.println(obj1.isim); // Yigit

        C01_DefaultConstructorKullanimi obj2 = new C01_DefaultConstructorKullanimi();

         obj2.isim = "Murat";
         obj2.yas = 32;
         obj2.adres = "Cankaya";








    }

}
