package HashMap;
import java.util.*;

//Time Complexity = O(n)
//Space Complexity = O(n) since   hashmap is created

public class Twosum {
    public static void main(String[] args) {
        System.out.println("Enter the number of element-->");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements-->");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Enter the target value
        int target;
        System.out.println("Enter the target value-->");
        target=sc.nextInt();

        //create HashMap in which we store as  [arr[i], i]
        //i.e. array value as key and index as value
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i], i);
        }

        //now creating size two arry for result
        int result[]=new int[2];

        //Now actual traversing start
        //Main logic of two sum problem
        for(int i=0;i<n;i++)
        {
            //checking that is first element is target element or not
            if(arr[i]==target && map.containsKey(0))
            {
                result[0]=i;
                result[2]=map.get(0);
            }

            //check for (target-element)
            else if(map.containsKey(target-arr[i]))
            {
                if(map.get(target-arr[i])>i)
                {
                    result[0]=arr[i];
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("The Resultant array index is ["+result[0]+" , "+result[1]+"]");
    }
    
}
