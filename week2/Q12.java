package ISTA.week2;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        Solution tes1 = new Solution();
        int arr[] = {5 ,7 ,9 ,22 ,15 ,344 ,92, 8};
        int n = arr.length;
        long x = 46;
        System.out.println(tes1.isProduct(arr,n,x));
    }
    static class Solution {
        boolean isProduct(int[] arr, int n, long x) {
            Arrays.sort(arr);

            for(int i = 0;i<n;i++){
                if(arr[i] == 0) continue;
                if( x%arr[i] == 0 && BS(arr,x/arr[i],i+1,n-1)){
                    return true;
                }
            }
            return false;
        }
        boolean BS(int[] nums,long target,int st,int end){

            while(st <= end){
                int mid = st + (end - st)/2;

                if(nums[mid] == target){
                    return true;
                }
                else if(target > nums[mid]){
                    st= mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            return false;
        }
    }
}
