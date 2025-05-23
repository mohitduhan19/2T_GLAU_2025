
package T.Lec7_Lab;

public class Maximum_Path_Sum {
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
    int sum = Integer.MIN_VALUE;
    public int help(TreeNode root){
        if(root == null)return 0;

        int left = help(root.left);
        int right = help(root.right);
        int lor = Math.max(Math.max(left + root.val , right + root.val) ,root.val);
        int overall = Math.max(lor , left + right + root.val);
        sum = Math.max(sum, overall);
        return lor;
    }
    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right == null)return root.val;
        help(root);
        return sum;
    }

}
