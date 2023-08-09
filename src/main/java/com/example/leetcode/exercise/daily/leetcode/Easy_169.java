package com.example.leetcode.exercise.daily.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1：
 *
 * 输入：nums = [3,2,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 * 提示：
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 *
 * Related Topics
 * 数组
 * 哈希表
 * 分治
 * 计数
 * 排序
 *
 * 👍 1880
 * 👎 0
 */
public class Easy_169 {
    public int majorityElement(int[] nums) {
        int limit = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.getOrDefault(nums[i], 0);
            count++;
            map.put(nums[i], count);
            if (count > limit) {
                return nums[i];
            }
        }
        return 0;
    }
}
