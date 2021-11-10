package ISTA.week1;

public class Q6 {

    // Maximum Subarray
    //Testcase:
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6

    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = 0, maxSum = Integer.MIN_VALUE;

            for(int i : nums){
                sum = Math.max(sum+i,i);
                maxSum = Math.max(sum,maxSum);
            }
            return maxSum;
        }
    }
}
