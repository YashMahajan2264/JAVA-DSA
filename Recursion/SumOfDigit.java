package Recursion;

public class SumOfDigit {
    public static int SumOfDigit(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            int m=n%10;
            return m+(SumOfDigit(n/10));
        }
      
    }
    public static void main(String[] args) {
        int  n=12345;
        int result = SumOfDigit(n);
        System.out.println(result);
    }
}
