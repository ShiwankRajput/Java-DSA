package LinkedList.DoublyLinkedList;

public class LL {

    //providing head for the Doubly linked list
    private Node head;

    // (1) - INSERTION :

    //insert at beginning ->
    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        if(head != null){
            head.prev = node;
        }
        node.prev = null;
        head = node;

    }

    //insert after a certain value :
    public void insertAfter(int after, int val){

        Node p = find(after);

        if(p == null){
            System.out.println("After Value does not exist");
            return;
        }

        Node node = new Node(val);

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

                    //OR

        // solution after creating node ->

        /*

        if(p.next == null){
            p.next = node;
            node.prev = p;
            node.next = null;
            return;
        }

        p.next.prev = node;
        node.next = p.next;
        p.next = node;
        node.prev = p;

        */

    }

    //insert at last ->
    public void insertLast(int val){

        if (head == null){
            insertFirst(val);
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        Node node = new Node(val);
        last.next = node;
        node.prev = last;
        node.next = null;

    }

    // (2) - DISPLAY :

    //display in the order in which element are inserted ->
    public void display(){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.printf("END\n");
    }

    //display in reverse order ->
    public void displayRev(){

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }

        System.out.print("END");

    }

    // this is use to get a node if value is present in LinkedList
    public Node find(int value){

        Node temp = head;

        while (temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }

        return null;

    }

    private class Node{

        int value;
        Node next;
        Node prev;

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
