package com.aliyun.coding41.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution("AABB");
		assertEquals(4, value);
	}
}