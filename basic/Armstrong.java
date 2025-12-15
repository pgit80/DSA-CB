package basic;
import java.util.*;


public class Armstrong {
	static int countDigits(int num) {
		
		int digits=0;
		while(num>0) {
			digits++;
			num/=10;
		}
		return digits;
	}
	
	static boolean check(int n) {
		int arm = 0; 
		int tempforcheck = n;
		int dig = countDigits(n);
		while(n>0) {
			arm+=(int)Math.pow(n%10, dig); // Math.pow gives double so convert it to int.
			n/=10;
		}
		return tempforcheck == arm;
	}
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(check(n));
		sc.close();
	}
}
