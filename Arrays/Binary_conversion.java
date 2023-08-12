package Arrays;

import java.util.Scanner;

public class Binary_conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the decimal number-->");
        int dec = sc.nextInt();
        int rem ;
        while(dec!=0)
        {
            rem=dec%2;
            dec=dec/2;
            System.out.print(rem);
        }
    }
    
}
