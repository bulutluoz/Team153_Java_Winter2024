package day24_constructors;




public class C02_Hemsire {

    C02_Hemsire(){
        // default constructor buna benzer
        // ama bu default constructor degildir
        // bir constructor gorunuyorsa default cons. olamaz
    }


    String isim = "Isim atanmadi";
    String adres = "Adres atanmadi";
    String tel = "Tel atanmadi";

        /*
            Java OOP (Object Oriented programming)kullanir
            yani obje olusturup
            olusturulan objelerle islem yapmaya dayanir

            Java her class'dan obje olusturulabilmesi icin
            her class'a GORUNMEYEN bir constructor koyar
            Bu constructor'a DEFAULT CONSTRUCTOR denir.

            default constructor
                - Gorunmez
                - Parametresizdir
                - body'sinde kod yoktur


            Kodu yazan kisi
            Class'da gorunur bir constructor olusturursa
            Java Default Constructor'i SILER

            Gorunur bir constructor varsa o class'da Default Constructor YOKTUR
         */
        /*
            Constructor syntax olarak method'a benzer
            ANCAK method degildir

            Bir kod blogunun constructor olabilmesi icin
            2 sarti MUTLAKA saglamasi gerekir

            1- Ismi class ismi ile tamamen ayni olmalidir
            2- return type olmamalidir
         */

        /*
              Method'lar naming convention'a gore
              kucuk harfle baslar ve camel case kullanilir

              Ancak buyuk harfle baslasa da
              Java CTE vermez
         */

    public void BuyukIsimliMethod(){

    }

    public void C02_Hemsire(){
        // return type oldugu icin method'dur
    }

}
