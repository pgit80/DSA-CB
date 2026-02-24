package backtracking;

import java.util.*;

/*
 ****************************************************************************
 * leetcode-77
 * 
 * Given two integers n and k, return all possible combinations of 
 * k numbers chosen from the range [1, n].
 * You may return the answer in any order.
 * 
 * Ex- n=4, k=2
 * Output- [1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
 * Explanation: There are 4 choose 2 = 6 total combinations.
 * Note that combinations are unordered, i.e., [1,2] and [2,1] 
 * are considered to be the same combination.
 ****************************************************************************
 */

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// t- to keep track of size==k or not
	static void solve(int n, int k, int t, List<Integer> an, List<List<Integer>> ans, int idx){
	      // base case
	        if(t==k){
	            ans.add(new ArrayList<Integer>(an));
	            t=0;
	            return;
	        }
	        // loop through 1 to n and call recursively
	        for(int i=idx; i<=n; i++){
	            an.add(i);// do
	            solve(n, k, t+1, an, ans, i+1);
	            an.remove(an.size()-1); // undo- backtrack
	        }
	    }
}
