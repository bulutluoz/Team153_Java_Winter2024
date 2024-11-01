package day15_methodOlusturmaVeKullanma;

public class C08_AradakiSayilariToplama {

    public static void main(String[] args) {
        // tamsayi olarak verilen baslangic ve bitis degerleri icin
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini donduren bir method olusturun
        // baslangicin bitisten kucuk veya buyuk olmasi durumunda method calismali

        System.out.println(aradakiSayilarinToplami(1, 4)); // 10


    }

    public static int aradakiSayilarinToplami(int baslangic, int bitis){

        int toplam = 0;


         if ( baslangic < bitis ) {

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;
            }

        }else{ // baslangic >= bitis

            for (int i = bitis; i <=baslangic ; i++) {
                toplam += i;
            }

        }

       return  toplam;

    }
}
