package day13_forLoop;

import java.util.Scanner;

public class C07_FizzBuzz {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak o sayiya kadar tum tamsayilari yazdirin, sira
        //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        // 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzBuzz


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");
        int girilensayi = scanner.nextInt();

        for (int i = 1; i <=girilensayi ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            }else { // 3 veya 5' e bolunmeyenler
                System.out.print( i + " ");
            }


        }

    }
}
