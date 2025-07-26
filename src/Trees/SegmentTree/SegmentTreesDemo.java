package Trees.SegmentTree;

public class SegmentTreesDemo {

    private static class Node{

        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    private Node root;

    public SegmentTreesDemo(int[] arr){
        this.root = constructTree(arr,0,arr.length-1);
    }

    // (1) - Constructing tree :
    private Node constructTree(int[] arr, int start, int end){

        // for leaf node start and end index will be same : base condition
        if (start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        // create new node with the index you are at
        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;

        return node;

    }


    // (2) - Display Tree :
    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }


    // (3) - query interval :
    public int query(int qsi, int qei){
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        // case 1: node interval is inside query interval
        if(node.startInterval >= qsi && node.endInterval <= qei){
            return node.data;
        }
        //case 2: node index is completely outside node index
        else if (node.startInterval>qei || node.endInterval<qsi){
            return 0;
        }
        // case 3: overlapping
        else{
            return query(node.left,qsi,qei) + query(node.right,qsi,qei);
        }
    }


    // (4) - update at index :
    public void update(int index, int value){
        root.data = update(this.root, index, value);
    }

    private int update(Node node,int index, int value){

        // check if index lie between the range
        if(index >= node.startInterval && index <= node.endInterval){

            // base condition
            if (index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }
            else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        // if index is not within the range
        return node.data;

    }



}

class Main{

    public static void main(String[] args) {

        int[] arr = {3,8,6,7,-2,-8,4,9};

        SegmentTreesDemo std = new SegmentTreesDemo(arr);
        std.display();
        System.out.println(std.query(1,6));
        std.update(1,6);
        System.out.println(std.query(0,7));

    }

}
