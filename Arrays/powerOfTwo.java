package Arrays;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int two=2;
        boolean bl =false;
        while(two<=n)
        {
            two=two*2;
            if(two==n)
            {
                bl=true;
                break;
            }
        }
        if(bl==true)
        {
            System.out.println(bl);
        }
        else
        {
            System.out.println(bl);
        }
    }
}
