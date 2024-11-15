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

        System.out.println("Car2 "+car2);
        // Ozellikler : marka='Nissan', model='Note', yakit='Benzin', yil=2015, fiyat=3500

        C02_Car car3 = new C02_Car("BMW","5.20","Dizel",2005,9000);
        System.out.println("Car3 "+car3);
        // Ozellikler : marka='BMW', model='5.20', yakit='Dizel', yil=2005, fiyat=9000


        C02_Car car4 = new C02_Car("Volvo","S60","Benzin",2017,20000);
        System.out.println("Car4 " + car4);
        // Car4 Ozellikler : marka='Volvo', model='S60', yakit='Benzin', yil=2017, fiyat=20000


        C02_Car car5 = new C02_Car("Ford","Focus",3000);
        System.out.println("Car5 "+car5);
        // Car5 Ozellikler : marka='Ford', model='Focus', yakit='Yakit atanmadi', yil=1900, fiyat=3000



    }


}
