package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(0));
	}
	// fibonacci series is 0 1 1 2 3 5 8 13 21 34 55 ...
	// fibonacci index  == 1 2 3 4 5 6 7 8  9  10 11 ...
	// fibonacci series is sum of last two terms
	static int fibonacci (int n) {
		if(n==1 || n==0) return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
