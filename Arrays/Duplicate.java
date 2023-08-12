package Arrays;
//Time Complexity = O(n^2)
//Space Complexity = O(1)
public class Duplicate {
    public static void main(String[] args) {
        int a[]={1,2,2,4,5,6,6,7};
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicates element is "+a[i]);
                }
            }
        }
    }
    
}
