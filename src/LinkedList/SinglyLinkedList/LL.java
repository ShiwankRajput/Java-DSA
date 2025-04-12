package LinkedList.SinglyLinkedList;

public class LL {

    //providing head and tail of a linkedList
    private Node head;
    private Node tail;

    //providing linkedList size
    private int size;

    public LL(){
        this.size = 0;
    }

    // (1) INSERTION -->

    //insertion at beginning :
    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size+=1;
    }

    //insertion at particularIndex :
    public void insertAtIndex(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size+=1;

    }

    //insertion at last :
    public void insertLast(int val){

        //using concept of tail --> TC : O(1)

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size+=1;


        //if there is no concept of using tail --> TC : O(n)

        /*

        Node temp = head;
        while (temp != null){
            temp = temp.next;
            if(temp == null){
                Node node = new Node(val);
                tail.next = node;
                tail = node;
            }
        }

        size+=1;

        */


    }

    // (2) DISPLAY -->

    // this is to display LinkedList
    public void display(){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.printf("END\n");
    }


    // (3) DELETION -->

    //deletion from beginning :
    public int deleteFirst(){

        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size -= 1;

        return val;

    }

    //delete from particular index :
    public int deleteFromIndex(int index){

        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = getNode(index-1);

        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;

    }

    //delete from last :
    public int deleteLast(){

        if(size <= 1){
            deleteFirst();
        }

        Node secondLast = getNode(size-2);

        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;

    }

    //this helps in getting the index to which we can insert or delete a node
    public Node getNode(int index){

        Node temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }

        return temp;

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

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
