package Trees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
// 637 - Average of levels in Binary Tree

/*


public class Average_Of_Levels {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            double avg = 0;

            int listSize = queue.size();

            for (int i = 0; i < listSize; i++) {
                TreeNode currentNode = queue.poll();
                avg += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            avg = avg / listSize;

            result.add(avg);

        }

        return result;

    }

}

 */
