import List.ListNode;
import Queue.StackQueue;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out .println(queue.pop());
        System.out .println(queue.pop());
        System.out .println(queue.pop());
        System.out .println(queue.pop());
        System.out .println(queue.pop());
    }
}
