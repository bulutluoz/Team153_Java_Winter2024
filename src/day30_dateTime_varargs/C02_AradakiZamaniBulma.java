package day30_dateTime_varargs;

import java.time.Duration;
import java.time.LocalTime;

public class C02_AradakiZamaniBulma {

    public static void main(String[] args) {
        // asagidaki loop'un calisma suresini bulun


        LocalTime baslangic = LocalTime.now();


        String str = "";

        for (int i = 0; i <150000 ; i++) {
            str +=i;
        }

        LocalTime bitis = LocalTime.now();


        System.out.println("baslama zamani : " + baslangic);
        System.out.println("bitis zamani : " + bitis);

        // 1.yontem Duration ile aradaki zamani bulabiliriz
        System.out.println(Duration.between(baslangic, bitis));
        // PT  3.764262 S

        // 2.yontem saniye olarak aradaki farki bulmak isterseniz

        System.out.println( baslangic.toSecondOfDay() ); // 68240
        // gece 00:00'dan baslangic anina kadar gecen zamani saniye olarak verir

        System.out.println(  bitis.toSecondOfDay() - baslangic.toSecondOfDay() ); // 3

        // 3.yontem nanosaniye olarak farki bulabiliriz

        System.out.println( bitis.toNanoOfDay() - baslangic.toNanoOfDay()); // 3224882000

    }
}
