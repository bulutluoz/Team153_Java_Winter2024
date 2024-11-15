package day23_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_MethodOlarak {

    public static void main(String[] args) {
        System.out.println(ilkNFibonacciSayisi(-5)); // []
        System.out.println(ilkNFibonacciSayisi(0)); // []
        System.out.println(ilkNFibonacciSayisi(1)); // [0]
        System.out.println(ilkNFibonacciSayisi(2)); // [0, 1]
        System.out.println(ilkNFibonacciSayisi(10)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

        System.out.println("=================");

        System.out.println(ustSinirdanKucukFibonacciSerisiOlustur(-45)); // []
        System.out.println(ustSinirdanKucukFibonacciSerisiOlustur(0)); // [0]
        System.out.println(ustSinirdanKucukFibonacciSerisiOlustur(1)); // [0, 1, 1]
        System.out.println(ustSinirdanKucukFibonacciSerisiOlustur(10)); // [0, 1, 1, 2, 3, 5, 8]
        System.out.println(ustSinirdanKucukFibonacciSerisiOlustur(34)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]



    }

        // Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

    public static List<Integer> ilkNFibonacciSayisi ( int n ){

        List<Integer> fibonacciSerisi = new ArrayList<>(); //[]

        if (n <= 0){  // -3 tane fibonacci sayisini listeye ekle
            return fibonacciSerisi;

        } else if (n == 1) { // 1 tane fibonacci sayisini listeye ekle
            fibonacciSerisi.add(0);
            return fibonacciSerisi;

        } else { // n 2 veya daha buyuk bir sayi
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i < n ; i++) {

                fibonacciSerisi.add( fibonacciSerisi.get(i-2) + fibonacciSerisi.get(i-1)  );
            }
            return fibonacciSerisi;
        }
    }

    // Kullanicidan pozitif bir tamsayi alip,
    // o tamsayidan kucuk Fibonacci sayilarini bir liste olarak donduren bir method olusturun.

    public static List<Integer> ustSinirdanKucukFibonacciSerisiOlustur( int ustSinir ){

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (ustSinir < 0){
            return fibonacciSerisi;
        } else if ( ustSinir == 0 ) {
            fibonacciSerisi.add(0);
            return fibonacciSerisi;
        } else if (ustSinir == 1 ) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
            return fibonacciSerisi;
        }else {

            int enBuyukFibonacciSayisi = 1;
            int siradakiIndex = 3;

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            while (enBuyukFibonacciSayisi < ustSinir){

                enBuyukFibonacciSayisi = fibonacciSerisi.get(siradakiIndex-2) +
                                         fibonacciSerisi.get(siradakiIndex-1);

                if (enBuyukFibonacciSayisi<=ustSinir){
                    fibonacciSerisi.add(enBuyukFibonacciSayisi);
                }

                siradakiIndex++;

            }

            return fibonacciSerisi;

        }

    }

}
