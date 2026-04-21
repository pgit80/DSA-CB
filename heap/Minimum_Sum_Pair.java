package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_Sum_Pair {
    /*
     * Consider we have given Array of elements a1, a2, a3, a4. at every step, we
     * merge two-element.
     * let say a1 + a2 =a12
     * now the remaining elements would be a12, a3, a4 and we can again merge the
     * two-element a3+a4=a34 .
     * now the remaining elements would be a12, a34 .
     * finally, we will add the last two elements to get an a1234.
     * your task is to find the minimum sum of all the pairs getting added.
     * 
     * Ex- [1,2,3,4]
     * Op- 19
     * explanation- 1+2=3 -> [3,3,4]-> 3+3=6 -> [6,4]-> 6+4=10->[10] now stop when
     * array length is 1 and return
     * sum of all pairs-> 3+6+10=19
     */
    public static int minimumSumPair(int[] arr){
        // create a min heap to merge the pairs
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // build priority queue
        for(int x:arr)pq.add(x);
        int ans=0;
        while(pq.size()!=1){
            int a=pq.remove();
            int b=pq.remove();
            ans+=a+b;
            pq.add(a+b);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(
        minimumSumPair(arr));
        sc.close();
    }
}
