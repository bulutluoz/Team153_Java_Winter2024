package day26_parametreliConstructorlar_constructorCall;

import day25_constructors.C05_Araba;

public class C01_ArabaRunner {

    public static void main(String[] args) {

        C05_Araba araba1 = new C05_Araba();

        System.out.println(araba1);
        // Ozellikler : marka='Marka atanmadi', model='Model atanmadi', yakit='Yakit atanmadi', yil=1900, fiyat=0


        C05_Araba araba2 = new C05_Araba("Audi","Q5",20000);

        System.out.println(araba2);
        // Ozellikler : marka='Audi', model='Q5', yakit='Yakit atanmadi', yil=1900, fiyat=20000


        C05_Araba araba3 = new C05_Araba("Opel","Corsa","Benzin",2012,4000);
        System.out.println(araba3);
        // Ozellikler : marka='Opel', model='Corsa', yakit='Benzin', yil=2012, fiyat=4000



    }


}
