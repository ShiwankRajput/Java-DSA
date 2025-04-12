package LinkedList.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(14);
        list.insertFirst(15);
        list.display();
        list.insertLast(20);
        list.display();

        list.insertLast(21);
        list.insertLast(19);
        list.display();
        list.insertAfter(21,90);
        list.display();

    }
}
