package StackAndQueue;
import java.util.*;
//Time complexity add: O(n) 
//Time complexity remove : O(1)
//space complexity : O(n)

public class stackUsingQueue {
    static Queue<Integer>q1=new LinkedList<>();
    static Queue<Integer>q2=new LinkedList<>();

    //add an element in stack
    //time complexity=O(n)
    static void add(int data)
    {
        //1.Move all data elemnt form q1 to q2
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        //2.Insert the new data in q1
        q1.add(data);
        //3.Move back all the elemnt from q2 to q1
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }

    }
    //To remove the element form satck
    //time complexity=O(1)
    static int remove()
    {
        if(q1.isEmpty())
        {
            System.out.println("Stack underflow");
            System.exit(0);
        }

        int ele=q1.peek();
        q1.poll();
        return ele;

    }
   public static void main(String[] args) {
        stackUsingQueue s= new stackUsingQueue();
        //push operation
        s.add(2);
        s.add(5);
        s.add(7);
        s.add(10);

        //pop operation
        System.out.println("Deleted element is "+s.remove());
        System.out.println("Second deleted element is "+s.remove());
   } 
}
