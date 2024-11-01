package day15_methodOlusturmaVeKullanma;

public class C09_MethodKullanma {

    public static void main(String[] args) {

        // 8! degerini hesaplayip yazdirin
        C01_FaktoryelYazdirma.faktoryelYazdir(8); // 8! = 40320


        // 1453 sayisinin rakamlar toplamini bulun
        C02_SayininRakamlarToplaminiBulma.rakamlarToplaminiYazdir(1453); // 13


        C03_MetniTerstenYazdirma.metniTerstenYazdir("Yavas yavas anlamaya basliyoruz");
        // zuroyilsab ayamalna savay savaY


        // verilen metnin tersini kaydedin
        String isim = "Nihad";

        // String tersMetin = C03_MetniTerstenYazdirma.metniTerstenYazdir(isim);
        // esitligin sag tarafinda kullandigimiz method void yani sonuc dondurmuyor
        // halbuki ATAMA islemi sag tarafta bir deger olmasini gerektirir
        // sag tarafta deger olmayinca Java CTE verir

        String tersMetin = C04_PalindromeMu.metninTersiniDondur(isim);

        System.out.println(tersMetin); // dahiN


        System.out.println(C04_PalindromeMu.metninTersiniDondur("Bu daha iyiymis"));
        // simyiyi ahad uB

        /*
            void olan method sadece yazdirir
            ama kaydetmemiz gerekirse ISE YARAMAZ

            buna karsilik
            deger donduren(return) method'lar degeri getirir
            biz istersek kaydederiz,
            istersek de hemen YAZDIRABILIRIZ

            String method'larini incelerseniz
            nerdeyse tumunun return type'i oldugunu gorursunuz
         */

        String str = "java candir";


        // 100 ile 200 arasindaki sayilari toplayip yazdirin

        System.out.println(C08_AradakiSayilariToplama.aradakiSayilarinToplami(100, 200));
        // 15150

    }
}
