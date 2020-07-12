package com.aliyun.coding2.nanqi;

import junit.framework.TestCase;
import org.junit.Assert;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int[] values = solution.solution(new int[]{2, 7, 11, 15}, 9);
		Assert.assertArrayEquals(new int[]{0, 1}, values);
	}
}
