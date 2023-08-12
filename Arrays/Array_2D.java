package Arrays;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:-");
        int m=sc.nextInt();
        System.out.println("Enter the number of column:- ");
        int n= sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the element at location("+i+","+j+")-->");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }

    }
    
}
