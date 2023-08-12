package DivideAndConquer;
//Time Complexity = best case = O(n)
//                = worst case = O(n^2)
//Space Complxity = O(n)
public class selectionProcedure {
    public static int partition(int arr[],int l,int h)
    {
        int pivot =arr[l];
        int i=l;
        for(int j=l+1;j<=h;j++)
        {
            if(arr[j] <= pivot)
            {
                i=i+1;
                //swap ith and jth element
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //at last finally swap  ith and pivot element so that pivot at its cprrect position
        //in an sorted array
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;

        return i;
    }
    public static int selction_Procedure(int arr[],int l,int h,int k)
    {
        //1.Divide the problem in sub problem
        int m=partition(arr, l, h);
        //relationship between index number and position number
        if(m==k-1)
        {
            return arr[m];
        }
        else if(m < k-1)
        {
            //traverse towards left side ofa array
            return selction_Procedure(arr, m+1, h, k);
        }
        else
        {
            //traverse towards the right side of array
            return selction_Procedure(arr,l,m-1,k);
        }
    }
    
    public static void main(String[] args) {
        int arr[]={50,30,70,90,10,34,89,98,13};

        int n= arr.length;
        int k = 6;

        int result= selction_Procedure(arr,0,n-1,k);
        System.out.println("The kth smallest element in an array is "+result);
    }   
    
}
