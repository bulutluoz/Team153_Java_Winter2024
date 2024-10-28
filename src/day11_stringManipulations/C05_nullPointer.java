package day11_stringManipulations;

public class C05_nullPointer {
    public static void main(String[] args) {

        String ogr1 = "Yahya Gulsoy";
        String ogr2 = "Elif Evsen";

        String ogr3;

        /*
            bir kod blogunun icinde
            deger atamadan variable deklare edilebilir
            ANCAAAAKKK deger atamadan KULLANILAMAZ

            PEKII "" atasak

            "" veya "   " atamak variable'i kullanabilmek icin guzel olur
            ANCAAAKKK Java bunlari da isim gibi bir deger atanmislar grubuna katar
            yani "Yahya Gulsoy" atamak ile "" atanmis olmasi Java acisindan birdir


            Bize ekstra bir cozum lazim

            hem deger atamayacagiz
            hem de java yazdirmamiza engel olmayacak

            null bir deger degil pointer'dir
            null olarak isaretlenen bir variable'a
            deger atanmadigini Java bilir
            ama yazdirilmasina da ENGEL OLMAZ

            biz bir non-primitive variable'i null olarak isaretledigimizde
            Java SADECE yazdirmak uzere bize izin verir

            AMMMMMAAAA izin disina cikarsaniz
            yazdirmak disinda bir islem yaparsaniz
            Kodu calistirdiginizda NullPointerException olusur
            ve kodun calistirilmasi durdurulur

         */

        //System.out.println(ogr3);

        String ogr4 = "";
        String ogr5 = "  ";
        String ogr6 = "         ";

        System.out.println(ogr4);


        String ogr7 = null ;
        System.out.println(ogr7); // null
        System.out.println("ogrenci1 : " + ogr1);
        System.out.println("ogrenci2 : " + ogr2);
        System.out.println("ogrenci7 : " + ogr7);

        System.out.println(ogr7.length()); // NullPointerException

    }
}
