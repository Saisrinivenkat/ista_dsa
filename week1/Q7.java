package ISTA.week1;

public class Q7 {
    //Maximum sum such that no two elements are adjacent
    //Testcase:
    //n = 6
    //a[] = {5,5,10,100,10,5}
    //Output: 110

    class Solution
    {
        //Function to find the maximum money the thief can get.
        public int FindMaxSum(int arr[], int n)
        {
            if(arr.length == 0){
                return 0;
            }
            if(arr.length == 1){
                return arr[0];
            }

            int[] memoi = new int[arr.length];

            memoi[0] = arr[0];
            memoi[1] = arr[0]>arr[1]?arr[0]:arr[1];


            for(int i = 2; i < memoi.length;i++){
                memoi[i] = Math.max(memoi[i-1],arr[i]+memoi[i-2]);
            }

            return memoi[memoi.length-1];
        }
    }


}
