package Trees.Questions;

import javax.swing.tree.TreeNode;

public class LowestCommonAncestor {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null){
            return null;
        }

        if(root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode leftLca = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLca = lowestCommonAncestor(root.right, p, q);

        if((leftLca != null) && (rightLca != null)){
            return root;
        }

        if(leftLca != null){
            return leftLca;
        }
        else{
            return rightLca;
        }

    }

}
