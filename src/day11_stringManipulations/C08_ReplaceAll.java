package day11_stringManipulations;

public class C08_ReplaceAll {

    public static void main(String[] args) {

        String str = "13 sen ver, 5 de ben ekleyeyim 18 olsun";

        // butun rakamlarin yerine * yapin

        System.out.println(str.replaceAll("\\d", "*"));
        // ** sen ver, * de ben ekleyeyim ** olsun


        // butun e'lerin yerine E yapin

        System.out.println(str.replace('e', 'E'));
        System.out.println(str.replace("e","E"));
        System.out.println(str.replaceAll("e", "E"));


        System.out.println(str.replaceAll("\\w", "*"));
        // ** *** ***, * ** *** ********* ** *****

    }
}
