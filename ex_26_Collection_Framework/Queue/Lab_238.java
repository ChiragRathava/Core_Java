package ex_26_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab_238 {
    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue();
        q.add("Chirag");
        q.add("Rathava");
        System.out.println(q);

        // First In First Out
        //offer - add
        //peek - see the first element
        //poll - delete

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
