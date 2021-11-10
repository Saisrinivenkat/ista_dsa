package ISTA.week1;

public class Q10 {
    //Missing Number
    //Testcase:
    //Input: nums = [3,0,1]
    //Output: 2

    class Solution {
        public int missingNumber(int[] nums) {

            for(int i = 0;i < nums.length;){
                if(nums[i] < nums.length && i != nums[i]){
                    swap(nums,i,nums[i]);
                }else i++;
            }

            for(int i =0; i < nums.length; i++){
                if(nums[i] != i) return i;
            }

            return nums[nums.length-1]+1;
        }

        static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
