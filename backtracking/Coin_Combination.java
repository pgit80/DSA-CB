package backtracking;


/*
 ****************************************************************************
 * We are given infinite supplies of some coins of x, y and z amount, 
 * we want to find out all the ways to pick the coins to make a target amount.
 * here we are only interested in amount not the order
 * Ex- coins=[1, 2, 5] & target=10
 * all ways = 1*10, 2*5, 5*2, 5+2+2+1, 1*8+2, 1*5+5,....
 * 
 * EX- coins=[1,2], target = 3
 * ways = 111, [12, 21]-> means 12 or 21 is ok we don't want both
 * as 121 and 211, 112 are permutation of each other, but in this 
 * question we want only the combinations of coins not ordering...
 * 
 * NOTE- in this question we can be interested in finding all the ways
 * or the count of the ways possible.(Combination)
 ****************************************************************************
 */

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1, 2};
		int curr = 0;
		int target = 4;
		String ans = "";
		coinCombination(coins, target, ans, 0);
	}
	
	static void coinCombination(int[] coins, int amount, String ans, int idx){
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coins.length; i++) {
			if(coins[i]<=amount && coins[i]!=-1) {
//				amount-=coins[i];
				// here we'll keep track to send the current index to
				// run the recursion from current coin only
				coinCombination(coins, amount-coins[i], ans+coins[i], i);
//				amount+=coins[i];
				
			}
		}
	}
}
