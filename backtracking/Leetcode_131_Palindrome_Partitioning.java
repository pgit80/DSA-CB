package backtracking;


/*
 ****************************************************************************
 * leetcode-131
 * 
 * Given a string s, partition s such that every substring of the partition is
 * a palindrome.
 * Return all possible palindrome partitioning of s.
 * 
 * Ex- s = nitin
 * output = [[n,i,t,i,n], [n,iti,n], [nitin]]
 * 
 * Approach- 
 * 1. At first only focus to do the partition
 * 2. we'll have as much choices as the length of string
 ****************************************************************************
 */

public class Leetcode_131_Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		palindrom_partition(s, "");
	}
	static void palindrom_partition(String ques, String ans) {
		// base case
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		} 
		
		// recursive case
		for(int i=0; i<ques.length(); i++) {
			String s = ques.substring(0, i+1);
			if(isPalindrome(s))
			palindrom_partition(ques.substring(i+1), ans+s+"|");
		}
	}
	static boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
