package day11_stringManipulations;

import java.util.Scanner;

public class C09_MetniTemizleme {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // - metindeki tum fazla space'leri
        // - tum rakamlari
        // - tum ozel karakterleri yok edin
        // sonra ilk harfi buyuk diger harfler kucuk olacak sekilde duzenleyin
        // sonunda . yoksa . koyun

        // Ornek input : j*a)v#a    C789A2345n@#$d09i.,.r
        //       output : Java candir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        metin = metin.replaceAll("\\s+", " ");
        metin = metin.replaceAll("\\d","");

        // ozel karakterleri yok etmeden once
        // space'i koruma altina almak icin
        // yerine herhangi bir sayi yazalim
        // en son o sayiyi yeniden space yapariz
        metin = metin.replace(" ","4");

        metin = metin.replaceAll("\\W","");
        // W letter, digit veya _ demek
        // W bunlarin disinda kalanlar
        // biz W kullandigimiz icin _ yok olmadi, ozel kod yazmamiz gerekir
        metin = metin.replaceAll("_","");

        // 4'u yeniden space'e donusturelim
        metin = metin.replace("4"," ");

        metin = metin.substring(0,1).toUpperCase() +
                metin.substring(1).toLowerCase();

        if (metin.charAt(metin.length()-1) != '.'){
            metin += ".";
        }


        System.out.println("Metnin son hali : " + metin);
    }
}
