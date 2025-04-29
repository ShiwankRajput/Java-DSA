package LinkedList.questions;

public class CycleQuestion {

    public static void main(String[] args) {

        CycleQuestion obj = new CycleQuestion();

        System.out.println(obj.isHappy(2));

    }

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

                return length;

            }
        }

        return 0; //no cycle present

    }


    // 6 - LinkedList cycle II
    public ListNode detectCycle(ListNode head){

        ListNode f = head;
        ListNode s = head;

        int length = cycleLength(head);

        if(length == 0){
            return null;
        }

        while(length != 0){
            s = s.next;
            length = length-1;
        }

        while(f != s){
            f = f.next;
            s = s.next;
        }

        return f;
    }


    //https://leetcode.com/problems/happy-number/description/
    // 7 -> Happy number

    public boolean isHappy(int n){

        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }
        while(slow != fast);

        if(slow == 1){
            return true; // n is happy number
        }

        return false;  // n is not happy number

    }

    public int findSquare(int n){

        int ans = 0;

        while(n != 0){
            int rem = n%10;
            ans = ans + (rem*rem);
            n = n/10;
        }

        return ans;

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
