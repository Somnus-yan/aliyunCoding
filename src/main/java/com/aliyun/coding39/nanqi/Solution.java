package com.aliyun.coding39.nanqi;

/**
 * @Author ：Nanqi
 * @Date ：Created in 15:43 2020/7/12
 */
public class Solution {
	public int solution(String s1, String s2) {
		int i1 = s1.length() - 1;
		int i2 = s2.length() - 1;
		while(i1 >= 0 && i2 >= 0 && s1.charAt(i1) == s2.charAt(i2)){
			i1--;
			i2--;
		}
		return i1 + 1 + i2 + 1;
	}
}
