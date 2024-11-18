package day26_parametreliConstructorlar_constructorCall;

public class Rope {
    public static void swing() {

        System.out.print ("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing() ;
        //climb() ; // Non-static method 'climb()' cannot be referenced from a static context
    }

    public static void main(String[] args) {

        Rope rope = new Rope();
        rope. play ();// Static member 'play()' accessed via instance reference
        Rope rope2 = null;
        rope2. play() ; // play() static oldugundan, objeye ihtiyac yok, Java rope2'yi yok sayiyor

        /*
            23.satirda Rope rope2; yazilip birakilsaydi
            24.satirda rope2.play(); CTE verirdi.
            Java, deger atamadin ki kullanasin derdi.

            null olarak isaretlendigi icin
            Java 24.satirda CTE vermez

            24.satira gecildigildiginde
            rope2 objesi null olarak isaretlendiginden
            rope2 objesi kullanilmaya calisilirsa NullPointerException verir
            ANCAKKK play() static oldugundan, rope2'ye ihtiyac duymaz
            bundan dolayi 24.satir calisir

         */

        String str = null;
        //System.out.println(str); // null
        //System.out.println(str.toUpperCase()); // NullPointerException

    }
}