package ISTA.week2;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;

        System.out.println(search(arr,key));
    }

    static int search(int A[], int key)
    {
        // Complete this function
        int p = peak(A);

        System.out.println(p);
        return 0;
//        int searchl = BS(A,0,p,key);
//        if(searchl != -1){
//            return searchl;
//        }
//        return BS(A,p+1,A.length-1,key);
    }

    static int BS(int nums[],int start,int end,int target){

        while(start <= end){
            int mid = start + (end - start)/2;

            if( nums[mid] == target){
                return mid;
            }
            else if( nums[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    static int peak(int[] nums){
        int start = 0,end = nums.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] < nums[start]){
                end = mid-1;
            }
            else if(nums[start] < nums[mid]){
                start = mid;
            }
            else{
                start++;
            }
        }
        return start;
    }
}
