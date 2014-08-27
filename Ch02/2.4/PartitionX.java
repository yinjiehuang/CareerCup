// Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
public class PartitionX {
    public static void main(String[] args) {
            System.out.println("CareerCup 2.4!!!");
            int[] a = new int[]{3,4,6,7,8,1};
            ListNode list = new ListNode(3);
            ListNode current = list;
            for (int i = 1; i < a.length; i++) {
                    current.next = new ListNode(a[i]);
                    current = current.next;
            }
            list.printList(list);
            PartitionX px = new PartitionX();
            ListNode p = px.partitionX(list, 6);
            p.printList(p);
    }

    public ListNode partitionX(ListNode head, int k) {
            ListNode p1 = null;
            ListNode p1current = null;
            ListNode p2 = null;
            ListNode p2current = null;
            while (head != null) {
                    ListNode temp = new ListNode(head.key);
                    if (temp.key <= k) {
                            if (p1 == null) {
                                    p1 = temp; 
                                    p1current = p1;
                            } else {
                                    p1current.next = temp;
                                    p1current = p1current.next;
                            }
                    } else {
                            if (p2 == null) {
                                    p2 = temp;
                                    p2current = p2;
                            } else {
                                    p2current.next = temp;
                                    p2current = p2current.next;
                            }
                    }
                    head = head.next;
            }
            if (p1 == null) {
                    return p2;
            }
            p1current.next = p2;
            return p1;
    }
}
