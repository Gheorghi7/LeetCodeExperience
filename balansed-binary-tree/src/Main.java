void main() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(3);
    System.out.println(sol.checkHeight(root));
}


class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = checkHeight(root.left);
        if (left == -1) {
            return -1;
        }
        int right = checkHeight(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}