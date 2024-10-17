package day04_matematikselislemler_Increment;

public class C07_PreIncrement_PostIncrement {

    public static void main(String[] args) {


        int a = 40;



        int b = a++;


        System.out.println( "a : " + a + ", b : " + b);
        // a : 41, b : 40



        int c = 2 * a + ++b ;


        System.out.println( "a : " + a + ", b : " + b + ", c : " + c);
        // a : 41, b : 41, c : 123




        int k = 10;



        int m = 2 * k-- ;



        System.out.println( "k : " + k + ", m : " + m);
        // k : 9, m : 20



        int p = --k + 2 * m ;



        System.out.println( "k : " + k + ", m : " + m + ", p : " + p);
        // k : 8, m : 20, p : 48


















    }
}
