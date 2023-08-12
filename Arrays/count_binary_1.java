package Arrays;

public class count_binary_1 {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1};
        int  n=arr.length;
        int count=0;
        for(int i=0;i<n/2;i++)
        {
            if(arr[i]==1)
            count++;
            if(arr[n-i-1]==1)
            count++;
        }
        System.out.println(count);
    }
    
}
