package day04_matematikselislemler_Increment;

public class C04_Concatenation {

    public static void main(String[] args) {

        // Sadece verilen variable'lari kullanarak
        // asagidaki metinleri yazdirin

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int a = 5;
        int b = 3;


        // Java Candir 35

        System.out.println( s1 + s3 + s2 + s3 + b + a   ); // "Java Candir 35"


        // Java 8

        System.out.println( s1 + s3 + 5 + 3); // Java 53

        System.out.println( s1 + s3 + (5 + 3)); // Java 8

        // 8 Candir
        System.out.println(  a+b + s3 + s2  ); // 8 Candir

        // 35

        System.out.println( b + a );  // 8

        System.out.println( s4 + b + a ); // "" + 3 ==> "3"      "3"+ 5 ==> "35"



        boolean bl = true;
        char chr = 'v';
        String str = "Java";

        // System.out.println( bl + chr + str );  once soldaki islem yapildigindan boolean + char CTE verir

        System.out.println( bl + str + chr ); // "trueJava" + 'v' ==> "truejavav"

    }
}
