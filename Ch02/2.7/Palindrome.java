// 2.7 Implement a function to check if a linked list a palindrome
// I have the right idea of using the stack
//
import java.util.*;
public class Palindrome {
        public static void main(String[] args) {
                System.out.println("CareerCup 2.7!!!");
                int[] a = new int[]{1,2,0,2,1};
                ListNode list = new ListNode(1);
                ListNode current = list;
                for (int i = 1; i < a.length; i++) {
                        current.next = new ListNode(a[i]);
                        current = current.next;
                }
                Palindrome p = new Palindrome();
                System.out.println(p.isPalindrome(list));
        }

        public boolean isPalindrome(ListNode head) {
                ListNode slow = head;
                ListNode fast = head;
                Stack<Integer> s = new Stack<Integer>();

                while (fast != null && fast.next != null) {
                        s.push(slow.key);
                        slow = slow.next;
                        fast = fast.next.next;
                }

                if (fast != null) {
                        slow = slow.next;
                }

                while (!s.empty()) {
                        if (s.pop() == slow.key) {
                                slow = slow.next;
                        } else {
                                return false;
                        }
                }
                return true;
        }
}
