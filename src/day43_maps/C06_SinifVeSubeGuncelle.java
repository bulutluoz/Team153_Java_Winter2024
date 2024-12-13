package day43_maps;



public class C06_SinifVeSubeGuncelle extends MapDepo {

    public static void main(String[] args) {

        // numarasi verilen ogrencinin sinifini ve subesini
        // verilen yeni sinif ve yeni sube olarak update edin

        int ogrenciNo = 103;
        int yeniSinif = 11;
        String yeniSube = "P";

        // 1.adim numara ile value'e ulasabilirim
        String eskiValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2.adim bilgilere ulasabilmek icin split yapalim
        String[] eskiValueArr = eskiValue.split("-"); // [Ali, Cem, 11, K, TM]

        // 3.adim istenen bilgileri update et
        eskiValueArr[2] = yeniSinif+"" ;
        eskiValueArr[3] = yeniSube;
        // [Ali, Cem, 11, P, TM]

        // 4.adim degisiklik array'de yapildi
        //        array'i birlestirip yeni value'yu bulalim
        String yeniValue = String.join("-",eskiValueArr); // Ali-Cem-11-P-TM

        // 5.adim ogrenci no ve yeni value ile map'i update edelim
        ogrenciMap.put(ogrenciNo,yeniValue);




    }
}
