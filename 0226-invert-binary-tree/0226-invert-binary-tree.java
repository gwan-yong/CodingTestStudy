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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 1. 왼쪽과 오른쪽 자식 노드 교환
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        
        // 2. 하위 서브트리 재귀 호출
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}