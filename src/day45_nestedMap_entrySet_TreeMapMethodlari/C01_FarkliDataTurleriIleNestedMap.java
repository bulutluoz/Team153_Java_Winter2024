package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class C01_FarkliDataTurleriIleNestedMap {

    public static void main(String[] args) {

        /*
                asagidaki rezervasyon map'ini olusturun


           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                                   "checkin" : "2024-07-21",
                                   "checkout" : "2024-08-10"
                                      },
                "additionalneeds" : "wi-fi" }

        */

        /*
            Map olusturmadan once
            1- hangi datalari key, hangilerini value yapacagimiza karar verelim
            2- key ve value'nun data turune karar verelim
               key ==> String        value ==> Object
         */


        Map<String, Object> rezervasyonMapi = new HashMap<>();

        rezervasyonMapi.put("firstname","Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid",false);

        Map<String,String> bookingdatesMapi = new HashMap<>();
        bookingdatesMapi.put("checkin","2024-07-21");
        bookingdatesMapi.put("checkout","2024-08-10");

        rezervasyonMapi.put("bookingdates",bookingdatesMapi);
        rezervasyonMapi.put("additionalneeds","wi-fi");


        System.out.println(rezervasyonMapi);

        /*
            {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates={
                                checkin=2024-07-21,
                                checkout=2024-08-10
                                },
                totalprice=500,
                depositpaid=false,
                lastname=Bulut
                }
         */
        // rezervasyon map'indeki firstname'in degerini yazdirin
        System.out.println(rezervasyonMapi.get("firstname")); // Ahmet

        // rezervasyon map'indeki depositpaid'in degerini yazdirin
        System.out.println(rezervasyonMapi.get("depositpaid")); // false

        // rezervasyon map'indeki checkin'in degerini yazdirin
        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin")); // 2024-07-21
        // rezervasyon map'indeki checkin'in degerini yazdirin
        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkout")); // 2024-08-10


    }
}
