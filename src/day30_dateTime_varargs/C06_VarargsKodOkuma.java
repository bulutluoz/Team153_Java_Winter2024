package day30_dateTime_varargs;

public class C06_VarargsKodOkuma {

    public static void main(String[] args) {

        elemanYazdir("Ali",2,3,4,5,6,7); // 4

        elemanYazdir("Tugba",1,2,3,4,5,6,7); // 5

        ornek("a","b","c","d"); // 4

        ornek("Ali","Veli"); // 4

        ornek("Yusuf"); // 5



    }

    public static void elemanYazdir(String s , int... v){

        System.out.println( v[s.length()-1] );

    }

    public static void ornek(String s , String... k){
        System.out.println( s.length() + k.length );
    }
}
