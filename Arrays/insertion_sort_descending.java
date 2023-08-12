package Arrays;
import java.util.*;

public class insertion_sort_descending {
    public static void insertion_sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]>arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,1,0};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
