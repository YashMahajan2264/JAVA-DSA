package Arrays;
import java.util.*;
//Time complexity=O(logn)
//Space Complexity=O(1)

public class Lower_Bound {
    public static int Lower_Bound(int arr[],int tag)
    {
        int start =0;
        int last =arr.length-1;
        //or u can take n-1 as last
        int mid;
        int result =-1;
        while(start<=last)
        {
            mid =(start+(last))/2;

            if(arr[mid]==tag)
            {
                result= mid;
                //We want lower bound of an element so we need to traverse towards left side of array
                last=mid-1;
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
        return result;
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

        System.out.print("Enter the target element to be searched its first occurrence-->");
        int tag =sc.nextInt();

        int result=Lower_Bound(arr, tag);

        if(result!=-1)
        {
            System.out.println("First occurence of element is found at "+result);
        }
        else
        {
            System.out.println("Target element is not found");
        }
    }
    
}
