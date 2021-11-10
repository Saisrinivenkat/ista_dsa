package ISTA.week1;

import java.util.HashMap;
import java.util.Map;

public class Q9 {
    //Majority Element
    //Testcase
    //Input:
    //N = 3
    //A[] = {1,2,3}
    //Output:
    //-1

    class Solution
    {
        static int majorityElement(int nums[], int size)
        {
            Map<Integer,Integer> ma = new HashMap<Integer,Integer>();

            for(int i : nums){
                if(ma.containsKey(i)){
                    ma.put(i,ma.get(i)+1);
                }else{
                    ma.put(i,1);
                }
            }

            for(Integer i : ma.keySet()){
                if(ma.get(i) > size/2){
                    return i;
                }
            }
            return -1;
        }
    }
}
