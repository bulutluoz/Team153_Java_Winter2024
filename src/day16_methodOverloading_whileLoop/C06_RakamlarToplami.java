package day16_methodOverloading_whileLoop;

public class C06_RakamlarToplami {

    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin
        // rakamlar toplamini donduren bir method olusturun

        System.out.println(rakamlarToplaminiDondur(218)); // 11

        System.out.println(rakamlarToplaminiDondur(2180)); // 11

        System.out.println(rakamlarToplaminiDondur(20108)); // 11

        System.out.println(rakamlarToplaminiDondur(2001008)); // 11

        int sayi = 304;

        System.out.println(sayi + " sayisinin rakamlar toplami : " + rakamlarToplaminiDondur(sayi));

    }







    public static int rakamlarToplaminiDondur( int sayi ){ // 218

        int rakamlarToplami = 0;

        while ( sayi > 0){

            rakamlarToplami += sayi % 10 ;

            sayi /= 10;

        }

        return rakamlarToplami;

    }
}
