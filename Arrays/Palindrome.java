package Arrays;
//Time complexity = O(n/2)=O(n)
//Space Complexity= O(1)

public class Palindrome
{
    public static void main(String[] args) {
        int[] yash ={1,2,3,3,2,1};
        int n = 6;
        int flag=0;
        for(int i=0;i<n/2;i++)
        {
            if(yash[i]!=yash[n-i-1])
            {
                flag=1;
                System.out.println("Not an plaindrome array");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Given array is an plaindrome");
        }
    }
}