package com.aliyun.coding45.nanqi;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ：Nanqi
 * @Date ：Created in 18:54 2020/7/12
 */
public class Solution {
	public int solution(int n,int[] nums) {
		Map<Integer, Integer> flags = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int value = flags.getOrDefault(nums[i], 0).intValue();
			flags.put(nums[i], ++value);
		}

		int max = 0;
		for (Map.Entry<Integer, Integer> entry : flags.entrySet()) {
			int tmpMax = flags.getOrDefault(entry.getKey() - 1, 0)
			             + flags.getOrDefault(entry.getKey() + 1, 0)
			             + entry.getValue();
			if (tmpMax > max) {
				max = tmpMax;
			}
		}
		return max;
	}
}
