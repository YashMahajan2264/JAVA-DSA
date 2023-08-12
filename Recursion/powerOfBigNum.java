package Recursion;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.*;
import java.math.*;

public class powerOfBigNum {
    public static BigInteger powerFind(BigInteger a , int b)
    {
        //base case condition
        if(b==1)
        {
            return a;
        }

        BigInteger result=powerFind(a, b/2);
        BigInteger Finalresult= result.multiply(result);

        if(b%2==0)
        {
            return Finalresult;
        }
        else
        {
            return a.multiply(Finalresult);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b-->");

        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();

        BigInteger result=powerFind(a,b);
        System.out.println("Power of "+a+" is "+result);
    }
    
}
