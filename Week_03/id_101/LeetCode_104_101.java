public class Solution {
    public int maxDepth(TreeNode root) {
        // 判断当前结点是否为空
        if (root == null) {
            // 若为空，则返回长度0
            return 0;
        } else {
            // 若不为空，则深度优先搜索

            // 先递归获取左子树的最大长度，
            int left_height = maxDepth(root.left);
            // 递归获取右子树的最大长度
            int right_height = maxDepth(root.right);

            // 返回当前左右子树中最大的长度+1，加一是为了将自己的长度也算上
            return java.lang.Math.max(left_height, right_height) + 1;
        }
    }
}