package recursion;

public class Print_All_Subsequence {
	public static void main(String[] args) {
		printSubsequence("abcd", "");
	}
	// print all subsequence of given string
	// abc-> "", a, ab, ac, abc, b, bc, c
	// abcd-> "", a, ab, ac, ad, abc, abd, acd, abcd, b, bc, bd, bcd, c, cd, d
	// NOTE:- blank string ("") is a subsequence as well substring of every string
	// choose or not choose approach
	static void printSubsequence(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		
		char ch = s.charAt(0);
		// not pick
		printSubsequence(s.substring(1), ans);
		// pick
		printSubsequence(s.substring(1), ans+ch);
	}
}
