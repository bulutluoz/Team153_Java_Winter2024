package day31_strinBuilder_accessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 length : " + sb1.length()); // 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16



        StringBuilder sb2 = new StringBuilder(5);
        System.out.println("sb2 length : " + sb2.length()); // 0
        System.out.println("sb2 capacity : " + sb2.capacity()); // 5



        StringBuilder sb3 = new StringBuilder("Ali Can");
        System.out.println("sb3 length : " + sb3.length()); // 7
        System.out.println("sb3 capacity : " + sb3.capacity()); // 16 + 7 ==> 23


        sb3.append(" Yanbatar");
        System.out.println("sb3 length : " + sb3.length()); // 16
        System.out.println("sb3 capacity : " + sb3.capacity()); // 23


        sb3.append(" ama geri kalkar.");
        System.out.println(sb3); // Ali Can Yanbatar ama geri kalkar.

        System.out.println("sb3 length : " + sb3.length()); // 33
        System.out.println("sb3 capacity : " + sb3.capacity()); // 23*2 + 2 = 48


        sb3.trimToSize();
        System.out.println("sb3 length : " + sb3.length()); // 33
        System.out.println("sb3 capacity : " + sb3.capacity()); // 33
    }
}
