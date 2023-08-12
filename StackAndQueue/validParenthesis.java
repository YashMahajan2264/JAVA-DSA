package StackAndQueue;
import java.util.*;
//Time Complexity=O(n)
//Sapce Complexity=O(n)

public class validParenthesis {
    public static boolean isValid(String str)
    {
        char  chars[]=str.toCharArray();

        Stack<Character>obj1= new Stack<>();
        for(char ele:chars)
        {
            if(ele=='(' || ele=='{' || ele=='[')
            {
                obj1.push(ele);
                continue;
            }
            else if(obj1.isEmpty())
            {
                return false;
            }
            char top=obj1.pop();
            //there is no mapping
            if(top=='[' && ele!=']')
            {
                return false;
            }
            else if(top=='(' && ele!=')')
            {
                return false;
            }
            else if(top=='{' && ele!='}')
            {
                return false;
            }
        }
        return (obj1.empty()==true);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-->");
        String str = sc.nextLine();

        System.out.println("Is the string conatins valid parenthesis ? "+isValid(str));
    }
}
