package ISTA.week2;

import java.util.Arrays;
import java.util.TreeMap;

public class Q9 {
    class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
    class Solution {
        public pair[] allPairs( long nums1[], long nums2[], long N, long M, long X) {
            // Your code goes here
            Arrays.sort(nums2);

            TreeMap<Long,Long> arr = new TreeMap<Long,Long>();

            for(long i : nums1){
                Long ele = BS(nums2,X-i);
                if(ele != null){
                    arr.put(i,ele);
                }
            }
            pair[] res = new pair[arr.size()];

            int j = 0;
            for(long i : arr.keySet()){
                res[j] = new pair(i,arr.get(i));
                j++;
            }
            return res;
        }

        Long BS(long[] nums,long target){
            int st = 0,end = nums.length-1;

            while(st <= end){
                int mid = st + (end - st)/2;

                if(nums[mid] == target){
                    return target;
                }
                else if(target > nums[mid]){
                    st= mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            return null;
        }
    }
}
