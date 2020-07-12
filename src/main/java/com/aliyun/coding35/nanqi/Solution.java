package com.aliyun.coding35.nanqi;

/**
 * @Author ：Nanqi
 * @Date ：Created in 14:38 2020/7/12
 * @link https://developer.aliyun.com/coding/35
 */
public class Solution {
	private int count;
	private int number;

	public int solution(TreeNode root) {
		count = 2;
		searchXMax(root);
		return number;
	}

	public void searchXMax (TreeNode root) {
		if (root == null || root.val < 0) {
			return;
		}

		searchXMax(root.right);
		count--;
		if (count == 0) {
			number = root.val;
			return;
		}
		searchXMax(root.left);
	}
}
