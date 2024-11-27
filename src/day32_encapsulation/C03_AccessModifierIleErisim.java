package day32_encapsulation;

import day31_strinBuilder_accessModifier.C05_AccessModifierDatalar;

public class C03_AccessModifierIleErisim {


    public static void main(String[] args) {

        /*
            Java'da class uyelerine erisimi temel olarak
            access modifier'lar ile duzenleriz.

            ANCCAAAKKK access modifier ile duzenledigimiz bir erisimde
            bilgiyi gorebilme (read) yetkisi ile,
            bilgiyi degistirme (write) yetkilerini birbirinden ayiramayiz.

            bir variable'a ulasabiliyorsak hem degerini gorebilir, hem de yeni deger atayabiliriz
            bir variable'a ulasamiyorsak ne deger atama, ne de degerini gorme imkanimiz olmaz
         */

        System.out.println(C05_AccessModifierDatalar.doublePublic); // 128.32
        C05_AccessModifierDatalar.doublePublic = 101.5;
        System.out.println(C05_AccessModifierDatalar.doublePublic); // 101.5

        //System.out.println(C05_AccessModifierDatalar.chrProtected);
        // C05_AccessModifierDatalar.chrProtected = 's';

        //System.out.println(C05_AccessModifierDatalar.strDefaultAccMod);
        // C05_AccessModifierDatalar.strDefaultAccMod = "Ali";
    }
}
