package day11_stringManipulations;

import java.util.Scanner;

public class C01_Odev {

    public static void main(String[] args) {

        /*
            1- Kullanicidan aldigimiz metinde 3 'den fazla a harfi oldugunu biliyorsak
               3.a'nin index'ini yazdirin

            2- Kullanicidan aldigimiz bir metinde
               3 veya daha fazla e olup olmadigini yazdirin

            3- Kullanicidan bir cumle ve aranan bir metin parcasi isteyin
               kullanicinin verdigi metinlere gore asagidaki 3 cumleden birini yazdirin
                 - cumle aranan metni icermiyor
                 - cumle aranan metni sadece 1 adet iceriyor
                 - cumle aranan metni birden fazla iceriyor
         */


        String metin = "Ali topu at, at ali at.";

        //  1- Kullanicidan aldigimiz metinde 3 'den fazla a harfi oldugunu biliyorsak
        //     3.a'nin index'ini yazdirin

        int birinciIndex = metin.indexOf('a'); // 9
        int ikinciIndex = metin.indexOf("a",birinciIndex+1); // 13
        int ucuncuIndex = metin.indexOf("a",ikinciIndex+1); // 16

        System.out.println("3. a'nin index'i : " + ucuncuIndex);

        // 2- Kullanicidan aldigimiz bir metinde
        //    3 veya daha fazla e olup olmadigini yazdirin

        metin = "karadenize yelken actik";

        birinciIndex = metin.indexOf('e'); // 5
        ikinciIndex = metin.indexOf("e",birinciIndex+1); // -1
        ucuncuIndex = metin.indexOf("e",ikinciIndex+1); // 5

        if (birinciIndex>=0 && ikinciIndex >0 && ucuncuIndex>0){
            System.out.println("metinde 3 veya daha fazla e var");
        }else {
            System.out.println("metinde 3 veya daha fazla e yok");
        }


        //3- Kullanicidan bir cumle ve aranan bir metin parcasi isteyin
        //   kullanicinin verdigi metinlere gore asagidaki 3 cumleden birini yazdirin
        //     - cumle aranan metni icermiyor
        //     - cumle aranan metni sadece 1 adet iceriyor
        //     - cumle aranan metni birden fazla iceriyor

        String cumle = "Java sen mi buyuksun, ben mi ? Elbette sen  buyuksun..";
        String arananMetin = "sen";

        birinciIndex = cumle.indexOf(arananMetin); // 22
        ikinciIndex = cumle.indexOf(arananMetin,birinciIndex+1); // -1


        if (birinciIndex == -1){
            System.out.println("cumle aranan metni icermiyor");
        } else if ( ikinciIndex == -1) { // birinciIndex >=0 &&
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        }else{
            System.out.println("cumle aranan metni birden fazla iceriyor");
        }


    }
}
