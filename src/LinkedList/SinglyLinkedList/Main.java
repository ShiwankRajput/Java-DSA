package LinkedList.SinglyLinkedList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(17);
//        list.insertFirst(8);
//        list.insertLast(20);
//        list.insertAtIndex(40,3);
//
//        System.out.println("Deleted node is -> " + list.deleteFirst());
//        System.out.println("Deleted node is -> " + list.deleteLast());
//        System.out.println("Deleted node is -> " + list.deleteFromIndex(2));
//
//        list.display();
//
//        System.out.println("Get node -> " + list.find(8));
//
//        list.insertRecursion(48,2);
//        list.display();

//        list.insertLast(1);
//        list.insertLast(3);
//        list.insertLast(5);
//        list.insertLast(1);
//
//        list.display();
//        list.removeDuplicates();
//        list.display();

        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        LL list2 = new LL();

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

        LL ans = list.mergeList(list1,list2);
        ans.display();

    }
}
