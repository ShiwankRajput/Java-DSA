package LinkedList.Doubly_LinkedList;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(11);
        list.insertFirst(13);
        list.insertFirst(10);

        list.display();
        list.displayReverse();

    }

}
