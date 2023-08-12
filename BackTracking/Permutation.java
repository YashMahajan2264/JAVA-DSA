package BackTracking;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Permutation {
    public static String swap(String str,int i,int j)
    {
        char temp;
        char charArr[]=str.toCharArray();
        temp=charArr[i];
        charArr[i]=charArr[j];
        charArr[j]=temp;

        return String.valueOf(charArr);

    }
    /* str- input string
     * l-staring index
     * r-ending index
     * 
     */
    public static void permuation(String str,int l, int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                str=swap(str, l, i);
                permuation(str, l+1, r);
                //backtraing
                str=swap(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str="XYZ";
        int n=str.length();
        permuation(str, 0, n-1);
        
    }
}
