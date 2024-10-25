package day10_stringManipulations;

public class C02_EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str6 = "ali";
        String str7 = "ALI";
        String str8 = "ALi";
        String str9 = "Ali ";
        String str10 = "Ali.";

        System.out.println( str1.equalsIgnoreCase(str6)); // Ali -- ali ==> true
        System.out.println( str1.equalsIgnoreCase(str7)); // Ali -- ALI ==> true
        System.out.println( str1.equalsIgnoreCase(str8)); // Ali -- ALi ==> true
        System.out.println( str1.equalsIgnoreCase(str9)); // "Ali" -- "Ali " ==> false
        System.out.println( str1.equalsIgnoreCase(str10)); // Ali -- Ali. ==> false

    }
}
