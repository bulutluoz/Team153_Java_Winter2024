package day06_IfStatements;

import java.util.Scanner;

public class C09_IfElseStatement {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini girin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1==kenar3 && kenar1>0)
            System.out.println("Eskenar ucgen");
        else  System.out.println("Eskenar ucgen degil");

    }
}
