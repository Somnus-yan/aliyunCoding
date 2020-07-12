package com.aliyun.coding40.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(3, new int[]{1, 2, 3});
		assertEquals(1, value);
	}
}