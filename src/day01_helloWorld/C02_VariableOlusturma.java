package day01_helloWorld;

public class C02_VariableOlusturma {

    public static void main(String[] args) {

        int sayi = 23;

       // int sayi = 30; // Variable 'sayi' is already defined in the scope

        sayi = 40;  // 40


        System.out.println("14.satirda sayi variable'inin degeri : " + sayi); // 40

        sayi = 56;  // 56

        // 2 * sayi = 40; // Variable expected
        // java'da esitligin sol tarafinda SADECE variable olmalidir

        // 30 = sayi ;  Variable expected

        sayi = sayi + 10 ;    // 66
        System.out.println("24.satirda sayi variable'inin degeri : " + sayi); // 66

        sayi = 2 * sayi -5 ;  //   127
        System.out.println("27.satirda sayi variable'inin degeri : " + sayi); // 127




    }





}
