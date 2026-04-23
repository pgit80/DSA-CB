package map;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashMap<Integer, Boolean> mp = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                // this condition stores the part of sequence
                if (mp.containsKey(nums[i] - 1)) {
                    mp.put(nums[i], false);

                }
                // this line stores start of the sequence
                else {
                    mp.put(nums[i], true);
                }
                if (mp.containsKey(nums[i] + 1)) {
                    mp.put(nums[i] + 1, false);
                }
            }
            // here we are finding the start of the sequence and counting till it is present
            int ans = 0;
            for (int k : mp.keySet()) {
                if (mp.get(k)) { // if true
                    int c = 0;
                    while (mp.containsKey(k)) {
                        c++;
                        k++;
                    }
                    ans = Math.max(ans, c);
                }
            }
            return ans;
        }
    }
}
