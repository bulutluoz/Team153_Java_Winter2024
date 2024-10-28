package day11_stringManipulations;

public class C04_isEmpty_isBlank {

    public static void main(String[] args) {

        String str1 = "Java";
        System.out.println(str1.isEmpty()); // false

        String str2 = "";
        System.out.println(str2.isEmpty()); // true

        String str3 = " ";
        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.length()); // 1


        String str4 = "     ";
        System.out.println(str4.isEmpty()); // false
        // Returns true if, and only if, length() is 0.
        System.out.println(str4.length()); // 5


        System.out.println(str4.isBlank()); // true
        System.out.println(str3.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        // Returns true if the string is empty
        // or contains only white space codepoints, otherwise false.



    }
}
