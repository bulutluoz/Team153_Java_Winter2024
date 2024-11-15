package day25_constructors;

public class C03_CarRunner {


    public static void main(String[] args) {

        C02_Car car1 = new C02_Car();

        System.out.println(car1);
        // Ozellikler : marka='Marka atanmadi', model='Model atanmadi', yakit='Yakit atanmadi', yil=1900, fiyat=0

        car1.marka = "Opel";
        car1.model = "Corsa";
        car1.yakit = "Benzin";
        car1.yil = 2010;
        car1.fiyat = 3000;

        System.out.println(car1);
        // Ozellikler : marka='Opel', model='Corsa', yakit='Benzin', yil=2010, fiyat=3000


        C02_Car car2 = new C02_Car("Nissan","Note","Benzin",2015,3500);


    }


}
