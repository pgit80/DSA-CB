package Arrays;


public class Array_Partition {
	
	/*
	 * In this question we want to partition an array of integers putting the last element in a way such that
	 * all smaller elements than last elements are in left and greater are towards its right. The partitions need
	 * not to be sorted. 
	 * Ex1. nums=[2,34,6,8,0,7,11,9]
	 * output- [2,6,8,0,1,7,9,34,11]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,34,6,8,0,7,11,7,5};
		int idx = Partition(nums);
		System.out.println(idx);
		for(int i=0;i<nums.length; i++) System.out.println(nums[i]);
	}
	
	static int Partition(int[] nums) {
		int si = 0; // start index
		int ei=nums.length-1; // end index
		int le = nums[ei]; // last element
		int idx = 0; // correct position of last element as per question
		
		for(int i=si; i<ei ; i++) {
			if(nums[i]<=le) {
				int temp = nums[i];
				nums[i]=nums[idx];
				nums[idx]=temp;
				idx++;
			}
		}
		// now swap last element at correct postion with idx
		int temp = nums[ei];
		nums[ei]=nums[idx];
		nums[idx]=temp;
		
		return idx;
	}

}
