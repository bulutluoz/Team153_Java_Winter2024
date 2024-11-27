package day32_encapsulation;

public class C05_Runner {


    public static void main(String[] args) {

        C04_EncapsuleDatalar obj = new C04_EncapsuleDatalar();

        //System.out.println(obj.satisTutari); // Read
        //obj.satisTutari = 500; // write

        //System.out.println(obj.toplamSatisTutari); // Read
        //obj.toplamSatisTutari= 4000;

        System.out.println(obj.getToplamSatisTutari()); // 0

        // obj.getToplamSatisTutari() = 45;
        // methodCall bize deger getiriyor deger'e atama olmaz
        // esitligin sol tarafinda SADECE VARIABLE olabilir

        obj.setSatisTutari(500);
        obj.setSatisTutari(2000);
        obj.setSatisTutari(1000);

        // System.out.println( obj.setSatisTutari(100) );

        System.out.println(obj.getToplamSatisTutari()); // 3500

    }
}
