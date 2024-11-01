package day14_nestedForLoops_methodKullanma;

public class C08_ReturnType {

    public static void main(String[] args) {


        String str = "Java candir";

        str.toUpperCase();

        // Run yaptigimizda 10.satirdaki method calisir
        // ve bize buyuk harflerle "JAVA CANDIR" getirir

        // AMMMAAA yazdirmadigimiz icin konsolda goremeyiz
        //         ve atama yapmadigimiz icin de degisiklik kalici olmaz


        System.out.println(str.toUpperCase());
        // 19.satirda da 10.satirdaki gibi toUpperCase() calisti
        // biz direkt yazdirdigimiz icin sonucu konsolda gorduk
        // ama sonucu bir variable'a kaydetmedigimiz icin
        // yapilan degisiklik sadece 19.satira ozel oldu, sonrasinda kullanmayiz

        System.out.println(str); // Java candir


        String yeniHali = str.toLowerCase();
        // 28.satirda da toLoweCase() calisir ve yeni halini bize getirir
        // biz yazdirmadigimiz icin yeni halini goremeyiz
        // AMMMAAA yeni halini kaydettigimiz icin kodun ilerleyen asamalarinda
        // ne zaman istersem yeni halini yazdirabilir veya kullanbiliriz

        System.out.println(yeniHali); // java candir

        /*
            Ozetleyecek olursak
            bize bir sonuc return eden(döndüren) method'larda
            ISTERSEK hemen donen degeri yazdirabilir
            veya ISTERSEK ilerde kullanilmak uzere KAYDEDEBILIRIZ.

         */

        str.substring(4,5);
        /*
            bir method call'da yazdigimiz degerlere ARGUMENT denir
            method deklarasyonunda (int beginIndex, int endIndex) parantez icindeki variable'lara ise PARAMETRE denir
            method call'un calismasi icin argument'ler ile parametreler UYUMLU OLMALIDIR
            eger uyumlu olmazlarsa Java CTE verir ve kod calismaz
         */

    }
}
