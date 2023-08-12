package BackTracking;
import java.sql.Array;
import java.util.*;
public class PrintAllSseq {
    public static void printAllSequences(int arr[],int index,ArrayList<Integer>tempArr)
    {
        //base case
        if(index == arr.length)
        {
            //print all sequences -- but do not print empty entries
            if(tempArr.size()>0)
            {
                System.out.println(tempArr);
            }
            return;
        }
        //recursive call
        printAllSequences(arr, index+1, tempArr);
        tempArr.add(arr[index]);
        //do not include
        printAllSequences(arr, index+1, tempArr);
        //remove value from tempArr 
        //Backtracking
        tempArr.remove(tempArr.size()-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println("For the array-->"+Arrays.toString(arr));

        printAllSequences(arr, 0,new ArrayList<Integer>());
    }
    
}
