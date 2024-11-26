package day31_strinBuilder_accessModifier;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ali");

        sb.append(" Can");

        sb.append(" Yataruyumaz");

        // StringBuilder mutable'dir yani degeri degistirilebilir
        // method'la yapilan degisiklikler atama olmadan da kalici olur

        System.out.println(sb); // Ali Can Yataruyumaz

        String str = "Java candir";
        sb.append(str,4,11);

        System.out.println(sb); // Ali Can Yataruyumaz candir

        sb.deleteCharAt(20);
        System.out.println(sb); // Ali Can Yataruyumaz andir

        sb.delete(19,25);
        System.out.println(sb); // Ali Can Yataruyumaz

        sb.insert(7,"er");
        System.out.println(sb); // Ali Caner Yataruyumaz

        sb.insert(9,str,4,5);
        System.out.println(sb); // Ali Caner  Yataruyumaz

        System.out.println(sb.reverse()); // zamuyurataY  renaC ilA

        System.out.println(sb); // zamuyurataY  renaC ilA

        sb.reverse();

        sb.replace(0,10,"Tugba");

        System.out.println(sb); // Tugba Yataruyumaz


        str = str.replace("c","C");
        System.out.println(str); // Java Candir






    }
}
