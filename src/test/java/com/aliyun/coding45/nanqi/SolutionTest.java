package com.aliyun.coding45.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(8, new int[]{3, 2, 1, 5, 3, 4, 9, 5});
		assertEquals(5, value);
	}
}