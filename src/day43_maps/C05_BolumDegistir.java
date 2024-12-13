package day43_maps;

public class C05_BolumDegistir extends MapDepo{

    public static void main(String[] args) {

        // numarasi verilen ogrencinin bolumunu
        // verilen yeni bolum olarak update edin

        int ogrenciNo = 105;
        String yeniBolum = "MF";

        // 1.adim numara ile value'e ulasabilirim
        String eskiValue = ogrenciMap.get(ogrenciNo); // Sevgi-Cem-11-M-TM

        // 2.adim bilgilere ulasabilmek icin split yapalim
        String[] eskiValueArr = eskiValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        // 3.adim artik bolumu update edebiliriz
        eskiValueArr[4] = yeniBolum;  // [Sevgi, Cem, 11, M, MF]

        // 4.adim degisiklik array'de yapildi
        //        array'i birlestirip yeni value'yu bulalim
        String yeniValue = String.join("-",eskiValueArr); // Sevgi-Cem-11-M-MF

        // 5.adim ogrenci no ve yeni value ile map'i update edelim
        ogrenciMap.put(ogrenciNo,yeniValue);

        System.out.println(ogrenciMap);


    }
}
