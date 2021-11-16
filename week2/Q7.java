package ISTA.week2;

import java.util.TreeSet;

public class Q7 {
    class Solution {
        boolean checkTriplet(int[] arr, int n) {
            // code here
            TreeSet<Integer> ar = new TreeSet<Integer>();

            for(int i : arr){
                ar.add(i*i);
            }

            for(int i = 0;i< arr.length;i++){
                for(int j = 1;j<arr.length;j++){
                    if(i != j){
                        int a = arr[i],b = arr[j];
                        if( ar.contains( a*a + b*b ) ){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
