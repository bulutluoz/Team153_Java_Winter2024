package day19_arrays;

public class C04_PozitifSayilariToplama {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu yazdirin

        int[] sayilar = {3,4,-5,7,-3,4,8,-5,4,-3,8,-3,-4,0,4,0};

        System.out.println(pozitifSayilariTopla(sayilar)); // 42

    }



    // Verilen bir array’deki pozitif tamsayilari toplayip
    // sonucu bize donduren bir method yaziniz.

    public static int pozitifSayilariTopla( int[] sayilar  ){

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i] > 0){

                toplam += sayilar[i];
            }

        }

        return toplam;

    }


}
