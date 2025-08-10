package Trees.Questions;


// https://leetcode.com/problems/symmetric-tree/
// 101 <-> Symmetric Tree :


import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()){

            TreeNode currentNode1 = queue.poll();
            TreeNode currentNode2 = queue.poll();

            if(currentNode1 == null && currentNode2 == null){
                continue;
            }

            if(currentNode1 == null || currentNode2 == null){
                return false;
            }

            if(currentNode1.val != currentNode2.val){
                return false;
            }

            queue.offer(currentNode1.left);
            queue.offer(currentNode2.right);
            queue.offer(currentNode1.right);
            queue.offer(currentNode2.left);

        }

        return true;

    }

}
