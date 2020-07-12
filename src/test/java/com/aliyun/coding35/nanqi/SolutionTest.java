package com.aliyun.coding35.nanqi;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	public void test() {
		Solution solution = new Solution();
		TreeNode treeNode = new TreeNode(20);
		treeNode.left = new TreeNode(15);
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(18);
		treeNode.right = new TreeNode(25);
		treeNode.right.left = new TreeNode(23);
		treeNode.right.right = new TreeNode(60);
		int value = solution.solution(treeNode);
		assertEquals(25, value);
	}
}