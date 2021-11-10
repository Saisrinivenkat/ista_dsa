package ISTA.week1;

public class Q3 {

    // Remove Duplicates from Sorted Array
    //Testcase:
    //Input: nums = [1,1,2]
    //Output: 2, nums = [1,2,_]

    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 1;
            if(nums.length < i+1){
                return nums.length;
            }

            int start = i, end = i;

            for(;end < nums.length;end++){
                if(nums[start-i] != nums[end]){
                    nums[start++] = nums[end];
                }
            }
            return start;

        }
    }
}
