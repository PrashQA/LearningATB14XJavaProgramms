package ex34_CF_QUEUE;

import java.util.PriorityQueue;

public class Lab193 {
    // Queue -> 0.001% in Automation
    // FIFO
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
