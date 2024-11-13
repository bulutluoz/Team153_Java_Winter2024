package day23_arrayList_forEachLoop;

public class C05_AraliktakiAsalSayilariBulma {

    public static void main(String[] args) {

        // verilen baslangic ve bitis sayilari (sinirlar dahil) arasindaki
        // asal sayilari yazdirin
        // Asal sayi : 1 ve kendisinden baska hicbir tamsayiya bolunemeyen sayilardir
        // C04'deki method kullanilabilir

        int baslangic= 10;
        int bitis = 30;

        for (int i = baslangic ; i <=bitis ; i++) {

            int tamBolenSayisi = C04_TamBolenlerListesi.pozitifTamBolenlerListesi(i).size();

            if (tamBolenSayisi == 2){

                System.out.print(i + " ");
            }
        }
    }
}
