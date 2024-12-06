package day38_interfaces;

import java.util.ArrayList;
import java.util.List;

public class M01_ChildOfistisnaiInterface implements LI_InterfaceIstisnaiDurum{


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }


    public static void main(String[] args) {

        LI_InterfaceIstisnaiDurum.method4();

        M01_ChildOfistisnaiInterface obj = new M01_ChildOfistisnaiInterface();
        obj.method3();

        List<Integer> sayilar = new ArrayList<>();
    }
}
