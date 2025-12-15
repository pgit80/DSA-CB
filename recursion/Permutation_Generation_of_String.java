package recursion;

public class Permutation_Generation_of_String {

	/*
	 *************************************************************************
	 * Q. generate all permutations of a String s. 
	 * Ex- s = abc, permutations = abc, bca, bac, cba, cab, acb
	 * Approach-
	 * 1. no. of recursive calls depend on no. of characters or length of string
	 * 2. so recursion will be called over length of string
	 * NOTE- there is a problem in this approach, we'll get duplicate permutations for
	 * strings which have repeating characters in it.
	 *************************************************************************
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("bac", "");
	}

	public static void permutation(String s, String ans) {
		if(s.length()==0) {
			System.out.print(ans+ " ");
			return;
		}
		for(int i=0; i<s.length(); i++) {
			permutation(s.substring(0, i)+s.substring(i+1, s.length()), ans+s.charAt(i));
		}
	}
}
