package day15_methodOlusturmaVeKullanma;

public class C05_FaktoryelDondur {

    public static void main(String[] args) {

        // verilen 17'den kucuk pozitif bir tamsayinin
        // faktoryel degerini donduren bir method olusturun

        faktoryelDegeri(5);
        // method calisir AMMMAAA
        // yazdirmadigimiz icin konsolda goremeyiz
        // kaydetmedigimiz icin sonra kullanamayiz


        System.out.println(faktoryelDegeri(6)); // 720

        long faktoryel7 = faktoryelDegeri(7);

        System.out.println(faktoryel7); //


    }

    public static long faktoryelDegeri( int sayi ){

        long carpim = 1;

        for (int i = sayi; i >=1 ; i--) {

            carpim *= i;

        }

        return carpim;

    }

}
