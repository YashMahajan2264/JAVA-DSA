package Recursion;

import java.util.Scanner;

public class staircase {
    public static int staircase_method(int n)
    {
        //base case
        if(n<=1)
        {
            return n;
        }
        else
        {
            return staircase_method(n-1)+staircase_method(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs-->");
        int n=sc.nextInt();

        int result=staircase_method(n);
        System.out.println("The number of possible ways are "+result);

    }
}
