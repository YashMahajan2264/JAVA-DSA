package Recursion;

public class SumOfNaturalalternate {
    public static int SumOfNum(int n)
    {
        //base case condition
        if(n==1 || n==0)
        {
            return n;
        }
        else
        {
            if(n%2==0)
            {
                return SumOfNum(n-1)-n;
            }
            else
            {
                return SumOfNum(n-1)+n;
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(SumOfNum(n));
    }
    
}
