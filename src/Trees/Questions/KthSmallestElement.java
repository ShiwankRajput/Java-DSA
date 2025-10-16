package Trees.Questions;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// 230 -> Kth Smallest Element in Binary Tree :


import javax.swing.tree.TreeNode;

/*

public class KthSmallestElement {

    public static void main(String[] args) {

    }

    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        kthSmallestHelper(root, k);
        return result;
    }

    private void kthSmallestHelper(TreeNode node, int k) {
        if (node == null) return;

        kthSmallestHelper(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        kthSmallestHelper(node.right, k);
    }

}

 */
