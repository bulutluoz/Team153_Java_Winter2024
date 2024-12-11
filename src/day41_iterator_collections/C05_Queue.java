package day41_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // bu obje her ne kadar LinkedList constructor'ini kullanmis olsa da
        // data turu Queue oldugundan
        // tum Queue'larin sahip oldugu ORTAK OZELLIKLERI gosterir

        // Queue (kuruk) FIFO ozelliklerini gosterir
        // eklemeler sona, silmeler bastan

        queue.add(34);
        queue.add(56);
        queue.add(11);
        queue.add(32);
        queue.add(76);
        queue.add(11);

        System.out.println(queue); // [34, 56, 11, 32, 76, 11]

        queue.remove();
        // Retrieves and removes the head of this queue.
        // This method differs from poll() only in that it throws an exception if this queue is empty.
        // queue2.remove(); // NoSuchElementException

        System.out.println(queue); // [56, 11, 32, 76, 11]


        System.out.println(queue.poll()); // 56
        // Retrieves and removes the head of this queue,
        // or returns null if this queue is empty.

        System.out.println(queue); // [11, 32, 76, 11]

        System.out.println(queue2.poll()); // null


        System.out.println(queue.element()); // 11
        // Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        //System.out.println(queue2.element()); // NoSuchElementException


        System.out.println(queue.peek()); // 11
        // Retrieves, but does not remove, the head of this queue,
        // or returns null if this queue is empty.
        System.out.println(queue2.peek()); // null


        queue.offer(34);
        // Inserts the specified element into this queue if it is possible to do
        // so immediately without violating capacity restrictions.
        // When using a capacity-restricted queue, this method is generally preferable to add,
        // which can fail to insert an element only by throwing an exception.

        // add() 'e benzer ancak EGER kapasite sinirlamasi varsa
        // kapasiteyi kontrolm eder ve kapasite dolu ise eklemez
        // add() ise her durumda ekler


    }
}
