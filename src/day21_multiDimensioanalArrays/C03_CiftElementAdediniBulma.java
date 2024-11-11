package day21_multiDimensioanalArrays;

public class C03_CiftElementAdediniBulma {

    public static void main(String[] args) {

        int[][] arr = { {2,3}, {3,6,8}, {1,4,9,5}, {1}};

        // arr'deki elementlerden kac tanesinin cift sayi oldugunu yazdirin

        int sayac =0 ;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0 ){
                    sayac++;
                }

            }

        }

        System.out.println("Array'deki cift sayi adedi : " + sayac);


        // tek sayi adedini yazdirin
        sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 != 0){
                    sayac++;
                }
            }
        }

        System.out.println("Array'deki tek sayi adedi : " + sayac);

    }
}
