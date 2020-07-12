package com.aliyun.coding37.nanqi;

/**
 * @Author ：Nanqi
 * @Date ：Created in 15:17 2020/7/12
 */
public class Solution {
	int max = 0;
	int count = 1;
	int historyCount = 1;
	int historyMax = 0;

	public int solution(int n, int[] a) {
		max = a[0];
		count = 1;
		historyCount = 1;
		historyMax = a[0];
		for (int i = 1; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
				count = 1;
				continue;
			}

			if (max == a[i]) {
				count++;
				continue;
			}

			dealMax();
		}

		dealMax();
		return historyCount;
	}

	private void dealMax() {
		if (max > historyMax) {
			historyCount = count;
			historyMax = max;
			max = 0;
			count = 0;
			return;
		}

		if (max == historyMax) {
			historyCount = historyCount > count ? historyCount : count;
			max = 0;
			count = 0;
			return;
		}

		max = 0;
		count = 0;
		return;
	}
}
