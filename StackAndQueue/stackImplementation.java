package StackAndQueue;
import java.util.*;

public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer>stack1= new Stack<>();

        //insert the elemnt in the stack
        stack1.push(2);
        stack1.push(5);
        stack1.push(7);
        stack1.push(9);

        //diaplay top most element
        System.out.println("The top most element inn the stack is s"+stack1.peek());

        //delete the element
        stack1.pop();
        System.out.println("The top most element in stack"+stack1.peek());

        //search for an element
        //if element is not present in satck then search method return -1
        System.out.println("Element 7 is present at index-->"+stack1.search(7));

        //whether the stack is empty or not
        System.out.println("Is the satck is empty or not? "+stack1.empty());
    }
}
