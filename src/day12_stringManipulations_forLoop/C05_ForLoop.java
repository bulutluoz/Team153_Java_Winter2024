package day12_stringManipulations_forLoop;

public class C05_ForLoop {

    public static void main(String[] args) {

        // 1'den 10'a kadar(sinirlar dahil) olan sayilari yan yana
        // aralarinda bir bosluk birakarak yazdirin

        System.out.println("1 2 3 4 5 6 7 8 9 10");

        // 2 basamakli pozitif tamsayilari yan yana
        // aralarinda bir bosluk birakarak yazdirin

        for (int i = 10; i <=99 ; i++) {
            // int i = 10 ile bir variable olusturulmus olur
            // i <= 99  olusturulan i variable'i bu sarti sagladikca loop devam eder
            // i++ her loop tekrarinda i nasil degisecek

            System.out.print( i + " ");

        }

        System.out.println("");



        // 1'den baslayip 5'e kadar(5 haric) olan tamsayilarin toplamini bulun

        int toplam = 0 ;

        for (int i = 1; i <5 ; i++) {

            toplam +=i;

        }

        System.out.println(toplam);




        // 1220'den baslayip 1445'e kadar(1445 haric) olan tamsayilarin toplamini bulun

        toplam = 0 ;

        for (int i = 1220; i < 1445 ; i++) {

            toplam +=i;

        }

        System.out.println(toplam); // 299700


        // 100'den baslayarak 250'ye kadar (sinirlar dahil)
        // 5'er 5'er artirarak yanyana yazdirin

        for (int i = 100; i <=250 ; i+=5 ) {

            System.out.print( i + " ");
        }

        System.out.println("");



        // 100'den baslayarak 250'ye kadar (sinirlar dahil)
        // 17'ser 17'ser artirarak yanyana yazdirin

        for (int i = 100; i <=250 ; i+=17 ) {

            System.out.print( i + " ");
        }

        System.out.println("");



        // 100'den baslayarak 3'er 3'er geriye dogru gidip
        // pozitif sayilari yazdirin

        for (int i = 100; i > 0 ; i-=3 ) {
            System.out.print( i + " ");
        }

        System.out.println("");


        // 3 basamakli sayilardan 137 ile bolunebilenleri yazdirin

        for (int i = 100; i <=999 ; i++) {

            if ( i % 137 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println("");

        // 23457 ile 26234 (sinirlar dahil) arasinda 113 ile bolunen sayilari yazdirin

        for (int i = 23457 ; i <=26234 ; i++) {

            if (i % 113 == 0){
                System.out.print( i + " ");
            }

        }

        System.out.println("");
    }
}
