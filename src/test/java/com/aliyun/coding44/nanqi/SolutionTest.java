package com.aliyun.coding44.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(5, new int[]{2, 4, 6, 8, 10});
		assertEquals(30, value);
	}
}