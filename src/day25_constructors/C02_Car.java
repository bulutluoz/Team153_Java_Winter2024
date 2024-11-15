package day25_constructors;

public class C02_Car {


    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String yakit = "Yakit atanmadi";
    int yil = 1900;
    int fiyat;








    public C02_Car(String mrk, String mdl ,String ykt, int yl, int fyt) {

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
