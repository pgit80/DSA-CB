package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_In_Arr {
    /*
     * Leetcode 215
     * Given an integer array nums and an integer k, return the kth largest element
     * in the array.
     * 
     * Note that it is the kth largest element in the sorted order, not the kth
     * distinct element.
     * 
     * Ex-> nums = [3,2,1,5,6,4], k = 2
     * Output-> 5
     * Explanation-> nums(sorted)=[1,2,3,4,5,6], we can see here 2nd largest is 5
     */
    class Solution {
        public int findKthLargestmax(int[] nums, int k) {
            // easy solve using max heap
            // by default always java gives minHeap, we need additional methods to make it
            // maxHeap, that method is Collections.reverseOrder();
            // in java Collection
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int x: nums) pq.add(x);
            // now kth time removal will be kth largest element as per the property of max heap
            int ans=0;
            while(k-- >0){
                ans=pq.remove();
            }
            return ans;
            // this approach will take nlogn + some space

        }
        public int findKthLargestmin(int[] nums, int k){
            // this is min heap
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            // we'll create a min heap of K size and kth largest element will always be the root of the heap
            // we'll compare the next elements and keep popping and when array is empty, we'll just return
            // root of the heap
            // first create a min heap of k nodes
            for(int i=0; i<k; i++)
            {
                pq.add(nums[i]);
            }
            // now check the root of heap and compare with array element and if the element is greater from
            // current root then replace root with element
            for(int i=k; i<nums.length; i++){
                if(pq.peek()<nums[i]){ // pq.peek returns root of heap
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
            // in the end root of k node min heap is kth largest element
            return pq.remove(); // pq.remove removes top element from the heap
            // this code has complexity of nlogk
        }
    }
}
