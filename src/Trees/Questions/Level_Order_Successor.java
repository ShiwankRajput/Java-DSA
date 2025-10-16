package Trees.Questions;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/*

public class Level_Order_Successor {

    public static void main(String[] args) {


    }

    public TreeNode successorNode(TreeNode root, int value){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            int found = currentNode.val;

            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }

            if(found == value){
                break;
            }

        }

        return queue.peek();

    }

}

 */
