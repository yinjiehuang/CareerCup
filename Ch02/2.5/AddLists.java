// 2.5 You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
// Example
// Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295.
// Output: 2 -> 1 -> 9. That is, 912.
// FOLLOW UP
// Suppose the digits are stored in forward order. Repeat the above problem. 
// Example
//
// The first part is easy to deal with, let's write it first
// FOLLOW UP is also straightforward, I used stack, I think it is totally working, however, I don't think I will implement this...
public class AddLists {
    public static void main(String[] args) {
            System.out.println("CareerCup 2.5!!!");
            int[] a1 = new int[]{7,1,6,1};
            int[] a2 = new int[]{5,9,2,2,1};
            ListNode list1 = new ListNode(7);
            ListNode current1 = list1;
            for (int i = 1; i < a1.length; i++) {
                    current1.next = new ListNode(a1[i]);
                    current1 = current1.next;
            }
            list1.printList();
            ListNode list2 = new ListNode(5);
            ListNode current2 = list2;
            for (int j = 1; j < a2.length; j++) {
                    current2.next = new ListNode(a2[j]);
                    current2 = current2.next;
            }
            list2.printList();
            AddLists al = new AddLists();
            al.addLists(list1, list2).printList();
    }

    public ListNode addLists(ListNode p1, ListNode p2) {
            if (p1 == null || p2 == null) {
                    return null;
            }
            int value, carry = 0, temp = 0;
            ListNode p3 = null;
            ListNode p3current = null;
            while (p1 !=null || p2 !=null) {
            		temp = 0;
                    if (p1 != null) {
                            temp += p1.key;
                            p1 = p1.next;
                    }
                    if (p2 != null) {
                            temp += p2.key;
                            p2 = p2.next;
                    }
                    if (temp >=10) {
                            value = temp-10+carry;
                            carry = 1;
                    } else {
                            value = temp + carry;
                            carry = 0;
                    }
                    
                    if (p3 == null) {
                            p3 = new ListNode(value);
                            p3current = p3;
                    } else {
                            p3current.next = new ListNode(value);
                            p3current = p3current.next;
                    }
            }
            return p3;
    }
}
