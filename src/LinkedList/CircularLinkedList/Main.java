package LinkedList.CircularLinkedList;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.display();
        list.delete(14);
        list.display();

    }
}
