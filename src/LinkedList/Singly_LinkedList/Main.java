package LinkedList.Singly_LinkedList;

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

        list.display();
    }
}
