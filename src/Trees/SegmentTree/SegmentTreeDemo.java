package Trees.SegmentTree;

public class SegmentTreeDemo {

    public SegmentTreeDemo(){

    }

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

    Node root;


    // (1) - constructing a Segment Tree :- O(n)
    public void SegmentTree(int[] arr){
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){

        // when start and end are same - (Base condition)
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        // create a node with the index you are at -
        Node node = new Node(start,end);

        // finding mid to divide the tree -
        int mid = (start+end) / 2;

        // creating left node and right node and at base condition add its value -
        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr,mid+1,end);

        // after returning from base condition sum up the value of child leaf node for parent node data -
        node.data = node.left.data + node.right.data;

        return node;

    }


    // (2) - Displaying Segment Tree :- O(n)

    public void display(){
        display(this.root);
    }

    private void display(Node node){

        if(node == null){
            return;
        }

        display(node.left);

        // the current node at which you are -
        System.out.println("Node value -> " + node.data);
        System.out.println("Node start interval -> " + node.startInterval);
        System.out.println("Node end interval -> " + node.endInterval);

        display(node.right);

    }


    // (3) - Performing Query Operation on Tree :- O(log n)

    public int query(int qsi, int qei){
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval>=qsi && node.endInterval<=qei){
            return node.data;
        }
        else if (node.startInterval>qei || node.endInterval<qsi) {
            return 0;
        }
        else {
            int leftAns = query(node.left,qsi,qei);
            int rightAns = query(node.right,qsi,qei);
            return leftAns+rightAns;
        }
    }


    // (4) - Update in Segment Tree :- O(log n)
    public int update(int index, int value){
        return update(this.root, index, value);
    }

    private int update(Node node, int index, int value){
        if(index>=node.startInterval && index<=node.endInterval){

            // base condition - leaf node
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }
            // moving to left and right child of node -
            else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns+rightAns;
            }

        }

        return node.data;

    }


}

class Main{

    public static void main(String[] args) {

        int[] arr = {3,8,7,6,-2,-8,4,9};

        SegmentTreeDemo st = new SegmentTreeDemo();
        st.SegmentTree(arr);
        st.display();
        System.out.println( );
        System.out.println("Answer of the query -> " + st.query(2,6));
        System.out.println("After Updating the value of the Updated Tree -> " + st.update(3,14));

    }

}
