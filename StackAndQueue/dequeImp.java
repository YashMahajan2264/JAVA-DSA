package StackAndQueue;
import java.util.*;

public class dequeImp {
    public static void main(String[] args) {
        Deque<Integer>deque =  new ArrayDeque<>();
        deque.addFirst(4);
        deque.addFirst(7);
        deque.addFirst(9);

        deque.addLast(12);
        deque.addLast(14);

        System.out.println("Deque data is "+deque);

        deque.removeLast();
        System.out.println("Deque data after the deletion is  "+deque);

        deque.removeFirst();
        System.out.println("Deque data after 2nd deletion is  "+deque);


    }
}
