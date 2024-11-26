package day32_encapsulation;

import day31_strinBuilder_accessModifier.C05_AccessModifierDatalar;

public class C02_FarkliPackageChildOlmayanClass {

    public static void main(String[] args) {
        // kendi class'inin disindan private class uyelerine ULASILAMAZ
        //System.out.println(C05_AccessModifierDatalar.sayiPrivate);
        //C05_AccessModifierDatalar.methodPrivate();

        // kendi package'inin disindan default access modifier'a sahip class uyelerine ULASILAMAZ
        //System.out.println(C05_AccessModifierDatalar.strDefaultAccMod);
        //C05_AccessModifierDatalar.methodDefaultAccesMod();

        // Child class olmadigindan
        // kendi package'inin disindan protected access modifier'a sahip class uyelerine ULASILAMAZ
        //System.out.println(C05_AccessModifierDatalar.chrProtected);
        //C05_AccessModifierDatalar.methodProtected();

        System.out.println(C05_AccessModifierDatalar.doublePublic);
        C05_AccessModifierDatalar.methodPublic();
    }
}
