package Arrays;
//Time complexity=O(logn)
//Space Complexity=O(1)

import java.util.Scanner;

public class Binary_search {
    public static int binarSearch(int arr[],int tag)
    {
        int start =0;
        int last =arr.length-1;
        //or u can take n-1 as last
        int mid;
        while(start<=last)
        {
            mid =(start+(last))/2;

            if(arr[mid]==tag)
            {
                return mid;
            }
            else if(tag<arr[mid])
            {
                last=mid-1;
            }
            else if(tag>arr[mid])
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array-->");
        int n = sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements of array-->");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the target element to be searched-->");
        int tag =sc.nextInt();
        //Binary search
        int idx=binarSearch(arr, tag);
        if(idx!=-1)
        {
            System.out.println("Target is found at index "+idx);

        }
        else
        {
            System.out.println("Target is not found");
        }


        
    }
    
}
