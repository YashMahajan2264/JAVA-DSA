package Arrays;

import java.util.Scanner;

public class perfect_square {
    public static boolean perfect_square(int num)
    {
        int low=0;
        int high=num;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int val=mid*mid;
            if(val==num)
            {
                return true;
            }
            else if(val<num)
            {
                low=mid+1;
            }
            else if(num<mid)
            {
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-->");
        num=sc.nextInt();
        System.out.println(perfect_square(num));

    }
    
}
