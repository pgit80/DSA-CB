package recursion;

public class Parentheses_Game {

	/*
	 *************************************************************************
	 * LEETCODE-22
	 * given n pair of () parentheses generate all the well formed pairs of these
	 * ex- for n=1 output - ()
	 * ex- for n = 2 output - (()), ()()
	 * ex- for n=3 output- ()()(), ((())), ()(()), (())(), (()())
	 * NOTE- All the pairs have balanced parentheses
	 * Approach- 
	 * the length of output string will be 2*n -> n- for opening & n- for closing
	 *************************************************************************
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentheseGame(3, 0, 0, "");
	}
	static void parentheseGame(int n, int open, int close, String ans) {
		if(open == n &&  close==n) {
			System.out.print(ans +", ");
			return;
		}
		// n opening (
		if(open<n)
		parentheseGame(n, open+1, close, ans+"(");
		// n closing )
		if(close<open) // first bracket will never be ( 
		parentheseGame(n, open, close+1, ans+")");
	}

}
