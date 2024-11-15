package day25_constructors;

public class C04_KodOkumadaDikkatEdilecekler {

    int sayi = 23;
    String isim = "Ali";
    char chr = '@';

    C04_KodOkumadaDikkatEdilecekler(int sy , String ism){
        sayi = 34;
        isim = ism.toUpperCase();
    }  // 1
    C04_KodOkumadaDikkatEdilecekler(){
        chr = '%';
        isim = "Esra";
    } // 2

    C04_KodOkumadaDikkatEdilecekler(int sy, String ism, char a){
        isim = ism;
        sayi= sy;

    } // 3

    public static void main(String[] args) {
        /*
            Normal sartlar altinda
            Constructor'daki parametreler
            olusturulan objeye ait variable'lara atanmak uzere kulllanilir.

            ANCAAAKKK kod okuma sorularinda
            biz misafiriz
            ve misafir umdugunu degil buldugunu yer
            yanii her zaman kodlar olmasi gerektigi sekilde yazilmaz
            bizi yaniltmak uzere beklenmeyen atamalar yapilabilir

            Kod okuma sorularinda
            satir satir takip etmeden
            hic bir variable'in degerini KESIN OLARAK BILEMEYIZ
         */

       C04_KodOkumadaDikkatEdilecekler obj3 = new C04_KodOkumadaDikkatEdilecekler(25,"Yigit",'$');
          System.out.println(obj3.sayi); // 25
          System.out.println(obj3.isim); // Yigit
          System.out.println(obj3.chr); // $



//        C04_KodOkumadaDikkatEdilecekler obj2 = new C04_KodOkumadaDikkatEdilecekler(44,"Tugba");
//        // 1 numarali constructor calisir
//        System.out.println(obj2.sayi); // 34
//        System.out.println(obj2.isim); // TUGBA
//        System.out.println(obj2.chr); // @


//        C04_KodOkumadaDikkatEdilecekler obj1 = new C04_KodOkumadaDikkatEdilecekler();
//        // 2 numarali constructor calisir
//        System.out.println(obj1.sayi); // 23
//        System.out.println(obj1.isim); // Esra
//        System.out.println(obj1.chr); // %



    }

}
