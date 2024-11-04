package day16_methodOverloading_whileLoop;

public class C03_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        // 2 basamakli pozitif sayilardan 23 ile bolunenlerin toplamini yazdirin
        /*
            Eger baslangic ve bitis degerleri
            veya loop'un kac kere calisacagi belli ise
            for loop daha ideal olacaktir
         */

        // for loop ile yapalim

        int toplam = 0;

        for (int i = 10; i <100 ; i++) {

            if ( i % 23 == 0){
                toplam += i;
            }
        }

        System.out.println(toplam); // 230     23,46,69,92


        // ayni soruyu while loop ile yapalim
        toplam = 0;

        int sayi = 10;

        while ( sayi < 100) {

            if ( sayi % 23 == 0){
                toplam += sayi;
            }
            sayi++;
        }

        System.out.println(toplam); // 230
    }
}
