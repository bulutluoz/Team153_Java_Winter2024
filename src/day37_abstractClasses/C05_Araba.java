package day37_abstractClasses;

public abstract class C05_Araba {




    /*
        dunyada araba diye bir obje yok
        o zaman bu class obje olusturmak icin degil
        child class'lari duzenlemek icin olusturulmus

        o zaman bu class'i abstract yapmak iyi bir tercih olabilir
     */
    // child class'larin mutlaka bulunduracagi method'lar
    public abstract void motor();
    public abstract void  sanzuman();
    public abstract void teker();
    public abstract void direksiyon();
    public abstract void marka();
    public abstract void model();

    // child class'larin isterlerse bulundurabilecekleri method'lar

    public void klima(){

    }
    public void sunroof(){

    }
    public void otopilot(){}


}
