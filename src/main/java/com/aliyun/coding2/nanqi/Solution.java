package com.aliyun.coding2.nanqi;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ：Nanqi
 * @Date ：Created in 13:48 2020/7/12
 * @link https://developer.aliyun.com/coding/2
 */
public class Solution {
	public int[] solution(int[] nums, int target) {
		int length = nums.length;
		Map<Integer, Integer> los = new HashMap<>();

		for(int i=0; i<length; i++) {
			int a = nums[i];
			if (los.containsKey(target - a)) {
				return new int[]{los.get(target - a), i};
			}

			los.put(a, i);
		}

		return null;
	}
}
