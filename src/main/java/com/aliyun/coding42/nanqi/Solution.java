package com.aliyun.coding42.nanqi;

import java.util.Arrays;

/**
 * @Author ：Nanqi
 * @Date ：Created in 16:35 2020/7/12
 */
public class Solution {
	public int solution(int n, int[] nums) {
		Arrays.sort(nums);
		for (int i=1; i<n; i++) {
			int dis = nums[i] % nums[0];
			if (dis == 0) {
				continue;
			}
			if (dis + 1 == nums[0]) {
				return 1;
			}

			nums[i] = nums[0];
			nums[0] = dis;
			i--;
		}
		return nums[0];
	}
}
