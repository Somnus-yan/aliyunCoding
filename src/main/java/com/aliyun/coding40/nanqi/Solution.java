package com.aliyun.coding40.nanqi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ：Nanqi
 * @Date ：Created in 15:47 2020/7/12
 */
public class Solution {
	public int solution(int n, int[] nums) {
		Map<Integer, Boolean> flags = new HashMap<>();
		Map<Integer, List<Integer>> maps = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (!maps.containsKey(nums[i])) {
				maps.put(nums[i], new ArrayList<>());
			}
			maps.get(nums[i]).add(i);
		}

		for (Map.Entry<Integer, List<Integer>> entry : maps.entrySet()) {
			if (flags.containsKey(entry.getValue().get(0))) {
				continue;
			}

			for (int i = 0; i < 30; i++) {
				int dis = (1 << i) - entry.getKey();
				if (dis < 0 || !maps.containsKey(dis)) {
					continue;
				}

				if (dis == entry.getKey() && entry.getValue().size() == 1) {
					break;
				}

				entry.getValue().forEach(obj -> flags.put(obj, true));
				maps.get(dis).forEach(obj -> flags.put(obj, true));
			}
		}

		return n - flags.size();
	}
}
