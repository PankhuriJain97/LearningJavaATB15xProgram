package ex_27_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_138_PQ {
    static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue();
        //follows natural sorting
        PQ.add("Pankhuri");
        PQ.add("Pankhuri");
        PQ.add("Jain");
        PQ.add("Shivani");
        PQ.add("jain");

        System.out.println(PQ);
        System.out.println(PQ.peek());
        System.out.println(PQ.poll());
        System.out.println(PQ);
    }
}
