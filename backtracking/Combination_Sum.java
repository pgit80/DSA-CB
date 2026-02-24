package backtracking;

import java.util.*;

/*
 ****************************************************************************
 * leetcode-39
 * 
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen 
 * numbers sum to target. You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen
 * numbers is different.
 ****************************************************************************
 */

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 10;
		List<List<Integer>> ans = new ArrayList<>();
        List<Integer> an = new ArrayList<>();
        combinationSum(candidates, target, an, ans, 0);
        System.out.println(ans);
	}
	static void combinationSum(int[] candidates, int target, List<Integer> an, List<List<Integer>> ans, int idx){
        if(target==0){
            ans.add(new ArrayList<Integer>(an)); // create new list and copy the data from 
            // old list and then add to ans
            return;
        }
        for(int i=idx; i<candidates.length; i++){
            if(candidates[i]<=target){
                an.add(candidates[i]); // do operation
                combinationSum(candidates, target-candidates[i], an, ans, i);
                an.remove(an.size()-1); // undo operation- backtrack
            }
        }
    }
}
