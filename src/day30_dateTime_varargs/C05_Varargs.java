package day30_dateTime_varargs;

public class C05_Varargs {

    public static void main(String[] args) {

        topla(5,7); // Iki tamsayinin toplami : 12
        topla(1,3,5); // Uc tamsayinin toplami : 9
        topla(3,4,5,6); // Verilen 4 adet sayinin toplami : 18
        topla(1,2,3,4,5); // Verilen 5 adet sayinin toplami : 15
        topla(4,5,6,7,8,9,0); // Verilen 7 adet sayinin toplami : 39
        topla(1,2,3,4,5,6,7,8,9); // Verilen 9 adet sayinin toplami : 45


    }

    public static void topla(int... a){

        int toplam= 0;

        for (int i = 0; i <a.length ; i++) {

            toplam += a[i];
        }

        System.out.println("Verilen " + a.length + " adet sayinin toplami : " + toplam);

    }


    public static void topla (int a, int b){
        System.out.println("Iki tamsayinin toplami : " + (a+b));
    }

    public static void topla (int a, int b, int c){
        System.out.println("Uc tamsayinin toplami : " + (a+b+c));
    }
}
