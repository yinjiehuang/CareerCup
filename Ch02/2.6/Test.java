// Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop. 
// DEFINITION
// Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list
// EXAMPLE
// Input: A -> B -> C -> D-> E -> C [the same C as earlier]
// Output: C
//
// This problem...I have a wrong hunch and got stuck for some miniutes...Damn
// Finally, Now I understand this algorithm...So damn complicated...The code itself is not so complicated...Shoot!!!! JIMO!!!!

class Test{
        public static void main(String[] args){
                System.out.println("CareerCup 2.6!!!");
                int[] a = new int[]{1,2,3,4,5,6,7,8,9,10,12};
                ListNode list = new ListNode(1);
                ListNode current = list;
                for (int i = 1; i < a.length; i++){
                        current.next = new ListNode(a[i]);
                        current = current.next;
                }
                // Create the looped LinkedList
                ListNode temp = list;
                while (temp.key != 4)
                        temp = temp.next;
                current.next = temp;

                FindBeginning fb = new FindBeginning();
                System.out.println(fb.findBeginning(list).key);
        }
}

class ListNode{
        int key;
        ListNode next;

        ListNode(int key){
                this.key = key;
                this.next = null;
        }
}


class FindBeginning{
        public ListNode findBeginning(ListNode head){
                ListNode slow = head;
                ListNode fast = head;
                while (fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                        if (slow == fast)
                                break;
                }
                if (fast == null || fast.next == null)
                        return null;
                slow = head;
                while (slow != fast){
                        slow = slow.next;
                        fast = fast.next;
                }
                return slow;
        }
}
