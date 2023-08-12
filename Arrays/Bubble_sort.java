package Arrays;
import java.util.*;
//Time Complexity=O(n^2)
//Space Complexity=O(1)

public class Bubble_sort {
    public static void bubbleSort(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped)
            {
                //if there is no swap in first iteration
                //then there is no need to run entire for loop
                break;
            }
        }

    }
    
    public static void main(String[] args) {
        int arr[]={70,20,50,30,90,5,15};
        bubbleSort(arr);
        System.out.println("Sorted array is-->");
        System.out.println(Arrays.toString(arr));
    }
    
}
