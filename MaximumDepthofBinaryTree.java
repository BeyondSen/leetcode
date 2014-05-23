package leetcode;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		return getDepth(root, 0);
	}

	public int getDepth(TreeNode root, int level) {
		if (root == null) {
			return level;
		}
		return Math.max(getDepth(root.left, level + 1),
				getDepth(root.right, level + 1));
	}
}
