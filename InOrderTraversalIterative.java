/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		
		if (root == null) {
			return list;
		}
		
		Stack<TreeNode> stack = new Stack<>();

		TreeNode node = root;
		
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
		
		while (!stack.isEmpty()) {
			node = stack.pop();
			list.add(node.val);
			if (node.right != null) {
				node = node.right;
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
		return list;
	}
}