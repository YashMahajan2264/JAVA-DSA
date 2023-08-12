package GreedyAlgorithm;
import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
public class FractionalKnapsack {
    //function to get maximum value
    private static double getmaxValue(ItemValue arr[], int capacity)
    {
        //sort the given data on the basis of profit/weight ratio

        Arrays.sort(arr,new Comparator<ItemValue>(){
            @Override
            public int compare(ItemValue itm1, ItemValue itm2)
            {
                double cpr1 = Double.valueOf((double)itm1.profit/(double)itm1.weight);
                double cpr2 = Double.valueOf((double)itm2.profit/(double)itm2.weight);

                if(cpr1 < cpr2)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        });
        double totalvalue=0;
        //now calculating the maxium weight on the basis of p/w by traversing sorted data
        for(ItemValue i : arr)
        {
            int curWeight =(int)i.weight;
            int curProfit =(int)i.profit;

            if(capacity - curWeight >= 0)
            {
                capacity= capacity - curWeight;
                totalvalue+=curProfit;
            }
            else
            {
                //Hole item is not acceptable then only its accepted fractional part is added
                double fraction= ((double)(capacity)/(double)curWeight);

                capacity = (int)(capacity -(fraction * curWeight));
                totalvalue +=(fraction * curProfit);

            }
        }
        return totalvalue;
    }
    static class ItemValue
    {
        int profit , weight;

        public ItemValue(int profit , int weight)
        {
            this.weight=weight;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        ItemValue[] arr={
            new ItemValue(25,5),
            new ItemValue(75, 10),
            new ItemValue(100, 12),
            new ItemValue(50, 4),
            new ItemValue(45, 7),
            new ItemValue(90, 9),
            new ItemValue(30, 3)
        };
        int capacity = 37;
        //function calling
        double result =  getmaxValue(arr,capacity);
        //printing result
        System.out.println("The Maximum profit is "+ result);
    }
}
