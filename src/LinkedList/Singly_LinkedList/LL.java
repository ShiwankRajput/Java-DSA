package LinkedList.Singly_LinkedList;

public class LL {

    //providing head and tail of a linkedList
    private Node head;
    private Node tail;


    //providing linkedList size
    private int size;

    public LL(){
        this.size = 0;
    }

    // (1) INSERTION ----->

    //inserting node at first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    //insert at particular index
    public void insertAtIndex(int val, int index){

        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertFirst(val);
        }

        Node temp = head;
        for (int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size += 1;

    }

    //insert node at last
    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size += 1;
    }


    // (2) DISPLAY ---->

    //display linkedList
    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

    }


    // (3) DELETION ---->

    //delete from first
    public int deleteFirst(){

        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size -= 1;

        return val;

    }

    //delete from particular index
    public int deleteParticular(int index){

        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;

        return val;
    }

    //delete from last
    public int deleteLast(){

        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);

        int value = tail.val;
        tail = secondLast;
        tail.next = null;

        return value;
    }

    public Node get(int index){
        Node temp = head;

        for (int i=0; i<index; i++){
            temp = temp.next;
        }

        return temp;
    }


    //creating node
    private class Node{

        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

}
