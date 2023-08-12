package Recursion;

import java.util.Scanner;

public class recursiveBinarySerach {
    public static int binarySearch(int arr[],int low,int high,int target)
    {
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                return binarySearch(arr, low, mid-1, target);
            }
            else 
            {
                return binarySearch(arr, mid+1, high, target);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        System.out.println("Enter the target value:- ");
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();

        //function calling
        int result=binarySearch(arr,0,arr.length-1,target);

        if(result==-1)
        {
            System.out.println("No target is present in an array");
        }
        else
        {
            System.out.println("The element present at index "+result);
        }
    }
}
