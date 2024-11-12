package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_BenzersizArrayOlusturma {

    public static void main(String[] args) {

        // Verilen bir array’de tekrar eden elementler icin,
        // tekrar edenleri silip,
        // tum elemanlardan  sadece 1 tane olacak sekle donusturun

        int[] arr = {1,2,5,8,2,5,2,5,8,5,2,3,5,1};

        List<Integer> tekrarsizList = new ArrayList<>();


        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println("Tekrarsiz liste : " + tekrarsizList);
        // Bize gorevde array'i benzersiz hale getirin diyor
        // biz listeyi benzersiz yaptik
        // simdi array'i listedeki elementlerden olusan hale donusturmeliyiz


        arr = new int[tekrarsizList.size()];  // [0, 0, 0, 0, 0]

        // listedeki sayilari array'e kopyalayin

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);

        }

        Arrays.sort(arr);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }
}
