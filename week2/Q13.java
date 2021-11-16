package ISTA.week2;

import java.util.Arrays;

public class Q13 {
    class Solution
    {
        //Function to find if there exists a triplet in the
        //array A[] which sums up to X.
        public static boolean find3Numbers(int nums[], int n, int X) {

            Arrays.sort(nums);

            for(int i = 0; i < n;i++){
                if(i > 0 && nums[i] == nums[i-1]) continue;
                int st = i+1,end = n-1;
                while(st < end){
                    if(nums[i]+nums[st]+nums[end] == X){
                        return true;
                    }
                    else if(nums[i]+nums[st]+nums[end] < X){
                        st++;
                    }else{
                        end--;
                    }
                }
            }
            return false;
        }
    }
}
