package recursion;

public class Lexicographical_Number_Printing {

	/*
	 *******************************************************
	 *
	 * in lexicographic printing of numbers less than equal to 1000
	 * ex- 0, 1, 10, 100, 1000, 101, 102, 103, 104, 105, 106, ... 109, 11, 110, 111, 112...119, 
	 * 12, 120, 121, 122...129, 13, 130, .... 199, 2, 20, 200, 201, 202, .... 999
	 * Approach-
	 * when it is 0- 0->1->10->,,,->2...
	 *******************************************************
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLexCount(0, 1000);
	}
	static void printLexCount(int curr, int n) {
		if(curr>n) return;
		// print current value i.e 0
		System.out.println(curr);
		// use a loop to call recursion with updated curr
		// for 0 there will be 9 recursive calls otherwise 10 recursive calls
		int i=0;
		if(curr == 0) i=1;
		for(; i<=9; i++) {
			printLexCount(curr*10+i, n);
		}
	}

}

