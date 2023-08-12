package Arrays;
import java.util.*;
//Time Complexity =O(n^2)
//Space complexity = O(1)
//Roation about 90 deg clockwise
public class Rotation_2Darray {
    public static void rotated_matrix(int a[][])
        {
            //transpose 2d array
            for(int i=0;i<a.length;i++)
            {
                for(int j=i;j<a[0].length;j++)
                {
                    int temp = a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }

            //to interchange the left and right side column
            for(int i=0;i<a.length;i++)
            {
                int leftIndex=0;
                int rightIndex=a.length-1;
                while(leftIndex<rightIndex)
                {
                    int temp=a[i][leftIndex];
                    a[i][leftIndex]=a[i][rightIndex];
                    a[i][rightIndex]=temp;
                    leftIndex++;
                    rightIndex--;
                }

            }
            
            
        }
    public static void main(String[] args) {
        
        int[][] arr={{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
        System.out.println("Matrix before roation:-");
        for(int i=0;i<arr.length;i++)
       {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
       }
        rotated_matrix(arr);

       System.out.println("Matrix after rotaion:-");
       for(int i=0;i<arr.length;i++)
       {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
       }
    }
    
}
