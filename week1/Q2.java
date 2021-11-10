package ISTA.week1;

public class Q2 {
    //Remove Element

    //TESTCASE:
    //Input: nums = [3,2,2,3], val = 3
    //Output: 2, nums = [2,2,_,_]

    class Solution {
        public int removeElement(int[] nums, int val) {
            //Mathod 1
//         int start = 0,end = nums.length-1;

//         while(start < end){
//             while(start < end && nums[end] == val){
//                 end--;
//             }
//             if(start == end){
//                 break;
//             }
//             if(nums[start] == val){
//                 int tmp = nums[start];
//                 nums[start] = nums[end];
//                 nums[end] = tmp;
//                 end--;
//             }
//             start++;
//         }
//         if(start < nums.length && nums[start] != val)
//             return start+1;
//         return start;

            int snow = 0;

            for(int i = 0; i < nums.length;i++){
                if(nums[i] == val){
                    snow++;
                }
                else if(snow > 0){
                    int tmp = nums[i];
                    nums[i] = val;
                    nums[i-snow] = tmp;
                }
            }
            return nums.length - snow;
        }
    }
}
