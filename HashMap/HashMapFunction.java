package HashMap;
import java.util.*;
import java.io.*;

public class HashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        //put() function
        map.put(1, "YASH");
        map.put(2, "MANAS");
        map.put(4,"PRANAV");
        map.put(9, "CHAITANYA");

        System.out.println("HashMap of given Data is-->"+map);

        //get() function

        String result=map.get(2);
        System.out.println("The value of given key is "+result);

        //remove() function
        map.remove(1);
        System.out.println("The updated HashMap is-->"+map);

        //conatinsKey() function
        System.out.println("Checking of whether key present or not:- "+map.containsKey(1));

        //iteration using for loop
        //enterySet() function
        for(Map.Entry<Integer,String>ele:map.entrySet())
        {
            System.out.println(ele.getKey()+" : "+ele.getValue());
        }
    }
}
