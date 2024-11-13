package day23_arrayList_forEachLoop;

public class C09_SinirlarinDisindaKalanElemanSayisi {

    public static void main(String[] args) {

        // verilen int bir array'de
        // verilen baslangic ve bitis degerleri (sinirlar dahil) arasinda olmayan
        // eleman sayisini yazdirin

        int[] arr = {3,78,34,98,1,34,67,43,78,11,84,45};

        int baslangic= 25;
        int bitis = 80;

        int sayac = 0;

        for ( int each  :arr){

            if (each < baslangic || each > bitis ){
                sayac++;
            }

        }

        System.out.println("Sinirlar arasinda olmayan eleman sayisi : " + sayac);






    }
}
