package com.aliyun.coding46.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		long value = solution.solution(6, new long[]{1, 1, 2, 2, 3, 3});
		assertEquals(6, value);
	}

	public void test02() {
		Solution solution = new Solution();
		long value = solution.solution(10, new long[]{3, 3, 3, 3, 4, 4, 4, 5, 5, 5});
		assertEquals(20, value);
	}
}