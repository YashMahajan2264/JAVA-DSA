package Arrays;
import java.util.*;

public class selection_sort_descending {
    public static void selection_sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int max=i;
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[max]<arr[j])
                {
                    max=j;
                }

            }
            if(max!=i)
            {
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
