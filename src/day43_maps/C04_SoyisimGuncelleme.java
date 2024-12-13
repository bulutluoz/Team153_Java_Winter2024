package day43_maps;

public class C04_SoyisimGuncelleme extends MapDepo{

    public static void main(String[] args) {

        // numarasi verilen ogrencinin
        // soyismini verilen yeniSoyisim olarak update edin

        int ogrenciNo = 102;
        String yeniSoyisim = "Yilmaz";

        //1.adim ogrenciNo ile value'ye ulas
        String eskiValue = ogrenciMap.get(ogrenciNo); // Veli-Cem-10-K-TM

        //2.adim bilgilere erismek icin split
        String[] eskiValueArr = eskiValue.split("-"); //  [Veli, Cem, 10, K, TM]

        //3.adim artik soyismi guncelleyebiliriz
        eskiValueArr[1] = yeniSoyisim; //  [Veli, Yilmaz, 10, K, TM]

        //4.adim array'de yaptigimiz guncellemeyi map'e islemeliyiz
        //        map'i guncellemek icin key ==> ogrenciNo
        //                        yeni value ==> eski value arr'inin birlestirilmis hali

        String yeniValue = String.join("-",eskiValueArr); //  Veli-Yilmaz-10-K-TM

        ogrenciMap.put(ogrenciNo,yeniValue);

        System.out.println(ogrenciMap);
    }
}
