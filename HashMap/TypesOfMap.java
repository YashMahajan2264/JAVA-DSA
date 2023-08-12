package HashMap;
import java.util.*;

public class TypesOfMap {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(4,"yash");
        map.put(2,"shivam");
        map.put(9,"manas");
        map.put(1, "ram");

        //unoredred output
        System.out.println("HashMap map class output is--> "+map);

        LinkedHashMap<Integer,String>map1=new LinkedHashMap<>();
        map1.put(4,"yash");
        map1.put(2,"shivam");
        map1.put(9,"manas");
        map1.put(1, "ram");
        //ordered of insertion is preserved
        System.out.println("LinkedHashMap class map output is--> "+map1);

        TreeMap<Integer,String>map2=new TreeMap<>();
        map2.put(4,"yash");
        map2.put(2,"shivam");
        map2.put(9,"manas");
        map2.put(1, "ram");
        map2.put(10, "vikas");
        //sorted output
        System.out.println("Treemap class map output is-->"+map2);


    }
}
