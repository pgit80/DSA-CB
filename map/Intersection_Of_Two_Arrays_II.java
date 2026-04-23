package map;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_Of_Two_Arrays_II {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> mp = new HashMap<>();

            for (int i = 0; i < nums1.length; i++) {
                mp.put(nums1[i], mp.getOrDefault(nums1[i], 0) + 1);
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < nums2.length; i++) {
                if (mp.containsKey(nums2[i]) && mp.get(nums2[i]) > 0) {
                    ans.add(nums2[i]);
                    mp.put(nums2[i], mp.get(nums2[i]) - 1);
                }
            }
            int[] res = new int[ans.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = ans.get(i);
            }
            return res;
        }
    }
}
