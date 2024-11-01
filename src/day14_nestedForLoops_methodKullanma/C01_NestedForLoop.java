package day14_nestedForLoops_methodKullanma;

public class C01_NestedForLoop {

    public static void main(String[] args) {

        /*
            for loop kullanarak tek seferde
            1 2 3 4
            2 4 6 8
            3 6 9 12
            yazdirin
         */


        for (int i = 1; i <=3 ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=4 ; j++) { // her bir satirdaki sutunlari kontrol eder

                System.out.print( i * j + " ");

            }
            System.out.println("");
        }


    }
}
