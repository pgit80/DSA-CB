package backtracking;

/*
 ****************************************************************************
 * We are given infinite supplies of some coins of x, y and z amount, 
 * we want to find out all the ways to pick the coins to make a target amount.
 * Ex- coins=[1, 2, 5] & target=10
 * all ways = 1*10, 2*5, 5*2, 5+2+2+1, 1*8+2, 1*5+5,....
 * 
 * EX- coins=[1,2], target = 3
 * ways = 111, 12, 21
 * 
 * EX- coins=[1,2], target = 4
 * ways = 1111, 112, 1
 * 
 * NOTE- in this question we can be interested in finding all the ways
 * or the count of the ways possible.(Permutation)
 ****************************************************************************
 */

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1, 2};
		int curr = 0;
		int target = 3;
		String ans = "";
//		coinPermut(coins, curr, target, ans);
		coinPermutWithBacktrack(coins, target, ans);
		
	}
	
	static void coinPermut(int[] coins, int target, String ans) {
		if(target==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if(target>=coins[i]) {
				coinPermut(coins, target-coins[i], ans+coins[i]);
			}
		}
	}
	
	// ab yahi same function backtrack version me likhte hai
	static void coinPermutWithBacktrack(int[] coins, int target, String ans) {
		if(target==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coins.length; i++) {
			if(target>=coins[i]) {
				target-=coins[i]; // do the change
				coinPermut(coins, target, ans+coins[i]);
				target+=coins[i]; // undo the change
			}
		}
	}
	
	static void coinPermut(int[] coins, int curr, int target, String ans) {
		
		if(curr == target) {
			System.out.println(ans);
			return;
		}
		
		if(curr>target) {
			return;
		}
		
//		if(curr<target)// no need for this line explicit
		for(int i=0; i<coins.length; i++) {
			coinPermut(coins, curr+coins[i], target, ans+coins[i]);
		}
	}
}
