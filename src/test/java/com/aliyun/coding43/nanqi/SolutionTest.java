package com.aliyun.coding43.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(2, 5, 8);
		assertEquals(6, value);
	}
}