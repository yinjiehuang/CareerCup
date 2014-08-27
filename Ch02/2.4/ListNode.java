public class ListNode {
    int key;
    ListNode next;

    ListNode(int key) {
            this.key = key;
            this.next = null;
    }

    public void printList(ListNode head) {
            while (head != null) {
                    System.out.print(head.key);
                    head = head.next;
            }
            System.out.println();
    }
}
