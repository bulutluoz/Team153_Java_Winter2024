package day12_stringManipulations_forLoop;

public class C01_StringDegerleriToplama {

    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // sondaki para birimi degiskendir. Yazilan kod tum para birimleri ile calismalidir
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €


        String input1 = "15.30 Usd"; // Tl, Usd, $, KDnr
        String input2 = "11.45 Usd";

        System.out.println(input1 + input2); // 15.30 €11.45 €

        // once para birimini alip kaydedelim

        int spaceIndex = input1.indexOf(" ");
        String paraBirimi = input1.substring(spaceIndex); //  €

        // artik sayi olmayan herseyden kurtulabiliriz
        input1 = input1.replaceAll("\\D",""); // "1530"
        input2 = input2.replaceAll("\\D",""); // "1145"

        double fiyat1 = Double.parseDouble(input1); // 1530
        double fiyat2 = Double.parseDouble(input2); // 1145

        double toplam = (fiyat1 + fiyat2) /100 ;

        System.out.println("Verilen fiyatlarin toplami : " + toplam + paraBirimi);







    }
}
