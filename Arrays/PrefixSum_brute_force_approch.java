package Arrays;

import java.util.Scanner;

public class PrefixSum_brute_force_approch {
    public static void PrefixSum(int arr[][])
    {
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;

        //travrsed row wise
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }

        //traversed column wise
        for(int j=0;j<n;j++)
        {
            for(int i=1;i<m;i++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
    }
    public static int sumOfRegion(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum=0,up=0,left=0,repeated_region=0;
        sum=arr[r2][c2];
        
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated_region=arr[r1-1][c1-1];

        int result = sum - up -left +repeated_region;
        return result;
    }
    // public static int findSumMatrix(int a[][],int r1,int c1,int r2,int c2)
    // {
    //     int sum=0;
    //     for(int i=r1;i<=r2;i++)
    //     {
    //         for(int j=c1;j<=c2;j++)
    //         {
    //             sum+=a[i][j];
    //         }
    //     }
    //     return sum;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter the number of rows:-");
        m=sc.nextInt();
        System.out.print("Enter the number of columns:-");
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("enter the elements:-");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r1,c1,r2,c2;
        System.out.print("enter value of r1-->");
        r1=sc.nextInt();
        System.out.print("enter value of c1-->");
        c1=sc.nextInt();
        System.out.print("enter value of r2-->");
        r2=sc.nextInt();
        System.out.print("enter value of c2-->");
        c2=sc.nextInt();
        //System.out.println("sum --->"+findSumMatrix(arr, r1, c1, r2, c2));
        PrefixSum(arr);
        
        System.out.println("Sum of required region is--->"+sumOfRegion(arr,r1,c1,r2,c2));
    }
    
}
