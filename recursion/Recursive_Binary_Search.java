package recursion;

public class Recursive_Binary_Search {

	/*
	 * binary search always work on sorted arrays
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,4, 5, 7, 8, 12, 16, 19, 23, 54, 65, 67, 100};
		System.out.println(recbs(arr, 0, arr.length-1, 16));
	}
	// this method will return index of target
	static int recbs(int[] nums, int low, int high, int target) {
		if(low>high) return -1;
		int mid = low+(high-low)/2;
		if(nums[mid] == target) return mid;
		else if(target < nums[mid]) return recbs(nums, low, mid-1, target);
		else return recbs(nums, mid+1, high, target);
		
	}
}
