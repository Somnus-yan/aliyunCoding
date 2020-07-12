package com.aliyun.coding41.nanqi;

/**
 * @Author ：Nanqi
 * @Date ：Created in 16:26 2020/7/12
 */
public class Solution {
	public int solution(String str) {
		int aLength = str.replaceAll("A", "").length();
		int bLength = str.replaceAll("B", "").length();
		if (aLength > bLength) {
			return bLength * 2;
		}
		return aLength * 2;
	}
}
