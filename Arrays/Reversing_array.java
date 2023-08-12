package Arrays;
//Time Complexity = O(n)
//Space complexity = O(1)

public class Reversing_array {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int n =a.length;
        //Swapping arrays elemnts
        for(int i=0;i<n/2;i++)
        {
            int temp = a[i];
            a[i]=a[n-i-1];
            a[n-i-1] =temp;
        }
        System.out.println("Reversed Array is :-");
        for(int j =0; j<n ;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
    
}
