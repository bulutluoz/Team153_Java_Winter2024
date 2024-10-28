package day11_stringManipulations;

import java.util.Scanner;

public class C03_KullanimAdediBulma {

    public static void main(String[] args) {

        //3- Kullanicidan bir cumle ve aranan bir metin parcasi isteyin
        //   kullanicinin verdigi metinlere gore asagidaki 3 cumleden birini yazdirin
        //     - cumle aranan metni icermiyor
        //     - cumle aranan metni sadece 1 adet iceriyor
        //     - cumle aranan metni birden fazla iceriyor


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girin");
        String cumle = scan.nextLine().toLowerCase(); // ben seni cok sevdim ama sen beni sevmedin

        System.out.println("Lütfen cümlenin icinda aranan metni girin");
        String metin = scan.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonKullanimIndexi = cumle.lastIndexOf(metin);

        if (ilkIndex == -1 ){
            System.out.println("cumle aranan metni icermiyor");
        } else if (ilkIndex == sonKullanimIndexi) {
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        }else{
            System.out.println("cumle aranan metni birden fazla iceriyor");
        }


    }
}
