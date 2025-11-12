package ex34_CF_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LAb195_LinkendASQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
