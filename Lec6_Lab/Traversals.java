package T.Lec6_Lab;

import java.util.ArrayList;
import java.util.List;

public class Traversals {
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

    public void postorder(TreeNode root , List<Integer> ans){
        if(root == null)return;
        postorder(root.left , ans);
        postorder(root.right , ans);
        ans.add(root.val);
    }
    public void inorder(TreeNode root , List<Integer> ans){
        if(root == null)return;
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }
    public List<Integer> postorder(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        postorder(root , ans);
        return ans;
    }
}
