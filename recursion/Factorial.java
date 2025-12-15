package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5, 1)); // head recursion call
		System.out.println(factorial(5)); // tail recursion call
	}
	// both method name same but parameter length differ -> polymorphism
	static int factorial(int n, int ans) { // head recursion
		if(n==0) return ans;
		return factorial(n-1, n*ans);
	}
	
	static int factorial(int n) { // tail recursion
		if(n==0) return 1;
		return n*factorial(n-1);
	}
}
