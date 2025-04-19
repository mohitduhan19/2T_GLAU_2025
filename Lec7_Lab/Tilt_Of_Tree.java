package T.Lec7_Lab;

public class Tilt_Of_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static int tilt = 0;

    public int fun(TreeNode node) {
        if (node == null)
            return 0;

        int l = fun(node.left);
        int r = fun(node.right);

        tilt += Math.abs(l - r);
        return l + r + node.val;
    }

    public int findTilt(TreeNode root) {
        tilt = 0;
        fun(root);
        return tilt;
    }
}
