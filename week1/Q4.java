package ISTA.week1;

public class Q4 {
    //Remove Duplicates from Sorted Array II
    //Testcase:
    //Input: nums = [0,0,1,1,1,1,2,3,3]
    //Output: 7, nums = [0,0,1,1,2,3,3,_,_]

    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 2;

            if(nums.length < i+1){
                return nums.length;
            }
            int start =i, end = i;

            for(;end < nums.length;end++){
                if(nums[start-i] != nums[end]){
                    nums[start++] = nums[end];
                }
            }
            return start;
        }
    }
}
