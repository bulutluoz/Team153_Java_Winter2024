package day25_constructors;

public class C05_Araba {

    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String yakit = "Yakit atanmadi";
    int yil = 1900;
    int fiyat;

    public C05_Araba(){

    }

    // marka, model ve fiyat'i parametre olarak alan bir constructor olusturun
    public C05_Araba(String mrk , String mdl , int fyt){
        marka = mrk;
        model = mdl;
        fiyat = fyt;
    }

    // tum instance variable'lari kendi isimleri ile parametre olarak alan bir constructor olusturun


    public C05_Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
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
