package ISTA.week1;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q8 {
    //Kth smallest element
    //Testcase:
    //Input:
    //N = 6
    //arr[] = 7 10 4 3 20 15
    //K = 3
    //Output : 7
    class Solution{
        public static int kthSmallest(int[] arr, int l, int r, int k)
        {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

            for(int i : arr){
                pq.offer(i);

                if(pq.size()>k){
                    pq.poll();
                }
            }


            return pq.peek();
        }
    }

}
