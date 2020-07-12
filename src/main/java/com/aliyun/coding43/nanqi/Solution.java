package com.aliyun.coding43.nanqi;

import java.util.Arrays;

/**
 * @Author ：Nanqi
 * @Date ：Created in 18:02 2020/7/12
 */
public class Solution {
	public int solution(int a, int b, int c) {
		// 排序
		int[] nums = new int[]{a, b, c};
		Arrays.sort(nums);
		int sum = 0;
		for (int i=1; i<3; i++) {
			sum += (nums[i] - nums[i-1]);
		}
		return sum;
	}
}
