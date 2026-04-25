public class PathSum {
    static void main() {
        PathSum ps = new PathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        System.out.println(ps.hasPathSum(root, 9));

    }


        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }

            if (root.left == null && root.right == null) {
                return targetSum == root.val;
            }

            boolean leftSum = hasPathSum(root.left, targetSum - root.val);
            boolean rightSum = hasPathSum(root.right, targetSum - root.val);

            return leftSum || rightSum;
        }


}
