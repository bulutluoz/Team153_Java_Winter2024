package day32_encapsulation;

public class C07_Runner {

    public static void main(String[] args) {

        C06_GetterSetterBirlikteKullanimi obj = new C06_GetterSetterBirlikteKullanimi();


        System.out.println(obj.sayiPublic); // 34
        obj.sayiPublic = 55;
        System.out.println(obj.sayiPublic); // 55


        System.out.println(obj.getSayiPrivate());  // 45
        obj.setSayiPrivate(60);
        System.out.println(obj.getSayiPrivate());  // 60

        /*
            Bir variable'i public yapmak ile
            private yapip hem getter, hem de setter olusturmak arasinda
            islevsel olarak bir fark YOKTUR

            ikisine de deger atayabiliyoruz,
            ikisinin de degerini yazdirabiliyoruz.

            bu ikisi arasindaki tek fark
            encapsule ettigimiz private variable'a
            atama yaparken set... diyerek, isleme vurgu yapmis oluruz
            ayni sekilde degerini alirken de
            get... diyerek isleme vurgu yapilmis olur.

            Bazi developer'lar
            variable'lari public yapmak yerine
            private yapip getter ve setter birlikte kullanarak
            get ve set islevine vurgu yapmayi tercih ederler.
         */

    }
}
