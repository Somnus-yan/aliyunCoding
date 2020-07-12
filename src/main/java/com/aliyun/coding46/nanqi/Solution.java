package com.aliyun.coding46.nanqi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ：Nanqi
 * @Date ：Created in 19:07 2020/7/12
 */
public class Solution {
	public long solution(int n, long[] nums) {
		Arrays.sort(nums);
		long length = 0;

		Map<Long, Integer> flags = new HashMap();
		for (int i = n - 1; i >= 0; i--) {
			Integer flag = flags.getOrDefault(nums[i], 0);
			flags.put(nums[i], ++flag);

			if (flag < 2) {
				continue;
			}

			if (flag == 4) {
				return nums[i] * nums[i];
			}

			if (length != 0 && length != nums[i]) {
				return length * nums[i];
			}

			length = nums[i];
		}

		return 0;
	}
}
