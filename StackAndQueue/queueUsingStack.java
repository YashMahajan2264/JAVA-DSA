package StackAndQueue;
import java.util.*;
//implementation of queue using stack
//Time complexity enqueue=O(1)
//Time complexity dequeue=O(n)
//Space Complexity=O(n)

public class queueUsingStack {
    static Stack<Integer>stack1=new Stack<>();
    static Stack<Integer>stack2=new Stack<>();
    //insertion of new element
    //time complexity :O(1)
    static void enQueue(int data)
    {
        stack1.push(data);
    }
    //remove the element from stack
    //time complexity=O(n)
    static int deQueue()
    {
        int ele;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("queue is empty");
            System.exit(0);
        }
        if(stack2.empty())
        {
            while(!stack1.empty())
            {
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        //to return the deleted element
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();
        //insertin of an element in queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        //deletion of element in queue
        //FIFO 
        System.out.println("The deleted elemet is -->"+q.deQueue());
        System.out.println("The deleted elemet is -->"+q.deQueue());


    }
}
