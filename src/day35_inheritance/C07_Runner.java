package day35_inheritance;

public class C07_Runner {

    public static void main(String[] args) {

        /*

         */

        // C06_AvciKuslar class'indan bir obje olusturun

        C06_AvciKuslar avciKartal = new C06_AvciKuslar();
        avciKartal.omur(); // H yasar ve olurler
        avciKartal.solunum();// K akcigerle nefes alirlar
        avciKartal.cogalma();// K yumurtayla cogalirlar
        avciKartal.kanat();// K kanatlidirlar
        avciKartal.hareket();// A ucarlar
        avciKartal.beslenme();// A et yerler
        avciKartal.pence();// A pencelidir
        avciKartal.gaga();// A sivri gagali

        System.out.println("=================");

        C05_Kuslar kusKartal = new C06_AvciKuslar();
        kusKartal.omur(); // H yasar ve olurler
        kusKartal.solunum();// K akcigerle nefes alirlar
        kusKartal.cogalma();// K yumurtayla cogalirlar
        kusKartal.kanat();// K kanatlidirlar
        kusKartal.hareket();// A ucarlar
        kusKartal.beslenme();// A et yerler
        //kusKartal.pence();// Kuslar ve Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        kusKartal.gaga();// A sivri gagali

        System.out.println("=================");

        C04_Hayvanlar hayvanKartal = new C06_AvciKuslar();
        hayvanKartal.omur(); // H yasar ve olurler
        hayvanKartal.solunum();// K akcigerle nefes alirlar
        hayvanKartal.cogalma();// K yumurtayla cogalirlar
        //hayvanKartal.kanat();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        hayvanKartal.hareket();// A ucarlar
        hayvanKartal.beslenme();// A et yerler
        //hayvanKartal.pence();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        //hayvanKartal.gaga();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ

        System.out.println("=================");
        // C05_Kuslar class'indan bir obje olusturalim

        C05_Kuslar kus1 = new C05_Kuslar();
        kus1.omur(); // H yasar ve olurler
        kus1.solunum();// K akcigerle nefes alirlar
        kus1.cogalma();// K yumurtayla cogalirlar
        kus1.kanat();// K kanatlidirlar
        kus1.hareket();// H hareket ederler
        kus1.beslenme();// H beslenirler
        //kus1.pence();// Kuslar ve Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        kus1.gaga();// K gagalari vardir

        System.out.println("=================");
        C04_Hayvanlar kusHayvani = new C05_Kuslar();
        kusHayvani.omur(); // H yasar ve olurler
        kusHayvani.solunum();// K akcigerle nefes alirlar
        kusHayvani.cogalma();// K yumurtayla cogalirlar
        //kusHayvani.kanat();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        kusHayvani.hareket();// H hareket ederler
        kusHayvani.beslenme();// H beslenirler
        //kusHayvani.pence();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        //kusHayvani.gaga();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ


        // C04_Hayvanlar Class'indan bir obje olusturun

        C04_Hayvanlar hayvan1 = new C04_Hayvanlar();
        hayvan1.omur(); // H yasar ve olurler
        hayvan1.solunum();// H nefes alirlar
        hayvan1.cogalma();// H cogalirlar
        // hayvan1.kanat();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        hayvan1.hareket();// H hareket ederler
        hayvan1.beslenme();// H beslenirler
        //hayvan1.pence();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ
        //hayvan1.gaga();// Hayvanlar Class'inda yok, CTE verir yani KULLANAMAZ







    }
}
