package day25_constructors;

public class C06_ArabaRunner {

    public static void main(String[] args) {

        C05_Araba araba1 = new C05_Araba("Mercedes","E200",9999);

        System.out.println(araba1);
        // Ozellikler : marka='Mercedes', model='E200', yakit='Yakit atanmadi', yil=1900, fiyat=9999

        C05_Araba araba2 = new C05_Araba("Tofas","Sahin","Otogaz",1990,10000);
        System.out.println(araba2);
    }
}
