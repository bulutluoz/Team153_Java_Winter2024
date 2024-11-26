package day31_strinBuilder_accessModifier;

public class C05_AccessModifierDatalar {

    static private int sayiPrivate=9720016; // private
    static String strDefaultAccMod="Merhaba";
    static protected char chrProtected=65;
    static public double doublePublic=128.32;


    private static void methodPrivate(){
        System.out.println("Private Olan Method Çalıştı");
    }

    static void methodDefaultAccesMod(){
        System.out.println("Default Olan Method Çalıştı");
    }

    protected static void methodProtected(){
        System.out.println("Protected Olan Method Çalıştı");
    }

    public static void methodPublic(){
        System.out.println("Public olan Method Çalıştı");
    }

    public static void main(String[] args) {

        System.out.println(sayiPrivate);
        methodPrivate();

        System.out.println(strDefaultAccMod);
        methodDefaultAccesMod();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(doublePublic);
        methodPublic();

    }
}
