package BackTracking;

import java.util.Scanner;
//Board size is 2 * n and one tile size is 2 * 1;
//calculate the total number of possible ways to board the tiles

public class TailingProblem {
    public static int Tailing(int n)
    {
        //base case
        if(n<=3)
        {
            return n;
        }
        return Tailing(n-1)+Tailing(n-2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:-");
        n=sc.nextInt();
        System.out.println("For n="+n+" Possible ways-->"+Tailing(n));

    }
}
