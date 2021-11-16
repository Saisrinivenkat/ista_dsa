package ISTA.week2;

public class Q4 {
    class Solution
    {
        public static void sort012(int a[], int n)
        {
            // code here
            int c1 = 0,c2 =0,c3 = 0;

            for(int i : a){
                if( i == 0){
                    c1++;
                }
                else if(i == 1 ){
                    c2++;
                }
                else{
                    c3++;
                }
            }

            for(int i = 0; i< a.length;i++){
                if(c1 > 0 ){
                    a[i] = 0;
                    c1--;
                }
                else if(c2 > 0){
                    a[i] = 1;
                    c2--;
                }
                else{
                    a[i] = 2;
                    c3--;
                }
            }
        }
    }
}
