package day32_encapsulation;

import day31_strinBuilder_accessModifier.C05_AccessModifierDatalar;

public class C01_BaskaPackageChildClass extends C05_AccessModifierDatalar {

    public static void main(String[] args) {
        // kendi class'inin disindan private class uyelerine ULASILAMAZ
        //System.out.println(sayiPrivate);
        //methodPrivate();

        // kendi package'inin disindan default access modifier'a sahip class uyelerine ULASILAMAZ
        // Package Private
        //System.out.println(strDefaultAccMod);
        //methodDefaultAccesMod();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(doublePublic);
        methodPublic();

    }
}
