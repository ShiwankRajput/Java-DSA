package Trees.Questions;

// https://leetcode.com/problems/path-sum/
// 112 : Path Sum -

import javax.swing.tree.TreeNode;

public class PathSum {

    boolean result = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        hasPathSumHelp(root, targetSum, 0);
        return result;
    }

    public void hasPathSumHelp(TreeNode root, int targetSum, int sum){
        if(root == null){ // if answer is found there is no need to make further recursion calls
            return;
        }

        sum = sum + root.val;

        // checks for leaf, if node is leaf then only we have result value
        if(root.left == null && root.right == null){
            if(targetSum == sum){
                result = true;
            }

            return;
        }

        hasPathSumHelp(root.left, targetSum, sum);
        hasPathSumHelp(root.right, targetSum, sum);

    }

}
