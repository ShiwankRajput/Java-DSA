package Trees.Questions;

// Is path exist from root to leaf :

import javax.swing.tree.TreeNode;

/*

public class IsPathExist {

    public static void main(String[] args) {

    }

    public boolean pathExist(){

        int[] arr = {3,9,12,8};

        return pathExist(root, arr, 0);
    }

    private boolean pathExist(TreeNode node, int[] arr, int i){

        if(node == null){
            return false;
        }

        if(i >= arr.length || arr[i] != node.val){
            return false;
        }

        // checking for leaf node also while iterating over array as we have to find that path exist from root
        // to left.
        if((node.left == null && node.right == null) && i == arr.length-1){
            return true;
        }

        return pathExist(node.left, arr, i+1) || pathExist(node.right, arr, i+1);

    }

}

 */
