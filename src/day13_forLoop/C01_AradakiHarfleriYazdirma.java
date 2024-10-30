package day13_forLoop;

public class C01_AradakiHarfleriYazdirma {
    public static void main(String[] args) {

        // n’den t’ye kadar harfleri ayni satirda aralarinda bir bosluk birakarak yazdirin.


        for (char i = 'n'; i <= 't' ; i++) {

            System.out.print (i + " ");
        }

        System.out.println("");

        for (int i = 'n'; i <= 't' ; i++) {

            System.out.print (  (char)i + " ");
        }
    }
}
