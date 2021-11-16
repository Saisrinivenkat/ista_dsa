package ISTA.week2;

public class Q3 {
    class Solution
    {
        //Function to sort the binary array.
        static void binSort(int A[], int N)
        {
            // add your code here

            //     int c1 = 0,c2 = 0;
            //   for(int i : A){
            //       if(i == 0) c1++;
            //       else c2++;
            //   }

            //   for(int i = 0; i< A.length;i++){
            //       if(c1 > 0){
            //           A[i] = 0;
            //           c1--;
            //       }
            //       else if(c2 > 0){
            //           A[i] = 1;
            //           c2--;
            //       }
            //   }
            int start = 0,end = 0;
            for(; end < A.length;end++){
                if(A[end] == 0){
                    A[end] = 1;
                    A[start++] = 0;
                }

            }

        }
    }
}
