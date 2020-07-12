package com.aliyun.coding39.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution("dadc", "dddc");
		assertEquals(4, value);
	}
}