package Arrays;

import java.util.Scanner;

public class last_occurence {
    public static int last_occurence(int arr[],int target)
    {
        int ret=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                ret=i;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner( System.in);
        System.out.print("Enter the size of array-->");
        n=sc.nextInt();
        System.out.println("Enter the element-->");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target;
        System.out.print("Enter the target whose last occurence is tyo be find-->");
        target=sc.nextInt();
        int result=last_occurence(arr,target);
        System.out.println(result);

    }
    
}
