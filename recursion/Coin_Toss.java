package recursion;


/*
 *******************************************************
 * tell the possible outcome of toss of n coins at once
 * for 3 coins i.e. n=3
 * => HHH, HHT, HTH, THH, TTH, THT, HTT, TTT
 * FOR 2 COINS I.E. n=2
 * => HH, TT, TH, HT
 *******************************************************
 */
public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinToss(3, "");
	}
	
	static void coinToss(int n, String outcome) {
		if(n==0) {
			System.out.println(outcome+" ");
			return;
		}
		if(outcome.length()==0 || outcome.charAt(outcome.length()-1)!='H') { // this line is for avoiding printing two consecutive heads i.e. H's
			coinToss(n-1, outcome+"H");
		}
		coinToss(n-1, outcome+"T");
	}

}
