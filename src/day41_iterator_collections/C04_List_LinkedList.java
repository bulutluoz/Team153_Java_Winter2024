package day41_iterator_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C04_List_LinkedList {

    public static void main(String[] args) {

        List<Integer> liste1 = new ArrayList<>();
        List<Integer> liste2 = new LinkedList<>();

        // data turu List secildigi icin
        // butun List'lerin sahip oldugu ortak ozelliklere sahip olur


        LinkedList<Integer> linkedList = new LinkedList<>();

        liste1.add(34); // listenin sonuna 34 ekler

        liste1.add(0,25);
        liste1.add(1,30);

        System.out.println(liste1); // [25, 30, 34]




    }
}
