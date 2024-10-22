package day07_IfElseifStatements;

import java.util.Scanner;

public class C03_SondaElseOlmazsa {

    public static void main(String[] args) {

        /*
            Eger if else if ... yazdigimizda
            en sonda else yoksa
            Java itiraz etmez

            ANCAAKKK else olmadan biten
            if else-if cumlelerinde bazi durumlarda
            hic bir if body'sinin calismama olasigina dikkat etmeliyiz
         */

        // kullanicidan bir cumle isteyin
        // cumlede ev geciyorsa "Ev gibisi yok" ,
        // cumlede is geciyorsa "Calismadan olmaz"
        // cumlede hem is hem ev geciyorsa "Senden krali yok" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz..");
        String cumle = scanner.nextLine().toLowerCase();


        if (cumle.contains("ev") && (cumle.contains("is")) ){
            System.out.println("senden krali yok");
        } else if (cumle.contains("is")) {
            System.out.println("calismadan olmaz.");
        } else if (cumle.contains("ev")) {
            System.out.println("Ev gibisi yok.");
        }


    }
}
