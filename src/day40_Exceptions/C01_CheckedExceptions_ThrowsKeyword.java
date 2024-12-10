package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions_ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src/day40_Exceptions/Notlar.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        /*
         Unhandled exception: java.io.FileNotFoundException
         ya dosyayi bulamazsam, bana bir yol goster diyor

         Bir exception olasiligi varsa
         bunu kontrol altina almanin(handle) en iyi yolu try-catch'dir

         Ama dosyaya ulasamazsak
         kodun calismasi da bir anlam ifade etmeyecekse
         try-catch ile handle edip yola devam etmek anlamsiz olur

         EGER
         SADECE kodlarimizi calistirmak
         ve exception olursa mudahale etmemek istersek
         method deklarasyonuna throws keyword ile muhtemel exception'i yazariz

         throws FileNotFoundException
         bu yazimin iki amaci var
         1- java'ya bu riskin farkinda oldugumuzu
            ve bir sorun olursa exception firlatmasini istedigimizi soylemis oluruz

         2- bizden sonra bu class'i kullanacak kisilere
            bu class'da exception riski bulundugunu
            iletmis oluruz
         */



        //String str = 20;
        //Required type: String
        //Provided: int

        // Sting str = ""; // Cannot resolve symbol 'Sting'

        // String 3str = ""; // Not a statement
    }
}
