
// 876. Middle of The Linked List

package Problem_Solving;

import java.util.LinkedList;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}



public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;


//    public static void main(String[] args) {

//        LinkedList<Integer> list = new LinkedList<>();

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//       // list.add(6);
//
//        int length = list.size();
//        int middle_index = (length / 2) ;


//        if (length % 2 == 0) {
//
//
//            for (int i = middle_index; i < length; i++) {
//                System.out.println(list.get(i));
//            }
//        } else {
//            for (int i = middle_index; i < length; i++) {
//                System.out.println(list.get(i));
//            }
//        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        head.next.next.next.next.next= new ListNode(6);

        // Create an instance of Solution
        MiddleOfLinkedList solution = new MiddleOfLinkedList();

        // Get the middle node
        ListNode middle = solution.middleNode(head);

        // Print the value of the middle node
        System.out.println("The middle node value is: " + middle.val);

    }

}
