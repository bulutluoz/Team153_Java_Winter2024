package day09_switchStatement_stringManipulations;

public class C06_charAt {

    public static void main(String[] args) {

        String str = "Java guzeldir";

        // charAt(index) : verilen index'deki karakteri getirir
        // index'in 0'dan basladigini unutmamak gerekir

        System.out.println(str.charAt(3)); // a


        // str daki 5.karakteri yazdirin
        System.out.println(str.charAt(4)); // space

        // str'da kac karakter var ?  13
        // str'daki son harfin index'i kactir ? 12


        //"Java guzeldir"

        // 15. index'deki karakteri yazdirin

        // System.out.println(str.charAt(15));
        // Java CTE vermez ama intelliJ sariya boyayarak bizi uyarir
        //StringIndexOutOfBoundsException: String index out of range: 15

        /*
            Java compile time'da
            variable'larin degerlerine bakmaz
            sadece syntax acisindan atanan degerin uygun olup olmadigina bakar

            String s = 2 ;  yazarsak String variable'a int atanamayacagi icin CTE verir
            String k = null;
            String l = "";
            String m = "uzunkavaklaraltindayataruyumazoglu" ;
         */


        // str'in karakter sayisinin 13 oldugunu biliyorsak
        // son karakteri yazdirin
        System.out.println(str.charAt( 13-1 )); // r

        // sondan 4. karakteri yazdirin
        System.out.println( str.charAt(13-4) ); // l
    }
}
