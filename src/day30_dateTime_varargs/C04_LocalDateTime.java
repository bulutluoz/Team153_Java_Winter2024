package day30_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihZaman = LocalDateTime.now();

        System.out.println(tarihZaman);// 2024-11-25 T 19:29:58.632491

        /*
            Eger tarih ve saati istediginiz bir form'da yazdirmak isterseniz
            once o formati olusturmalisiniz
            format olusturduktan sonra ldt'yi istenen formatla yazdirabilirsiniz

            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */



        // 25/11/2024
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;
        System.out.println(tarihZaman.format(format1)); //    25/11/2024

        // 25 Kasim 2024 19:29
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");
        System.out.println(tarihZaman.format(format2)); // 25 November 2024 19:44

        // 25 Kas 24 07:29 pm
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd MMM yy hh:mm a");
        System.out.println(tarihZaman.format(format3)); // 25 Nov 24 07:46 PM


        // 25.11.24 Pazartesi
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd.MM.yy EEEE");
        System.out.println(tarihZaman.format(format4)); // 25.11.24 Monday


        // 7:29 pm
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(tarihZaman.format(format5)); // 7:50 PM


        // Paz 19:05
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("eee HH:mm");
        System.out.println(tarihZaman.format(format6)); // Mon 19:52



    }
}
