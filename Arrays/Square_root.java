package Arrays;
import java.util.*;
//Time Complexity=O(logn)
//Space Complexity=O(1)

public class Square_root {

    public static int squareRoot(int num)
    {
        int low=0,high=num,result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long val=mid*mid;

            if(val==num)
            {
                //Perfect square root of number
                return mid;
            }
            else if(val<num)
            {
                //Taking floor value for non perfect sqaure number
                result=mid;
                low=mid+1;   
            }
            else if(val>num)
            {
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element whose square root is to be find-->");
        int num=sc.nextInt();
        //Function calling
        int result=squareRoot(num);
        System.out.println("The square root of number is "+result);

    }
    
}
