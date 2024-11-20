package day28_passByValue;

import java.util.Arrays;

public class C03_ArrayPassByValue {

    public static void main(String[] args) {

        /*
            Birden fazla element barindiran yapilarda da PassByValue gecerlidir

            Yani gidilen method'da array veya list'in kendisine atama yapilirsa
            Java bu degisikligi kalici olarak yapmaz
            Method'da yapilan atama method'da kalir.

            ANCAAKK coklu element barindiran yapilarin ozel bir durumu vardir
            EGER array veya list'in kendisine degil de
            SADECE elementlerine atama oluyorsa
            Java array veya List degismedigi icin elementlerdeki degisiklige bakmaz
            yeni hali kalici olur.
         */

        int[] arr = {1,2,3,4,5};

        elementleriBirArtir(arr);
        // Method icinde yazdirilan arr : [2, 3, 4, 5, 6]

        // elementleriBirArtir method'unda arr'nin elementlerine atama oldu
        System.out.println("Main method icinde ilk method call'dan sonra arr : " + Arrays.toString(arr));
        // Main method icinde ilk method call'dan sonra arr : [2, 3, 4, 5, 6]


        yeniArrAta(arr); // 2. method'da array'in son hali : [4, 7, 8, 3, 1]

        // yeniArrAta method'unda arr'nin kendisine atama var
        System.out.println("Main method icinde 2. method call'dan sonra arr : " + Arrays.toString(arr));
        // Main method icinde 2. method call'dan sonra arr : [2, 3, 4, 5, 6]

        bosArrayAta(arr); // 3. method'da a array'i  : [0]

        // method'da array'in kendisine atama oldu mu ?  EVET
        // degisiklik kalici degil
        System.out.println("Main method icinde 3. method call'dan sonra arr : " + Arrays.toString(arr));
        // Main method icinde 2. method call'dan sonra arr : [2, 3, 4, 5, 6]

        yolcuDegistir(arr); // yolcuDegistir method'unda array : [6, 9, 4, 5, 6]
        // method'da array'in kendisine atama oldu mu ?  HAYIR elementlere atama yapildi
        // degisiklik kalici

        System.out.println("Main method icinde 4. method call'dan sonra arr : " + Arrays.toString(arr));
        // Main method icinde 4. method call'dan sonra arr : [6, 9, 4, 5, 6]

    }

    public static void elementleriBirArtir(int[] arr) {
        // verilen array'deki tum elementleri 1 artirin

        // bu method'da array'in kendisine atama yok
        // array'in elementlerine atama var

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=1;  // atama arr'ye degil, arr[i]'ye
                         // araba degil yolcular degisiyor
        }

        System.out.println("Method icinde yazdirilan arr : "+ Arrays.toString(arr));
    }

    public static void yeniArrAta(int[] arr){
        // verilen array'e icinde 4,7,8,3,1 elementlerinin bulundugu
        // yeni bir array atayin

        int[] yeniArr = {4,7,8,3,1};

        arr = yeniArr;  // bu method'da array'in kendisine direkt deger atamasi var
                        // arabanin kendisi degisiyor

        System.out.println("2. method'da array'in son hali : " + Arrays.toString(arr));
    }

    public static void bosArrayAta( int[] a ){
        a= new int[1];
        System.out.println("3. method'da a array'i  : " + Arrays.toString(a)  );
    }

    public static void yolcuDegistir(int[] b){

        b[0] = 6;
        b[1] = 9;
        System.out.println("yolcuDegistir method'unda array : " + Arrays.toString(b));
    }
}
