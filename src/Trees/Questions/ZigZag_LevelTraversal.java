package Trees.Questions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import javax.swing.tree.TreeNode;

public class ZigZag_LevelTraversal {

    public static void main(String[] args) {



    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        boolean rev = false;

        if(root == null){
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        while (!deque.isEmpty()){

            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i=0; i<levelSize; i++){

                if(rev == false){
                    TreeNode currentNode = deque.pollFirst();
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null){
                        deque.offerLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        deque.offerLast(currentNode.right);
                    }
                }
                else{
                    TreeNode currentNode = deque.pollLast();
                    currentLevel.add(currentNode.val);

                    if(currentNode.right != null){
                        deque.offerFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        deque.offerFirst(currentNode.left);
                    }
                }

            }

            rev = !rev;
            result.add(currentLevel);

        }

        return result;

    }

}
