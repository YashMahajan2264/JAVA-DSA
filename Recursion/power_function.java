package Recursion;

import java.util.Scanner;
//Time Complexity=O(logn)
//Space Complexity=O(logn)
public class power_function {
    public static int power_function(int a,int b)
    {
        int mid=0,result=0,finalResult=0;
        //base condition
        if(b==1)
        return a;

        else
        {
            mid=b/2;
            //recursive funcion call
            result=power_function(a,mid);
            finalResult=result*result;

            if(b%2==0)
            {
                //even power
                return finalResult;
            }
            else
            {
                //odd power
                return a*finalResult;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b-->");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int result=power_function(a,b);
        System.out.println("a^b---->"+result);
    }
}
