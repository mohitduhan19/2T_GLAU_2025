package T.Lec5_Lab;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Operations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Queue after add operations: " + queue);
        System.out.println("Head using peek(): " + queue.peek());

        System.out.println("Removed using remove(): " + queue.remove());
        System.out.println("Queue after remove(): " + queue);
        System.out.println("Removed using poll(): " + queue.poll());
    }
}