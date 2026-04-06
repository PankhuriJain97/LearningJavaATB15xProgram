package ex_27_Collection_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Lab_139_ArrayDequeue {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<>();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);
    }

}
