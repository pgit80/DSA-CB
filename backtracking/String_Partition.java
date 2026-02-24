package backtracking;

/*
 ****************************************************************************
 * 
 * Given a string s, partition s in all possible ways.
 * Return all possible partitioning of s.
 * 
 * Ex- s = nitin
 * output = [[n,i,t,i,n], [n,iti,n], [nitin], ...]
 * 
 * Approach- 
 * 1. At first only focus to do the partition
 * 2. we'll have as much choices as the length of string
 ****************************************************************************
 */

public class String_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		partition(s, "");
		
	}
	static void partition(String ques, String ans) {
		// base case
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		// recursive case
		for(int i=0; i<ques.length(); i++) {
			partition(ques.substring(i+1), ans+ques.substring(0, i+1)+"|");
		}
	}
}
