package day32_encapsulation;

public class C04_EncapsuleDatalar {

    // atama yapilabilsin (write OK)
    // atanan degerler gorulemesin (read Yasak)
    private int satisTutari = 100;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari+=satisTutari;
    }

    // atama yapilamasin (write Yasak)
    // deger gorulebilsin (read OK)
    private int toplamSatisTutari = 0;

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    // Read ve Write yetkilerini ayirmak icin
    // 1.adim acces modifier ile erisimi yasaklayin
    //        (encapsule edin)

    // 2.adim : baska class'larin SADECE GOREBILMESINI
    //          (Read) istedigimiz variable'lar icin
    //           getter() olusturun
    //          baska class'larin SADECE DEGER ATAMASINI
    //          (Write) istedigimiz variable'lar icin
    //           setter() olusturun
    //

}
