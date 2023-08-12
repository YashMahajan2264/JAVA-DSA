package HashMap;
import java.util.*;

//Time Complexity =  O(n)
//Space Complexity =  O(n)

public class firstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-->");
        String str = sc.nextLine();

        //creating hashmap in which key as character and value as frequency of charcter
        HashMap<Character,Integer>map=new HashMap<>();

        //storing the charcter
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            //if it is first occurence
            else
            {
                map.put(str.charAt(i), 1);
            }
        }

        //checking for occurence
        int result=-1;
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                result=1;
                System.out.println("The First occurence element index is  "+i);
                break;
            }
        }


        if(result==-1)
        {
            System.out.println("No singel occurence element is found");
        }
    } 
}
