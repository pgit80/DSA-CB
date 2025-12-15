package recursion;

public class Unique_permutations_in_string {

	/*
	 *************************************************************************
	 * Q. generate all unique permutations of a String s. 
	 * Ex- s = abca, permutations = abca, bcaa, baca, cbaa, caba, acba, ....
	 * Approach-
	 * 1. no. of recursive calls depend on no. of characters or length of string
	 * 2. so recursion will be called over length of string
	 * NOTE- to handle repeating characters we'll call only one of the repeating character
	 * in recursive and ignore other repeating character.
	 *************************************************************************
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniquePermutation("baa", "");
	}
	
	public static void uniquePermutation(String s, String ans) {
		if(s.length()==0) {
			System.out.print(ans+ " ");
			return;
		}
		for(int i=0; i<s.length(); i++) {
			boolean flag = false;
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					flag = true;
					break;
				}
			}
			if(!flag) // only run if current charaacter is not repeating at later stage
			uniquePermutation(s.substring(0, i)+s.substring(i+1, s.length()), ans+s.charAt(i));
		}
	}
}
