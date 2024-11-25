package day30_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C03_LocalDate {

    public static void main(String[] args) {

        // LocalDate class'i da LocalTime Class'ina benzer ozelliklere sahiptir
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2024-11-25

        // japonya'daki tarihi yazdiralim
        LocalDate japonyaTarih = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(japonyaTarih); // 2024-11-26

        LocalDate dogumTarihi1 = LocalDate.of(1990,10,15);
        LocalDate dogumTarihi2 = LocalDate.ofYearDay(1990,234);


        // dogumtarihi1 de dogan kisinin yasini yazdirin
        System.out.println(Period.between(dogumTarihi1, localDate)); // P 34Y 1M 10D


        System.out.println(dogumTarihi1.isBefore(dogumTarihi2)); // false


        // 1990 artik yil mi ?
        System.out.println(dogumTarihi1.isLeapYear()); // false


        // 2024 artik yil mi ?
        System.out.println(localDate.isLeapYear()); // true

        // 2000 yili leap year mi ?

        LocalDate yil2000 = LocalDate.of(2000,1,1);
        System.out.println(yil2000.isLeapYear()); // true

        System.out.println(localDate.getDayOfYear()); // 330

        System.out.println(localDate.getDayOfWeek()); // MONDAY

        System.out.println(localDate.withMonth(1)); // 2024-01-25

        System.out.println(localDate.lengthOfMonth()); // 30



    }
}
