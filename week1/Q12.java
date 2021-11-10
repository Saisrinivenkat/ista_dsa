package ISTA.week1;

public class Q12 {
    // Find Pivot Index
    //Testcase:
    //Input: nums = [1,7,3,6,5,6]
    //Output: 3

    class Solution {
        public int pivotIndex(int[] nums) {
            int lsum = 0, rsum = 0;

            for(int i : nums){
                rsum += i;
            }

            for(int i =0 ; i < nums.length;i++){
                rsum -= nums[i];
                if(rsum == lsum){
                    return i;
                }
                lsum += nums[i];
            }
            return -1;
        }
    }
}
