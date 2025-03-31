package LinkedList.Doubly_LinkedList;

public class LL {

    //providing head, tail and size for linkedList
    private Node head;
    private int size;

    public LL(){
        this.size = 0;
    }


    // (INSERTION) ---->

    //insertion at begining
    public void insertFirst(int val){

        Node node = new Node(val);

        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;

        size += 1;
    }


    // (DISPLAY) ---->

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("End");
        System.out.println();
    }

    //display as reverse
    public void displayReverse() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            last = temp;
            temp = temp.next;
        }

        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("End");

    }


    //creating node
    private class Node{

        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
