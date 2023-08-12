package Recursion;
import java.util.*;
public class fibonacci_number {
    public static int fibonacci(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number -->");
        int n= sc.nextInt();
        int res=fibonacci(n);
        System.out.println("fibonnaci nuber is "+res);
    }
    
}
