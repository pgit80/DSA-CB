package recursion;

public class Last_Occurance_in_Arr_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,5,7,5,6,5,15,5};
		System.out.println(lastOccurance(arr, arr.length-1, 50));
	}
	// if not found return -1;
		static int lastOccurance(int[] nums, int index, int item) {
			// agar array me mila to ye kro
			 if(nums[index]==item) return index; // positive base case
			 // agar array me nahi hi found nahi hua to ye kro
			 if(index==0 && nums[index]!=item) return -1; // negative base case
			 // nahi mile to aage search kro
			 return lastOccurance(nums, index-1, item);
		}
}
