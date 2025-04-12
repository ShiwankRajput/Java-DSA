package LinkedList.CircularLinkedList;

public class LL {

    private Node head;
    private Node tail;

    public LL(){
        this.head = null;
        this.tail = null;
    }

    // (1) - INSERTION :

    public void insert(int val){

        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.next = head;
            tail = node;
        }

    }

    // (2) - DISPLAY :

    public void display(){

        Node temp = head;

        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            while(temp != head);
        }

        System.out.printf("HEAD\n");

    }

    // (3) - DELETION :

    public void delete(int val){

        Node temp = head;

        if(head == null){
            return;
        }

        if(temp.value == val){
            head = temp.next;
            tail.next = head;
            return;
        }

        do{
            Node n = temp.next;

            if(n.value == val){
                System.out.println(n.value);
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;

        }while(temp != head);

    }

    private class Node{

        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
}
