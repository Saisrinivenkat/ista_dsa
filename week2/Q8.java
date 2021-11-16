package ISTA.week2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q8 {
    public static void main(String[] args) {
        int k = 2;
        int arr[] = {12,5,787,1,23};
        int n = 5;

        System.out.println(kLargest(arr,n,k).toString());

    }
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i : arr){
            pq.offer(i);

            if(pq.size() > k){
                pq.poll();
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();


        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;
    }
}
