package day15_methodOlusturmaVeKullanma;

public class C06_AsalMiDondur {

    public static void main(String[] args) {

        // verilen pozitif bir tamsayiyi inceleyip
        // asal ise true, degilse false donduren bir method olusturun

        System.out.println(isAsal(23)); // true
        System.out.println(isAsal(55)); // false


    }


    public static boolean isAsal( int sayi ){

        boolean sonuc = false;

        for (int i = 2; i <sayi ; i++) {

            if ( sayi % i == 0){
                sonuc = false;
                break; // for loop'u bitirir
            }

            if ( i == sayi-1){
                sonuc = true;
            }
        }

        return sonuc;

    }
}
