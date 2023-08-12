package Arrays;
import java.util.*;
//Space Complexity=O(1)
//Time Complexity=O(n^2)
//Stable algorithm
//In-place algorithm
//Only one sorting algo which give O(n) in best case scenario

public class Insertion_sort {
    public static void insertionSort(int arr[])
    {
        //since no comparison form 0th loc so i=1
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                //swap 
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={70,20,50,30,90,5,15};
        insertionSort(arr);
        System.out.println("Sorted array is-->");
        System.out.println(Arrays.toString(arr));
    }
    
}
