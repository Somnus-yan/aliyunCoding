package com.aliyun.coding37.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(5, new int[]{6, 1, 6, 6, 0});
		assertEquals(2, value);
	}
}