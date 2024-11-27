package day32_encapsulation;

public class C06_GetterSetterBirlikteKullanimi {

    public int sayiPublic = 34;


    private int sayiPrivate = 45;

    public int getSayiPrivate() {
        return sayiPrivate;
    }

    public void setSayiPrivate(int sayiPrivate) {
        this.sayiPrivate = sayiPrivate;
    }
}
