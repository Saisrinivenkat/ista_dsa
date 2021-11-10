package ISTA.week1;

public class Q14 {

    //Move Zeroes
    //Testcase:
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]

    class Solution {
        public void moveZeroes(int[] nums) {
            int snow = 0;
            for(int end =0; end < nums.length;end++){
                if(nums[end] == 0){
                    snow++;
                }
                else if(snow > 0){
                    int tmp = nums[end];
                    nums[end] = 0;
                    nums[end-snow] = tmp;
                }
            }
        }
    }
}
