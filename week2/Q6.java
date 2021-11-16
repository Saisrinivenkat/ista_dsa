package ISTA.week2;

public class Q6 {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxprofit = 0,min = Integer.MAX_VALUE;//This is because to take first as min value;
            for(int i : prices){
                min = Math.min(i,min);
                maxprofit = Math.max(maxprofit,i-min);
            }
            return maxprofit;
        }
    }
}
