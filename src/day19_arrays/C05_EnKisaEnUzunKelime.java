package day19_arrays;

public class C05_EnKisaEnUzunKelime {

    public static void main(String[] args) {

        // Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        // Esit uzunluktaki kelimelerden herhangi biri olabilir

        String[] isimler = {"Nihad","Sumeyra","Yigit Cem","Ali","Tugba"};

        enUzunEnKisayiYazdir(isimler);


    }

    public static void enUzunEnKisayiYazdir(  String[] kelimeler   ){

        String enKisaKelime = kelimeler[0];
        String enUzunKelime = kelimeler[0];


        for (int i = 0; i < kelimeler.length ; i++) {

            if ( kelimeler[i].length() > enUzunKelime.length() ){

                enUzunKelime = kelimeler[i];
            }

            if (kelimeler[i].length() < enKisaKelime.length()){

                enKisaKelime = kelimeler[i];
            }

        }

        System.out.println(
                "En uzun kelime : " + enUzunKelime +
                "\nEn kisa kelime : " + enKisaKelime
        );

    }


}
