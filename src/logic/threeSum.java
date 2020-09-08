package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 */
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return ls;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        // 将数字加入哈希表
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                if (map.containsKey(target - nums[j]) && map.get(target - nums[j]) > j) {
                    List<Integer> ls1 = new ArrayList<>();
                    ls1.add(nums[i]);
                    ls1.add(nums[j]);
                    ls1.add(target - nums[j]);
                    ls.add(ls1);
                }
            }
        }
        return ls;


    }
}
