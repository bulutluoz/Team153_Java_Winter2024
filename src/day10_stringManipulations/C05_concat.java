package day10_stringManipulations;

public class C05_concat {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";

        System.out.println( s1 + s2 + s3 ); // Java Candir

        System.out.println( s1.concat(s2).concat(s3)); // Java Candir

        int a = 3;
        int b = 4;

        // sadece variable'lari kullanarak Java Candir 34  yazdirin

        System.out.println( s1 + s2 + s3 + s2 + a + b ); // Java Candir 34

        System.out.println(s1.concat(s2).concat(s3).concat(s2).concat(""+a).concat(""+b));
    }
}
