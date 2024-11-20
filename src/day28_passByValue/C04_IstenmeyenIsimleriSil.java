package day28_passByValue;

import day22_arrayList.C03_IstenmeyenIsimleriSilme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_IstenmeyenIsimleriSil {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Yigit","Yusuf","Sumeyra","Tugba","Faig"));

        C03_IstenmeyenIsimleriSilme.istenmeyenElementleriSil(isimler,"u");

        System.out.println(isimler); // [Yigit, Faig]

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Can");

        System.out.println(isimler); // [Yigit, Faig, Ali, Veli, Can]

        istenmeyenElementleriSil(isimler,"a");

        System.out.println("2.method call'dan sonra : " + isimler);
        // 2.method call'dan sonra : [Yigit, Faig, Ali, Veli, Can]


    }

    public static List<String> istenmeyenElementleriSil(List<String> isimler , String istenmeyenHarf){

        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < yeniList.size() ; i++) {

            yeniList.set(i, isimler.get(i));
        }



        for (int i = 0; i < yeniList.size(); i++) {

            if ( yeniList.get(i) . contains(istenmeyenHarf) ){

                yeniList.remove(yeniList.get(i));
                // bir isim silindiginde, kalanlarin index'i 1 kuculur
                // aradan element kacmamasi icin
                // sildikten sonra islem yapacagimiz i'yi de 1 kucultmeliyiz
                i--;
            }

        }
        return yeniList;
    }
}
