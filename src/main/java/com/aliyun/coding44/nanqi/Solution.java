package com.aliyun.coding44.nanqi;

import java.util.Arrays;

/**
 * @Author ：Nanqi
 * @Date ：Created in 18:48 2020/7/12
 */
public class Solution {
	public int solution(int n, int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += (nums[n - 1] + nums[i]) / 2;
		}
		return sum;
	}
}
