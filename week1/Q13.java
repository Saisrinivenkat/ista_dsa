package ISTA.week1;

public class Q13 {
    //Wave Array
    //Testcase:
    //Input:
    //n = 5
    //arr[] = {1,2,3,4,5}
    //Output: 2 1 4 3 5

    class Solution {


        // arr: input array
        // n: size of the array
        //Function to sort the array into a wave-like array.
        public static void convertToWave(int nums[], int n) {

            if (n < 2) {
                return;
            }

            int start = 0, end = 1;

            for (; end < nums.length; end += 2, start += 2) {
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
            }
        }
    }
}
