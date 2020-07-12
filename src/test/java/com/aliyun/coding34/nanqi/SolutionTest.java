package com.aliyun.coding34.nanqi;

import junit.framework.TestCase;
import org.junit.Assert;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		int[][] m = new int[][]{{4, 1, 5, 3}, {3, 2, 7, 7}, {6, 5, 2, 8}, {8, 9, 4, 5}};
		int value = solution.solution(m);
		Assert.assertEquals(23, value);
	}
}