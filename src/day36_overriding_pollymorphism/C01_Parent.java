package day36_overriding_pollymorphism;

public class C01_Parent {
 // Class isminin yaninda cikan o harfi
 // bu class'in baska bir class tarafindan parent edinildigini gosterir
 // Is subclassed by C02_Child (day36_overriding_pollymorphism)











    public void method1(){
        //Is overridden in C02_Child (day36_overriding_pollymorphism)
        //gecersiz kilinan

    }

    public void method2(String s){

        // signature ==> method2 String
    }






  public void method3(int sayi, String a){
        // signature method3 int String
      System.out.println(a+sayi);
  }



  public int method4(int a){

        return 2*a;
   }









   public String method5(String a){

        return a.toUpperCase();
   }





   public static void method6(){

    }









   private void method7(){



   }


   public final void method8(){

   }





   public double method9(double a){
        return  a+3;
   }









   void method10(){

   }





    public void method11(){

    }





    public int method12(){
        return 0;
    }

    public String method13(){

        return null;
    }




    public Object method14(){

        return null;
    }









    public void method15(){

    }






















}
