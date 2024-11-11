package day21_multiDimensioanalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {

    public static void main(String[] args) {


        int a = 34;

        int[] b = {2,3,4};

        int[][] arr = { {2,3}, {3,6,8}, {1,4,9,5}, {1}};

        System.out.println(arr.length); // 4

        System.out.println(arr[0][1]); // 3
        System.out.println(arr[1][2]); // 8
        System.out.println(arr[2][1]); // 4
        System.out.println(arr[3][0]); // 1
        System.out.println(arr[3]); // {3} ==> [I@2752f6e2

        System.out.println(Arrays.toString(arr[1])); // [3, 6, 8]
        System.out.println(Arrays.toString(arr[3])); // [1]

        /*
            MultiDimensionalArray'lerde yazdirma islemi yapmadan once
            ne yazdirmak istedigimizi iyi belirlemeliyiz

            - EGER yazdiracagimiz sey en icerdeki elementlerden birisi ise
              System.out.println(arr[0][1]) direkt yazdirabiliriz

            - EGER inner array'lerden birini yazdirmak istiyorsak
              array yazdirmak istedigimiz icin Arrays.toString(arr[1])  kullanmaliyiz

            - butun array'i tek seferde yazdirmak istersek
              Arrays.deepToString(arr)  kullanmaliyiz
         */

        System.out.println( Arrays.toString(arr));
        //       [[I@e580929, [I@1cd072a9, [I@7c75222b, [I@2752f6e2]

        System.out.println(Arrays.deepToString(arr));
        //    [[2, 3], [3, 6, 8], [1, 4, 9, 5], [1]]




    }
}
