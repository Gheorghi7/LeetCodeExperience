import javax.swing.tree.TreeNode;

void main() {
    Solution sol = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println(sol.isSymmetric(root));
}


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        boolean ans=check(root.left,root.right);
        return ans;
    }
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;

        boolean a=check(root1.left,root2.right);
        boolean b=check(root1.right,root2.left);
        return a&&b;
    }
}