package recursion;

public class First_Occurance_in_Arr_Rec {

	public static void main(String[] args) {
		// Q. find first occurance of particular asked element in array using recursion
		// TODO Auto-generated method stub
		int[] arr = {3,2,5,7,5,6,5,15,5};
		System.out.println(firstOccurance(arr, 0, 0));
	}
	// if not found return -1;
	static int firstOccurance(int[] nums, int index, int item) {
		// agar array me mila to ye kro
		 if(nums[index]==item) return index; // positive base case
		 // agar array me nahi hi found nahi hua to ye kro
		 if(index==nums.length-1 && nums[index]!=item) return -1; // negative base case
		 // nahi mile to aage search kro
		 return firstOccurance(nums, index+1, item);
	}
}
