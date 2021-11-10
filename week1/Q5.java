package ISTA.week1;

import java.util.HashMap;
import java.util.Map;

public class Q5 {

    //Two Sum
    //Testcase:
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]

    class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer,Integer> has = new HashMap<Integer,Integer>();

            for(int i = 0;i < nums.length;i++){
                if(has.containsKey(target-nums[i])){
                    return new int[]{i,has.get(target-nums[i])};
                }
                has.put(nums[i],i);
            }
            return new int[]{-1,-1};
//         Arrays.sort(nums);
//         int start = 0,end = nums.length-1;
//         while(start < end){
//             int sum = nums[start]+nums[end];

//             if(sum == target) return new int[]{start,end};
//             else if(sum > target){
//                 end--;
//             }else{
//                 start++;
//             }
//         }
//         return new int[]{-1,-1};
        }
    }
}
