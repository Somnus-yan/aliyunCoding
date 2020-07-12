package com.aliyun.coding50.nanqi;

import java.util.*;

/**
 * @Author ：Nanqi
 * @Date ：Created in 19:29 2020/7/12
 */
public class Solution {
	public int solution(int n) {
		Map<Integer, List<Integer>> maps = new HashMap();
		List<Integer> initList = new ArrayList<>();
		initList.add(1);
		initList.add(2);
		initList.add(3);
		maps.put(1, initList);

		int count = 1;
		while (count < Math.log10(n)) {
			List<Integer> beforeValue = maps.getOrDefault(count, new ArrayList());
			List<Integer> mapValues = new ArrayList<>();
			for (int i = 0; i < beforeValue.size(); i++) {
				for (int j = 1; j <= 3; j++) {
					if (beforeValue.get(i) * 10 + j > n) {
						break;
					}
					mapValues.add(beforeValue.get(i) * 10 + j);
				}
			}

			count++;
			maps.put(count, mapValues);
		}
		for (Map.Entry<Integer, List<Integer>> entry : maps.entrySet()) {
			List<Integer> values = entry.getValue();
			for (int i = 0; i < values.size(); i++) {
				String valueString = values.get(i).toString();
				if (valueString.indexOf('1') == -1
				    || valueString.indexOf('2') == -1
				    || valueString.indexOf('3') == -1) {
					values.remove(i);
					i--;
				}
			}
		}

		count = (int) Math.log10(n);
		int backValue = 0;
		for (int i = 3; i <= count + 1; i++) {
			backValue += maps.getOrDefault(i, new ArrayList<>()).size();
		}
		return backValue;
	}
}
