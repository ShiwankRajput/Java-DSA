package Trees.Questions;

import java.util.*;
import javax.swing.tree.TreeNode;

// http://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/1723884385/
// 107 - Binary Tree Level Order traversal II

public class LevelOrderTraversal_II {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new LinkedList();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            List<Integer> currentLevel = new ArrayList(levelSize);

            for(int i=0; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }

            }

            result.add(currentLevel);  // OR use, result.add(0, currentLevel) and then return result irrespective
                                       // of using reverse on result.

        }

        Collections.reverse(result);

        return result;

    }


}
