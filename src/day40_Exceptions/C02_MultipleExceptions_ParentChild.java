package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_MultipleExceptions_ParentChild {

    public static void main(String[] args)  {

        /*
            Eger birden fazla exception olasiligi varsa
            3 yontemle handle edebiliriz
            1- bagimsiz try-catch bloklari
            2- tek try birden fazla catch blogu
            3- tek try ve kapsamli tek catch

            eger olasi exception'lar arasinda parent-child iliskisi varsa
            2.yontemi uyguladigimizda uste child exception'i
            alta parent exception'i yazmaliyiz

            eger parent'i uste yazarsak
            parent tum exception'lari yakalayacagi icin
            asagidaki child ISLEVSIZ kalir
            ve Java altini kirmizi cizip bunu sil der
         */


        try {
            String dosyaYolu = "src/day40_Exceptions/Notlar.txt";

            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            int k = 0;

            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolunda hata var, dosya bulunamadi");

        }catch (IOException e){
            System.out.println("Dosyadaki bilgiler okunamadi");
        }


    }
}
