package com.aliyun.coding42.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(4, new int[]{5, 13, 8, 1000000000});
		assertEquals(1, value);
	}
}