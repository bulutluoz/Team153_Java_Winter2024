package day24_constructors;

public class C04_Araba {



    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String yakit = "Yakit atanmadi";
    int yil = 1900;
    int fiyat;

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
