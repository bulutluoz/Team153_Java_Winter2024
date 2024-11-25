package day30_dateTime_varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        // calistigi satirda sistemden saat bilgisini alir
        System.out.println(localTime); // 18:35:17.752044

        LocalTime localTimeJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(localTimeJaponya);
        // 02:36:19.494323

        LocalTime istenenZaman1 = LocalTime.of(10,20,13);
        System.out.println(istenenZaman1); // 10:20:13

        LocalTime istenenZaman2 = LocalTime.of(14,23);
        System.out.println(istenenZaman2); // 14:23

        LocalTime localTimeSaniye = LocalTime.ofSecondOfDay(24567);
        System.out.println(localTimeSaniye); // 06:49:27

        // ...get(); zamandan istenen bolumunu alir
        System.out.println(localTime.getHour()); // 18

        // plus...() zamani ileri alir, minus...() zamani geri alir
        System.out.println(localTime.plusHours(234).plusMinutes(23)); // 13:05:50.764208
        System.out.println(localTime.minusMinutes(25000)); // 10:03:50.270905


        // with...() elde edilen saatin istenen bolumunu istenen deger ile getirir
        System.out.println(localTime.withSecond(0).withNano(0)); // 18:45


        System.out.println(istenenZaman1.isBefore(istenenZaman2)); // true
        System.out.println(istenenZaman2.isAfter(istenenZaman1)); // true

    }
}
