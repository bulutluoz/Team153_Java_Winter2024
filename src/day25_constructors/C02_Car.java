package day25_constructors;

public class C02_Car {


    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String yakit = "Yakit atanmadi";
    int yil = 1900;
    int fiyat;
    /*
        Java her class'dan obje olusturulabilmesi icin
        her class'a default bir constructor koyar

        Bu default constructor
        gorunmez, parametresizdir ve body'sinde kod yoktur

        Kod yazan kisi gorunur bir constructor olusturursa
        java default constructor'i siler.

        Biz yeni constructor olusturdugumuzda
        daha once default constructor kullanarak
        olusturulan objeler CTE verir

        O ZAMAN
        bir class'da gorunur parametreli bir constructor olusturdugumuzda
        daha once olusturulan objelere zarar vermemek icin
        bir tane de
        default constructor yerine
        parametresiz bir constructor OLUSTURMALIYIZ

     */

    public C02_Car(){

    }

    public C02_Car(String mrk, String mdl ,String ykt, int yl, int fyt) {

        marka = mrk;
        model = mdl;
        yakit = ykt;
        yil = yl;
        fiyat = fyt;

    }


    public C02_Car(String mrk, String mdl , int yl, int fyt) {

        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;

    }

    public C02_Car(String mrk, String mdl, int fyt) {

        marka = mrk;
        model = mdl;
        fiyat = fyt;

    }









    @Override
    public String toString() {
        return "Ozellikler : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }

}
