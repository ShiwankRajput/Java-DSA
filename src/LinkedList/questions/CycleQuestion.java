package LinkedList.questions;

public class CycleQuestion {

    //https://leetcode.com/problems/linked-list-cycle/
    // 3 -> linked list cycle1 :

    public boolean hasCycle(ListNode head) {

        //fast and slow pointer concept
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;  //cycle is present
            }

        }

        return false; //cycle is not present

    }


    // 4 -> length of linkedList cycle :

    public int cycleLength(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        int length = 0;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                ListNode temp = slow;

                do{
                    length++;
                    temp = temp.next;
                }
                while(temp != slow);

            }
        }

        return length;

    }

}


//creating node
class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

}
