package recursion;

public class Power {
	public static void main(String[] args) {
		int x=4;
		int n=3;
		System.out.println(pow(x,n));
	}
	static int pow(int x, int n) {
		if(n==0) return 1;
		
		int ans = pow(x, n-1);
		return x*ans;
	}
}
