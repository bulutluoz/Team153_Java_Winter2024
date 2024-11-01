package day15_methodOlusturmaVeKullanma;

public class C04_PalindromeMu {

    public static void main(String[] args) {

        // verilen bir metni inceleyip,
        // metin palindrome ise true,
        // palindrome degilse false yazdiran bir method olusturun


    }

    public static void isPalindrome( String metin){

        String tersMetin =
    }



    // verilen metni terse cevirip donduren bir method olusturun

    public static String metninTersiniDondur(String metin){

        String tersMetin = "";


        for (int i = metin.length()-1; i >= 0  ; i--) {

            tersMetin += metin.charAt(i);
        }

        return tersMetin;

    }


}
