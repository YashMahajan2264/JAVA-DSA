package Arrays;
//Time Complexity =O(n)
//Space Complexity =O(1)

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n=sc.nextInt();

        int  arr[]=new int[n];
        System.out.println("Enter the elements of array--->");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value to be serached-->");
        int target = sc.nextInt();

        //Linear search:-
        int idx=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                idx=i;
                break;
            }
        }

        if(idx==-1)
        {
            System.out.println("Target elemnt is not found");
        }
        else
        {
            System.out.println("The Target element is found at index "+idx);
        }
    }
    
}
