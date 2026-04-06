package ex_27_Collection_Framework.CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab_140_LL_as_Queue {
    static void main(String[] args) {
        Queue<Integer> LLQ = new LinkedList<>();
        LLQ.add(6);
        LLQ.add(1);
        LLQ.add(8);
        LLQ.add(0);

        System.out.println(LLQ);

        Iterator<Integer> iterator = LLQ.iterator();
        while(iterator.hasNext())
        {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
