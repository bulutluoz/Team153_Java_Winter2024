package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // birinci sayiyi ikinci sayiya bolup
        // bolum sonucunun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");


        int sayi1 = 0;
        int sayi2 = 0;
        /*
            Try bolumunde bir exception olusursa
            o exception yakalanip kontrol altina alinincaya kadar
            Java butun kodlari ignore eder(gormezden gelir)

            Catch blogunda exception yakalanirsa
            parantez icerisindeki e objesine exception'i kaydeder
            ve hayat normale doner

            Catch blogu hta kontrol altina alindiktan sonra
            ne yapmak isterseniz o kodlari yazacaginiz yerdir
            sadece bir uyari yapabilecegimiz gibi
            tamamen farkli bir kod da yazilabilir
            bu bize verilen goreve baglidir

            Hata mesaji verirken
            isterseniz kendi hata mesajinizi yazabilirsiniz
            ya da e objesini kullanarak hazir hata mesajlari da verebilirsiniz

            ornegin e.printStackTrace();
            tum hata kodlarini yazdirir
            boylece hem tum hata kodlarini yazdirip
            hem de kodu normal calistirmaya devam edebiliriz
         */

        try {

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("2.sayi 0 olamaz");
            }else System.out.println("Sayilarin bolumu : " + sayi1/sayi2);

        } catch (InputMismatchException e) {
            System.out.println("Tamsayi GIRMELISINIZ...  !!! ");
            System.out.println(e.getMessage()); // null
            System.out.println(e.getCause()); // null
            e.printStackTrace();
            /*
                java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                at java.base/java.util.Scanner.next(Scanner.java:1594)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                at day39_exceptions.C02_CatchBlogundakiEninGorevi.main(C02_CatchBlogundakiEninGorevi.java:42)
             */


        }

    }
}
