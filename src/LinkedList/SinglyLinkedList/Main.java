package LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(17);
        list.insertFirst(8);
        list.insertLast(20);
        list.insertAtIndex(40,3);

        System.out.println("Deleted node is -> " + list.deleteFirst());
        System.out.println("Deleted node is -> " + list.deleteLast());
        System.out.println("Deleted node is -> " + list.deleteFromIndex(2));

        list.display();

        System.out.println("Get node -> " + list.find(8));

    }
}
