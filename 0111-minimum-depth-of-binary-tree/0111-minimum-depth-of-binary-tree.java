/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public int minDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }

    // 왼쪽 자식이 없다면 오른쪽으로 내려감
    if (root.left == null) {
        return minDepth(root.right) + 1;
    }

    // 오른쪽 자식이 없다면 왼쪽으로 내려감
    if (root.right == null) {
        return minDepth(root.left) + 1;
    }

    // 둘 다 있다면 더 짧은 쪽
    return Math.min(
        minDepth(root.left),
        minDepth(root.right)
    ) + 1;
}
}