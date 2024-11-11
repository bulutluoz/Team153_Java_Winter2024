package day21_multiDimensioanalArrays;

public class C06_InnerArraySonElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli int bir array’de
        // her bir inner array’in son elementlerinin toplaminini yazdirn

        int[][] arr = { {2,3,1}, {3,6,8,0}, {1,4,9,5,2}, {1}, {5,2,3}};

        sonElementlerinToplaminiYazdir(arr);


    }


    // Verilen 2 katli bir array’de her bir inner array’in
    // son elementlerinin toplaminini yazdiran bir method olusturun.

    public static void sonElementlerinToplaminiYazdir(int[][] arr ){


        int toplam = 0 ;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i][arr[i].length-1];
        }


        System.out.println(toplam);
    }
}
