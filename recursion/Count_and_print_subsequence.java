package recursion;

public class Count_and_print_subsequence {
	
	// way 1. static variable to count 
	static int noOfSubsequence = 0;
	// if there is conflict between static variable and local variable->
	// then we access static variable with class name.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = countAndPrintSubsequence("ab", "");
		System.out.println("\n"+count);
	}
	
	static int countAndPrintSubsequence(String s, String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
//			noOfSubsequence++; // way 1.
			return 1;
		}
		
		char ch = s.charAt(0);
		// not pick
		int a = countAndPrintSubsequence(s.substring(1), ans);
		// pick
		int b =countAndPrintSubsequence(s.substring(1), ans+ch);
		return a+b;
	}
}

