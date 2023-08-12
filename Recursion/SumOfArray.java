package Recursion;

public class SumOfArray {
    public static int sumOfArray(int arr[],int i)
    {
        int n=arr.length;
        if(i==n)
        {
            return 0;
        }
        else
        {
            return sumOfArray(arr,i+1)+arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,60,70};

        System.out.println(sumOfArray(arr,0));
    }
}
