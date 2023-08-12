package StackAndQueue;

import java.util.*;
//Time complexity for enqueue and deque is O(1)

public class queueImplementation {
    public static void main(String[] args) {
        Queue<Integer>q= new LinkedList<>();
        //to insert the data in the queue-enqueue
        for(int i=0;i<10;i++)
        {
            q.add(i);
        }
        System.out.println("Queue looks like :"+q);

        //to print the top most element in queue
        System.out.println("The toopmost element is :"+q.peek());

        //to remove the element in queue
        q.remove();
        System.out.println("After deletion queue is :"+q);
        //size of current queue

        System.out.println("The size of current queue is "+q.size());
    }
}
