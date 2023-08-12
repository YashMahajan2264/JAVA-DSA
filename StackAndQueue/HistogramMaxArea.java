package StackAndQueue;
import java.util.*;

public class HistogramMaxArea {
    public static int maxArea(int height[], int n)
    {
        int prevSmaller[] = new int[n];
        int nextSmaller[] = new int[n];
        int width[] = new int[n];
        int Area[]=new int[n];

        //storing index of previous smaller height 
        int i=0;
        int minimum=-1;
        while(i<n)
        {
            for(int j=0;j<i;j++)
            {
                if(height[j]<height[i])
                {
                    minimum=j;
                }
            }
            if(minimum!=-1)
            {
                prevSmaller[i]=minimum;
            }
            else
            {
                prevSmaller[i]=-1;
            }
            i++;
        }
        i=0;
        for(i=0;i<n;i++)
        {
            System.out.print(prevSmaller[i]+" ");
        }
        minimum=n;
        i=0;
        while(i<n)
        {
            for(int j=i+1;j<n;j++)
            {
                if(height[j]<height[i])
                {
                    minimum=j;
                    break;
                }
            }
            if(minimum!=n)
            {
                nextSmaller[i]=minimum;
            }
            else
            {
                nextSmaller[i]=n;
            }
            i++;
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.print(nextSmaller[i]+" ");
        }
        //width
        for( i=0;i<n;i++)
        {
            width[i]=nextSmaller[i] - prevSmaller[i] - 1;
        }
        int max=-1;
        for( i=0;i<n;i++)
        {
            Area[i]=height[i]*width[i];
            if(Area[i] > max)
            {
                max=Area[i];
            }
            return max;
        }
        return -1;
        

        

    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rectangles in histogram-->");
        int n = sc.nextInt();

        int height[]=new int[n];
        System.out.println("Enter the height of each recatngle in histogram-->");
        
        for(int i=0; i<n; i++)
        {
            height[i]=sc.nextInt();
        }
        int result =  maxArea(height,n);
       // System.out.println(result);

        
    }
}
