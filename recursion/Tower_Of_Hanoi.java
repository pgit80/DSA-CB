package recursion;

public class Tower_Of_Hanoi {
	
	/*
	 *******************************************************
	 * there are n discs 
	 * there are 3 vertical rods -
	 * 1. Source 2. Helper 3. Destination
	 * Playing rules
	 * we want to move all the n discs from source to destination
	 * rod with help of helper rod.
	 * 
	 * Rules->
	 * 1. But keep in mind only smaller disc can be put over a bigger disc
	 * and this rule never violated in any rod.
	 * 2. at a time one disc can be moved from one rod to another
	 * 3. Always only disc from top can be moved.
	 * 
	 * Find total number of moves required to move all the n discs to source from destination.
	 * ex- for n=3; 
	 * solution- there will be three disc - disc1 < disc2 < disc3 { in compare to radius 
	 * 1. move disc1 from source to destination
	 * 2. move disc2 from source to helper
	 * 3. move disc1 from destination to helper
	 * 4. move disc3 from source to destination
	 * 5. move disc1 from helper to source
	 * 6. move disc2 from helper to destination
	 * 7. move disc1 from source to destination 
	 * 
	 * Mai kya soch paa rha hu (Approach)
	 * 1. start ki n-1 disc ko hme source se helper me move krna hai (destination ki help se)
	 * 2. aise hi agli n-1 disc ko helper se destination move krna hai (source ko help manke)
	 * 
	 * NOTE- TOTAL MOVES REQUIRED TO MOVE ALL DISC FROM SOURCE TO DESTINATION 
	 * IN THIS FASHION IS (2^n-1)
	 *******************************************************
	 */
	
	static int moves = 0; // global variable to count on moves

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TOH(3, "Source", "Helper", "Destination");
		System.out.println("Total moves needed: "+ moves);
	}
	static void TOH(int n, String source, String helper, String destination){
		// agar disc sari destination pe ho to kaam khatam
		if(n==0) return;
		// start ki n-1 disc ko source se helper bhejo with help of destination
		TOH(n-1, source, destination, helper); 
		System.out.println("move "+"disc " + n + " from "+ source + " to " + destination);
		moves++;
		// agli baar helper se destination move karna hai using source rod as help
		TOH(n-1, helper, source, destination);
	}
}
