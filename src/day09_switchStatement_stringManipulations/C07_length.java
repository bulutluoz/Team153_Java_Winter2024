package day09_switchStatement_stringManipulations;

public class C07_length {

    public static void main(String[] args) {

        String str = "Java hep guzellesiyor";

        // str'in karakter sayisini yazdirin

        System.out.println(str.length()); // 21

        //str'in son karakterini yazdirin

        System.out.println( str.charAt(str.length() - 1)  ); // dinamik olarak son elementi verir


        // sondan 3.karakteri yazdirin

        System.out.println( str.charAt( str.length() -3 )); // y


        // sondan 5.karakteri yazdirin
        System.out.println(str.charAt(str.length() - 5)); // s


        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException

        // son harfin index'inin    str.length() - 1   oldugunu biliyoruz
        // bu index'den buyuk olan her index icin java IndexOutOfBounds hatasi verir


    }
}
