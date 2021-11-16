package ISTA.week2;

public class Q14 {
    class Solution
    {
        public static long[] productExceptSelf(int nums[], int n)
        {
            long[] res = new long[n];

            long prod = 1;
            int cnt = 0;
            for(int i: nums){
                if(i != 0)
                    prod *= i;
                else cnt++;
            }

            if(cnt >= 2){
                return res;
            }

            for(int i = 0;i < n;i++){
                if(nums[i] == 0){
                    res[i] = prod;
                }
                else if(cnt == 1){
                    res[i] = 0;
                }
                else{
                    res[i] = prod/nums[i];
                }
            }
            return res;
        }
    }
}
