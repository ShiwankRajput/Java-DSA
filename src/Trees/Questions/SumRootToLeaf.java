package Trees.Questions;


// https://leetcode.com/problems/sum-root-to-leaf-numbers/
// 129 - Sum root to leaf numbers :

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*

public class SumRootToLeaf {

    public int sumNumbers(TreeNode root) {

        if(root == null){
            return 0;
        }

        List<Integer> list = new ArrayList<>();
        String str = "";

        helper(root, list, str);

        int sum = 0;
        for(int value : list){
            sum = sum + value;
        }

        return sum;

    }

    public void helper(TreeNode node, List<Integer> list, String str){

        if(node == null){
            return;
        }

        str = str + node.val;

        if(node.left == null && node.right == null){
            int ans = Integer.parseInt(str);
            list.add(ans);
        }

        helper(node.left, list, str);
        helper(node.right, list, str);

    }


    // OR : without using arrayList ->


    public int sumNumbers1(TreeNode root){

        if(root == null){
            return 0;
        }

        int result = 0;

        return helper1(root, result);

    }

    public int helper1(TreeNode node, int result){

        if(node == null){
            return 0;
        }

        result = 10*result + node.val;

        if(node.left == null && node.right == null){
            return result;
        }

        int leftTree = helper1(node.left, result);
        int rightTree = helper1(node.right, result);

        return leftTree + rightTree;

    }

}

 */
