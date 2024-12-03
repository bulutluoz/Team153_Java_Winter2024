package day35_inheritance;

public class C03_AvciKuslar extends C02_Kuslar{

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {
        /*
            Bir objenin data turu olarak parent class'lar secilebilir

            Bunu child class'daki bir objenin
            parent class'in tum child'lari ile birlikte
            ortak olarak sahip oldugu ozellikleri
            gormek icin kullaniriz

            Java'da bir ozelligin variable veya method olarak olusturulmasi
            OBJELER acisindan buyuk farkliliklar olusturur

            1- Eger ozellikler variable olarak olusturulursa
               Objeler DATA TURU secilen class'daki tum objeler ile ORTAK OZELLIKLERE sahip olurlar
               guncel bilgilerle ilgilenmezler

            2- Eger ozellikler method olarak olusturulursa
               Objeler DATA TURU secilen class'daki tum objeler ile ORTAK OZELLIKLERE sahip olurlar
               ammma o ozelligin DAHA GUNCEL HALI varsa
               guncel haline gider
         */

        // Avci kuslar class'indan bir obje olusturun

        C03_AvciKuslar avciKartal = new C03_AvciKuslar();

        System.out.println(avciKartal.omur); // H yasar ve olurler
        System.out.println(avciKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(avciKartal.kanat); // K kanatlidirlar
        System.out.println(avciKartal.hareket); // A ucarlar
        System.out.println(avciKartal.beslenme); // A et yerler
        System.out.println(avciKartal.pence); // A pencelidir
        System.out.println(avciKartal.gaga); // A sivri gagali

        System.out.println("===============");
        C02_Kuslar kusKartal = new C03_AvciKuslar();
        System.out.println(kusKartal.omur); // H yasar ve olurler
        System.out.println(kusKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(kusKartal.kanat); // K kanatlidirlar
        System.out.println(kusKartal.hareket); // H hareket ederler
        System.out.println(kusKartal.beslenme); // H beslenirler
        //System.out.println(kusKartal.pence); // Kuslar ve Hayvanlar class'inda yok CTE verir yani kullanamaz
        System.out.println(kusKartal.gaga); // K gagalari vardir


        System.out.println("===============");
        C01_Hayvanlar hayvanKartal = new C03_AvciKuslar();
        System.out.println(hayvanKartal.omur); // H yasar ve olurler
        System.out.println(hayvanKartal.solunum); // H nefes alirlar
        System.out.println(hayvanKartal.cogalma); // H cogalirlar
        //System.out.println(hayvanKartal.kanat); // Hayvanlar class'inda yok CTE verir, yani kullanamaz
        System.out.println(hayvanKartal.hareket); // H hareket ederler
        System.out.println(hayvanKartal.beslenme); // H beslenirler
        //System.out.println(hayvanKartal.pence); // Hayvanlar class'inda yok CTE verir, yani kullanamaz
        //System.out.println(hayvanKartal.gaga); // Hayvanlar class'inda yok CTE verir, yani kullanamaz



        // C02_Kuslar class'indan bir obje olusturun

        C02_Kuslar kus1 = new C02_Kuslar();
        System.out.println(kus1.omur); // H yasar ve olurler
        System.out.println(kus1.solunum); // K akcigerle nefes alirlar
        System.out.println(kus1.cogalma); // K yumurtayla cogalirlar
        System.out.println(kus1.kanat); // K kanatlidirlar
        System.out.println(kus1.hareket); // H hareket ederler
        System.out.println(kus1.beslenme); // H beslenirler
        //System.out.println(kus1.pence); // Kuslar ve Hayvanlar class'inda yok CTE verir yani kullanamaz
        System.out.println(kus1.gaga); // K gagalari vardir


        C01_Hayvanlar hayvanKus = new C02_Kuslar();
        System.out.println(hayvanKus.omur); // H yasar ve olurler
        System.out.println(hayvanKus.solunum); // H nefes alirlar
        System.out.println(hayvanKus.cogalma); // H cogalirlar
        //System.out.println(hayvanKus.kanat); // Hayvanlar class'inda yok CTE verir, yani kullanamaz
        System.out.println(hayvanKus.hareket); // H hareket ederler
        System.out.println(hayvanKus.beslenme); // H beslenirler
        //System.out.println(hayvanKus.pence); // Hayvanlar class'inda yok CTE verir, yani kullanamaz
        //System.out.println(hayvanKus.gaga); // Hayvanlar class'inda yok CTE verir, yani kullanamaz


        // C01_Hayvanlar class'indan bir obje olusturun

        C01_Hayvanlar hayvan1 = new C01_Hayvanlar();
        System.out.println(hayvan1.omur); // H yasar ve olurler
        System.out.println(hayvan1.solunum); // H nefes alirlar
        System.out.println(hayvan1.cogalma); // H cogalirlar
        //System.out.println(hayvan1.kanat); // Hayvanlar class'inda yok CTE verir, yani kullanamaz
        System.out.println(hayvan1.hareket); // H hareket ederler
        System.out.println(hayvan1.beslenme); // H beslenirler
        //System.out.println(hayvan1.pence); // Hayvanlar class'inda yok CTE verir, yani kullanamaz
        //System.out.println(hayvan1.gaga); // Hayvanlar class'inda yok CTE verir, yani kullanamaz



        // Object hayvan2 = new C01_Hayvanlar();




    }
}
