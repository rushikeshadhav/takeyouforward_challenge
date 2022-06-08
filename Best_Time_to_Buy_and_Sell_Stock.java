import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int maxProfit = 0;
        for(int i = 1; i<prices.size(); i++){
            if(prices.get(i) < min){
                min = prices.get(i);
            }
            int profit = prices.get(i) - min;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}