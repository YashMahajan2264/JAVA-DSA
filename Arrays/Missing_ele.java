package Arrays;
//Time complexity =O(n)
//Space Complexity =O(1)

public class Missing_ele {
    public static void main(String[] args) {
        int a[]={1,4,3,5,6,7,8};
        int n = a.length;
        //we take n+1 sums since one ele is missing
        int sum_natural_num= ((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int missing_num= sum_natural_num-sum;

        System.out.println("Missing number in an array is "+missing_num);

    }
    
}
