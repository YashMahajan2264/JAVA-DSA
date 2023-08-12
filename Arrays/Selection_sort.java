package Arrays;
import java.util.*;
//Time Complexity=O(n^2)
//Space complexity=O(1)
//In-place

public class Selection_sort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            //min_idx is reponsible for storing index of minimum value in every iteration
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            if(min_idx!=i)
            {
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={70,20,50,30,90,5,15};
        selectionSort(arr);
        System.out.println("Sorted array is-->");
        System.out.println(Arrays.toString(arr)); 
    }
}
