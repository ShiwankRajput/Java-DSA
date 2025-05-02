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

    //insertion using recursion at particular index :
    public void insertRecursion(int val, int index){

        head = insertAt(val,index,head);

    }

    private Node insertAt(int val, int index, Node node){

        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertAt(val, --index, node.next);

        return node;
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


    // QUESTIONS :

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
    // 1 -> remove duplicates in sorted linkedList :

    public void removeDuplicates(){

        /*

            Node temp = head;
            Node temp1 = head.next;

            while(temp1 != null){

                if(temp.value == temp1.value){
                    temp1 = temp1.next;
                    size--;
                }
                else{
                    temp.next = temp1;
                    temp = temp1;
                    temp1 = temp1.next;
                }
            }

            if(temp1 == null){
                temp.next = null;
            }

        */

                        //OR

        Node temp = head;

        while(temp.next != null){

            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
            }
        }

        // if there is no concept of tail, just remove it
        tail = temp;
        tail.next = null;

    }


    //https://leetcode.com/problems/merge-two-sorted-lists/description/
    // 2 -> merge two sorted linked list :

    public LL mergeList(LL list1, LL list2){

        Node head1 = list1.head;
        Node head2 = list2.head;

        LL ans = new LL();

        while(head1 != null && head2 != null){
            if(head1.value <= head2.value){
                ans.insertLast(head1.value);
                head1 = head1.next;
            }
            else{
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
        }

        //remaining node of list1 if any
        while(head1 != null){
            ans.insertLast(head1.value);
            head1 = head1.next;
        }

        //remaining node of list2 if any
        while(head2 != null){
            ans.insertLast(head2.value);
            head2 = head2.next;
        }

        return ans;


                        //OR (actual answer)

        /*

            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            // Traverse both lists
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            // Attach remaining nodes, if any
            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }

            return dummy.next; // Return the merged list, skipping the dummy node

        */

    }


    //https://leetcode.com/problems/middle-of-the-linked-list/description/
    // 8 ->  middle of the linked list

    public void findMiddle(){

        Node ans = helpFindMiddle(head);

        System.out.println(ans.value);

    }

    public Node helpFindMiddle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }


    // 10 - reverse of linkedList (using Recursion) :
    public void reverseLL(){

        helpReverseLL(head);

    }

    public void helpReverseLL(Node node){

        if(node == tail){
            head = tail;
            return;
        }

        helpReverseLL(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;

    }


    //https://leetcode.com/problems/reverse-linked-list/submissions/1617313110/
    // 11 - reverse Of linkedList (using iteration) :
    public void iterateRecurLL(){

        head = helpIterateRecurLL(head);

    }

    public Node helpIterateRecurLL(Node head){

        if(head == null){
            return head;
        }

        Node prev = null;
        Node pres = head;
        Node next = head.next;

        while(pres != null){

            pres.next = prev;
            prev = pres;
            pres = next;

            if(next != null){
                next = next.next;
            }

        }

        head = prev;

        return head;

    }


    // 12 - reverse LinkedList II :
    public Node reverseBetween(Node head, int left, int right) {

        if(left == right){
            return head;
        }

        //skip the first left-1 nodes
        Node prev = null;
        Node current = head;
        for (int i=0; current!=null && i<left-1; i++){
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        //reverse between left and right
        Node next = current.next;
        for (int i=0; current!=null && i<(right-left+1); i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }

        }

        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }

        newEnd.next = current;

        return head;

    }


    //https://leetcode.com/problems/palindrome-linked-list/
    // 13 - Palindrome linked list :

    public boolean isPalindrome(Node head) {

        Node mid = helpFindMiddle(head);
        Node headSecond = helpIterateRecurLL(mid);
        Node re_reverse = headSecond;
        boolean palindrome = true;

        //compare both head and headSecond value
        while(head!=null && headSecond!=null){

            if(head.value != headSecond.value){
                palindrome = false;
                break;
            }

            head = head.next;
            headSecond = headSecond.next;

        }

        helpIterateRecurLL(re_reverse);

        if(palindrome == false){
            return false;
        }

        return palindrome;

    }


    //https://leetcode.com/problems/reorder-list/
    // 14 - Reorder LinkedList :

    public void reorderList(Node head) {

        Node mid = helpFindMiddle(head);
        Node headFirst = head;
        Node headSecond = helpIterateRecurLL(mid);

        Node temp;

        while(headFirst!=null || headSecond!=null){
            temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        // condition so that cycle could not occur
        if(headFirst != null){
            headFirst.next = null;
        }

    }


    //https://leetcode.com/problems/rotate-list/
    // 17 - Rotate LinkedList :

    public Node rotateRight(Node head, int k) {

        if(k<=0 || head==null || head.next==null){
            return head;
        }

        Node last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;

        int rotations = k % length;
        int skip = length-rotations;

        Node newLast = head;
        for(int i=0; i<(length-k-1); i++){
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;

    }


    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
    // delete Middle Node of linkedList :

    public Node deleteMiddle(Node head) {

        // if a single node is present then it is only the middle. So, just remove it
        if(head==null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node newSlow = null;

        while( (fast != null) && (fast.next != null) ){

            Node temp = slow;
            slow = slow.next;
            newSlow = temp;
            fast = fast.next.next;

        }

        newSlow.next = slow.next;
        slow.next = null;

        return head;

    }


    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    // Remove Nth node from end of list

    public Node removeNthFromEnd(Node head, int n) {

        if(head==null || head.next==null){
            return null;
        }

        if(n==0){
            return head;
        }

        head = helpIterateRecurLL(head);

        Node prev = null;
        Node current = head;
        Node next = current.next;

        for(int i=0; i<(n-1); i++){
            prev = current;
            current = next;
            next = next.next;
        }

        if(prev == null){
            head = head.next;
            current.next = null;
        }else{
            prev.next = next;
            current.next = null;
        }


        head = helpIterateRecurLL(head);

        return head;

    }



    //https://leetcode.com/problems/odd-even-linked-list/
    // odd-even Linked List

    public Node oddEvenList(Node head) {

        if(head == null || head.next == null || head.next.next == null){
            return head;
        }

        Node prev = null;
        Node current = head;
        Node next = current.next;
        Node evenFirst = null;

        int i=0;

        while(current.next != null){

            if((i+1)%2 != 0){
                current.next = next.next;
                prev = current;
                current = next;
                next = next.next;
            }
            else{

                if(i == 1){
                    evenFirst = current;
                }

                current.next = next.next;
                prev = current;
                current = next;
                next = next.next;

            }

            i = i+1;

        }

        if(i%2 == 0){
            current.next = evenFirst;
            prev.next = null;
        }
        else{
            prev.next = evenFirst;
            current.next = null;
        }


        return head;

    }


}
