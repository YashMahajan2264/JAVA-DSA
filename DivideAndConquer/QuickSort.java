package DivideAndConquer;
//worst case = O(n^2)
//best case = O(nlogn)
public class QuickSort {
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
    public static void quicksort(int arr[],int l,int h)
    {
        if(l < h)
        {
            //dividing part
            int m = partition(arr,l,h);

            //recursive calls
            quicksort(arr, l, m-1);
            quicksort(arr, m+1, h);
        }
    }
    public static void printArr(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={90,40,50,14,70,34,56,74,60};

        int n= arr.length;
        System.out.println("Array before sorting is :- ");
        printArr(arr,n);
        //calling quicksort
        quicksort(arr,0,n-1);

        System.out.println("Array after sorting is :- ");
        printArr(arr,n);
    }
    
}
