package recursion;

public class PrintN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n);
	}
	static void print(int n) {
		if(n==0) return;
		// 1 to 5
//		print(n-1);
		System.out.println(n);
		// 5 to 1
//		print(n-1);
 	}
}
