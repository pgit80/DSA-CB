public class House_Robber {
    /*
     * LC- 198
     * You are a professional robber planning to rob houses along a street. Each
     * house has a certain amount of money stashed, the only constraint stopping you
     * from robbing each of them is that adjacent houses have security systems
     * connected and it will automatically contact the police if two adjacent houses
     * were broken into on the same night.
     * 
     * Given an integer array nums representing the amount of money of each house,
     * return the maximum amount of money you can rob tonight without alerting the
     * police.
     * 
     * Input: nums = [2,7,9,3,1]
     * Output: 12
     * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5
     * (money = 1).
     * Total amount you can rob = 2 + 9 + 1 = 12.
     */

    int solveR(int [] nums, int idx){
        if(idx>=nums.length) return 0;
        int chori = nums[idx]+solveR(nums, idx+2);
        int noChori =  solveR(nums, idx+1);
        return Math.max(chori, noChori);
    }

    int solveTD(int[] nums, int[] dp, int idx){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int chori = nums[idx]+solveTD(nums, dp, idx+2);
        int noChori =  solveTD(nums, dp, idx+1);
        return dp[idx]=Math.max(chori, noChori);
    }

    int solveBU(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2; i<dp.length; i++){
            int rob=nums[i]+dp[i-2];
            int dnrob=dp[i-1];
            dp[i]=Math.max(rob, dnrob);
        }
        return dp[dp.length-1];
    }
}
