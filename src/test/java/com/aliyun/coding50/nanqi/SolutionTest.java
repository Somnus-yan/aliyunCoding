package com.aliyun.coding50.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int value = solution.solution(33320);
		assertEquals(191, value);
	}

	public void test02() {
		Solution solution = new Solution();
		int value = solution.solution(10000);
		assertEquals(42, value);
	}

	public void test03() {
		Solution solution = new Solution();
		int value = solution.solution(1000000000);
		assertEquals(26484, value);
	}
}