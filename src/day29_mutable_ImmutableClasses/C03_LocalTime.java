package day29_mutable_ImmutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C03_LocalTime {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime); // 21:07:06.936248
        // 9.satirdaki kod ne zaman calisirsa
        // o andaki bilgisayarimizdaki zamani alip kaydeder
        // kronometre veya canli saat degildir
        // 9.satirdaki kodun calistigi zamani kaydeder

        String s="" ;

        for (int i = 0; i <30000 ; i++) {
             s += i;
        }

        localTime= LocalTime.now();
        System.out.println(localTime); //


        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("japonya saati : " + japonyaSaati);
        // japonya saati : 05:15:27.131114


        LocalTime newyorkSaati = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(newyorkSaati);
        // 15:18:08.264194
    }
}
