package day33_Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class C04_ParentOlmakIstemeyenClass {

    // Bir class'in ileride herhangi bir class tarafindan
    // parent edilmemesini saglamak icin
    // class deklarasyonuna "final" yazabilirsiniz


    String str = "Ali";

    List<Integer> sayilar = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    // String, List  ve Scanner Class midir ? yoksa data turu mudur ?

    // String, List  ve Scanner birer Class'dir
    // ama ayni zamanda str'in data turu String,
    // sayilar'in data turu List
    // ve scanner objesinin data turu Scanner'dir

    // Class'lar o class'dan olusturulan objeler icin data turu olurlar.



}
