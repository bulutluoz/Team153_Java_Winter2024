package day30_dateTime_varargs;

public class C08_Varargs {

    public static void main(String[] args) {

        // Kac tane argument yazarsak yazalim
        // son argument haric geriye kalanlari toplayip
        // bulunan toplam ile son argumanin carpimini yazdiran bir method olusturun

        islem(1,2,3,4,5,6,7); // 147
        islem(1,2,3,4,5); // 50
        islem(1,2,3); // 9
        islem(1); // 0

        // method1(3,4,5,"Ali");
        int[] arr = {3,4,5};
        method1(arr,"Ali");
    }


    public static void method1(int[] arr , String s){

    }

    //public static void islem( int... geriyeKalanlar , int a  ){
        // KURAL 1 - Varargs bir method'da parametre olacaksa, son PARAMETRE olmalidir
        // KURAL 2 - Kural 1'den dolayi bir method'da iki varargs OLMAZ
    //}


    public static void islem(int... tumSayilar){
        // vararg tum sayilari istedigi icin, son sayiyi ayri parametre yapamayiz
        // bunun yerine tum sayilari vararg'a koyup
        // vararg icinde son sayiyi ayiralim

        int toplam =0;
        for (int i =0 ;  i <tumSayilar.length-1 ; i++) {
            toplam+=tumSayilar[i];
        }

        System.out.println(  tumSayilar[tumSayilar.length-1] * toplam);


    }
}
