package Trees.AVL_Tree;

public class AvlTree{

    private Node root = null;

    class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.val = value;
            this.height = 1;
        }
    }

    /*

        INSERTING ELEMENT :-

    */
    public Node insert(int value){
        root = insert(value, root);
        return root;
    }

    public Node insert(int value, Node root){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value < root.val){
            Node newNode = insert(value, root.left);
            root.left = newNode;
        }
        else if(value > root.val){
            Node newNode = insert(value, root.right);
            root.right = newNode;
        }
        else{
            return root;  // no duplicate will store in tree
        }

        root.height = Math.max(height(root.left), height(root.right)) +1;

        int balance = checkBalance(root);

        // LL case
        if(balance>1 && value<root.left.val){
            root = rightRotation(root);
        }
        // LR case
        else if(balance>1 && value>root.left.val){
            root.left = leftRotation(root.left);
            root = rightRotation(root);
        }
        // RR case
        else if(balance<-1 && value>root.right.val){
            root = leftRotation(root);
        }
        // RL case
        else if(balance<-1 && value<root.right.val){
            root.right = rightRotation(root.right);
            root = leftRotation(root);
        }

        return root;
    }

    /*

        SEARCHING ELEMENT :-

    */
    public boolean searchElement(int value){
        return searchElement(root, value);
    }

    public boolean searchElement(Node root, int value){
        if(root == null){
            return false;
        }

        if(value < root.val){
            return searchElement(root.left, value);
        }
        else if(value > root.val){
            return searchElement(root.right, value);
        }
        else{
            return true;
        }
    }

    /*

        DELETE NODE :-

    */
    public void delete(int value){
        root = delete(root, value);
    }

    public Node delete(Node root, int value){

        if(root == null){
            return null;
        }

        if(value < root.val){
            root.left = delete(root.left, value);
        }
        else if(value > root.val){
            root.right = delete(root.right, value);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }

            Node minValueNode = findMinValue(root.right);
            root.val = minValueNode.val;
            root.right = delete(root.right, minValueNode.val);
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = checkBalance(root);

        // LL case
        if(balance>1 && checkBalance(root.left)>=0){
            root = rightRotation(root);
        }
        // LR case
        else if(balance>1 && checkBalance(root.left)<0){
            root.left = leftRotation(root.left);
            root = rightRotation(root);
        }
        // RR case
        else if(balance<-1 && checkBalance(root.right)<=0){
            root = leftRotation(root);
        }
        // RL case
        else if(balance<-1 && checkBalance(root.right)>0){
            root.right = rightRotation(root.right);
            root = leftRotation(root);
        }

        return root;

    }

    // Find Minimum value in right subtree to replace value of root
    public Node findMinValue(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }

    // Left Rotation :-
    public Node leftRotation(Node root){
        Node child = root.right;
        Node leftChild = child.left;

        child.left = root;
        root.right = leftChild;

        // update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;

        return child;
    }

    // Right Rotation :
    public Node rightRotation(Node root){
        Node child = root.left;
        Node rightChild = child.right;

        child.right = root;
        root.left = rightChild;

        // updata height
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;

        return child;
    }

    // Calculate Balance :
    public int checkBalance(Node node){
        if(node == null){
            return 0;
        }

        return height(node.left) - height(node.right);
    }

    // Calculate height :
    public int height(Node node){
        if(node == null){
            return 0;
        }

        return node.height;
    }

    // Display :
    public void prettyDisplay() {
        prettyDisplay(root, 0);
        System.out.println();
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|---->" + node.val);
        }
        else {
            System.out.println(node.val);
        }

        prettyDisplay(node.left, level + 1);
    }
}

class Main{

    public static void main(String[] args){

        AvlTree tree = new AvlTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(10);
        tree.insert(0);
        tree.insert(-10);
        tree.insert(55);
        tree.insert(75);
        tree.insert(90);
        tree.insert(25);
        tree.insert(15);

        tree.prettyDisplay();

        tree.delete(50);

        tree.prettyDisplay();

        System.out.println("Element Found ? - " + tree.searchElement(100));

    }

}

