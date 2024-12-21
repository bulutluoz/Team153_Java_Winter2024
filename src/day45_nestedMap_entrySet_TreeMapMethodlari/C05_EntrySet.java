package day45_nestedMap_entrySet_TreeMapMethodlari;

import day43_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C05_EntrySet extends MapDepo {

    public static void main(String[] args) {


        System.out.println(ogrenciMap);

        /*
            {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
                }
         */

        // map'de key ve value ayri ayri tutulur
        // biz key ve value'ye ihtiyac duydugumuzda
        // once keySet'i kaydedip, forEach loop ile tum Key'leri elden gecirip
        // her bir key'e ait value'yu map'den aliyorduk.

        // Java map'deki key ve value'yu birlikte ele alabilmemiz icin
        // Entry Interface'ini olusturmustur.

        System.out.println(ogrenciMap.entrySet());

        /*

            [
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
                ]
         */


        // Entry'nin map'e gore iki avantaji vardir
        // 1- for-each loop ile
        //    tum entry'leri ele alabiliyor olmamiz
        // 2- setValue(yeniValue) kullandigimizda
        //    sadece entry'i update etmekle kalmaz
        //    map'i de otomatik olarak update eder

        Set<  Map.Entry<Integer,String>  >  ogrenciEntrySeti = ogrenciMap.entrySet();

        int sira = 1;

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti) {

            System.out.println(sira +". entry  : " +eachEntry);
            System.out.println(sira +". key  : " +eachEntry.getKey());
            System.out.println(sira +". value  : " +eachEntry.getValue());

            eachEntry.setValue(  eachEntry.getValue().toUpperCase()  );

            sira++;
        }

        /*
            1. entry  : 101=Ali-Can-11-H-MF
            2. entry  : 102=Veli-Cem-10-K-TM
            3. entry  : 103=Ali-Cem-11-K-TM
            4. entry  : 104=Ayse-Can-10-H-MF
            5. entry  : 105=Sevgi-Cem-11-M-TM
            6. entry  : 106=Sevgi-Can-10-K-MF
            7. entry  : 107=Esra-Han-11-M-SOZ
         */

        System.out.println(ogrenciMap);
        // {101=ALI-CAN-11-H-MF, 102=VELI-CEM-10-K-TM, 103=ALI-CEM-11-K-TM, 104=AYSE-CAN-10-H-MF,
        //  105=SEVGI-CEM-11-M-TM, 106=SEVGI-CAN-10-K-MF, 107=ESRA-HAN-11-M-SOZ}


    }
}
