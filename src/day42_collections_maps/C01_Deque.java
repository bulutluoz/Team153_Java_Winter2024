package day42_collections_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {
        // Double Ended Queue
        // Iki uclu kuyruk
        // Queue'in child'idir , dolayisiyla Queue'dan daha cok method'a sahiptir
        // double ended ozelligi sebebiyle
        // pek cok method'un ...first() ve  ...end() seklinde iki ayri uygulamasi vardir

        Deque<Integer> deque = new LinkedList<>();

        deque.add(45);
        deque.addFirst(23);
        deque.addLast(13);

        System.out.println(deque); //  [23, 45, 13]

        deque.add(33); // This method is equivalent to addLast.
        deque.addLast(76);

        System.out.println(deque); // [23, 45, 13, 33, 76]

        deque.removeFirst(); // degerinin ne olduguna bakmaksizin ilk elementi siler ve bize getirir
        deque.removeFirstOccurrence(33); // 33'un ilk kullanimini bulup siler


        System.out.println(deque); // [45, 13, 76]

        deque.push(56); // This method is equivalent to addFirst.

        System.out.println(deque); // [56, 45, 13, 76]


        deque.pop(); // This method is equivalent to removeFirst().

        System.out.println(deque); // [45, 13, 76]

        System.out.println(deque.getLast());
        System.out.println(deque.getFirst());
        // deque double ended queue oldugundan
        // bastaki veya sondakini getiriyor ama aradan index ile eleman getirmiyor




    }
}
