package day10_stringManipulations;

public class C01_equals {

    public static void main(String[] args) {

        int sayi = 8;
        int a = 8 ;

        // sayi ile a'nin degerleri esit ise "yasasin" yazdirin

        if ( sayi == a) System.out.println("yasasin");


        char cinsiyet = 'E';

        // cinsiyet E ise emekli olabilirsin yazdirin

        if ( cinsiyet == 'E') System.out.println("emekli olabilirsin");


        String str1 = "Ali";
        String str2 = "Ali";
        String s = "A";
        String t = "li";
        String str3 = s+t;
        String str4 = "A" + "li";
        String str5 = new String("Ali");

        System.out.println( str1 == str2); // Ali == Ali ==> true
        System.out.println( str1 == str3); // Ali == Ali ==> false
        System.out.println( str1 == str4); // Ali == Ali ==> true
        System.out.println( str1 == str5); // Ali == Ali ==> false
        System.out.println( str1 == "Ali"); // Ali == Ali ==> true


        System.out.println("===============");
        System.out.println( str1.equals(str2)); // Ali equals Ali ==> true
        System.out.println( str1.equals(str3)); // Ali equals Ali ==> true
        System.out.println( str1.equals(str4)); // Ali equals Ali ==> true
        System.out.println( str1.equals(str5)); // Ali equals Ali ==> true
        System.out.println( str1.equals("Ali")); // Ali equals Ali ==> true

        System.out.println("===============");
        String str6 = "ali";
        String str7 = "ALI";
        String str8 = "ALi";
        String str9 = "Ali ";
        String str10 = "Ali.";

        System.out.println( str1.equals(str6)); // Ali equals ali ==> false
        System.out.println( str1.equals(str7)); // Ali equals ALI ==> false
        System.out.println( str1.equals(str8)); // Ali equals ALi ==> false
        System.out.println( str1.equals(str9)); // "Ali" equals "Ali " ==> false
        System.out.println( str1.equals(str6)); // Ali equals Ali. ==> false






    }
}
