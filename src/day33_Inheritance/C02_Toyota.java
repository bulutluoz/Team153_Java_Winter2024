package day33_Inheritance;

public class C02_Toyota extends C01_Araba{

    /*
        java'da bir class olusturdugumuzda
        yeni olusturulan class'in baslangic itibariyle
        var olan baska bir class'daki TUM OZELLIKLERE sahip olmasini istersek
        extends keyword ile yeni class'i eski class'a child yapabiliriz

        1- bir class baska bir class'i parent edinirse
           baslangic itibariyle parent class'daki tum ozelliklere sahip olur

                C02_Toyota toyota1 = new C02_Toyota();
                System.out.println(toyota1.marka); // Marka belirtilmedi
                System.out.println(toyota1.model); // Model belirtilmedi
                System.out.println(toyota1.motor); // Motor belirtilmedi
                System.out.println(toyota1.kasa); // Kasa secilmedi
                System.out.println(toyota1.renk); // Renk secilmedi

        2- child class istedigi ozellikleri kendisine uyarlayabilir

        3- child class isterse yeni ozellikler ekleyebilir
     */

    String marka = "Toyota";
    String motor = "Toyota Motor";
    String uretimYeri = "Japonya ve Turkiye";
    String aku = "Inci";
    String lastik = "Pirelli";

    public static void main(String[] args) {


    }

}
