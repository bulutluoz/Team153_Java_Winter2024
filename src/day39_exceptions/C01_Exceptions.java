package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // birinci sayiyi ikinci sayiya bolup
        // bolum sonucunun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");


        int sayi1 = 0;
        int sayi2 = 0;

        try {
            /*
                try blogu : riskli kodlarin oldugu bolumdur
                            Java'ya bu kodlari calistirmaya gayret et
                            sorun olursa biz halledecegiz diyoruz
             */

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("2.sayi 0 olamaz");
            }else System.out.println("Sayilarin bolumu : " + sayi1/sayi2);

        } catch (InputMismatchException e) {

            /*
                 catch (InputMismatchException e)
                 Eger try bolumundeki kodlari calistirirken
                 InputMismatchException olusursa
                 bu bolum o exception yakalar(catch)
                 ve e objesine kaydeder
             */

            /*
            catch blogu { } arasindaki bolum
            exception yakalandiginda yapmak istediginiz islem
            */

            System.out.println("Tamsayi GIRMELISINIZ...  !!! ");


        }





        // String str = 5;  // CTE

    }
}
