// Implement an algorithm to find the kth to last element of a singly linked list
// Errors:
// 1. I have misunderstood the problem....shit
// This problem I don't think I need to implement it...
class Test{
    public static void main(String[] args){
            System.out.println("CareerCup 2.2!!!");
            int[] a = new int[]{0,1,4,3,5,7,8};
            ListNode list = new ListNode(0);
            ListNode current = list;
            for (int i = 1; i < a.length; i++){
                    current.next = new ListNode(a[i]);
                    current = current.next;
            }
            list.printList();
            NToLast ntl = new NToLast();
            ntl.nToLast(list,3).printList();

    }
}

class ListNode{
    int key;
    ListNode next;

    ListNode(int key){
            this.key = key;
            this.next = null;
    }

    public void printList(){
            ListNode head = this;
            while (head != null){
                    System.out.print(head.key);
                    head = head.next;
            }
            System.out.println();
    }
}

class NToLast{
    public ListNode nToLast(ListNode head, int k){
            if (head == null)
                    return null;
            ListNode p1 = head;
            ListNode p2 = head;
            for (int i=0; i < k ; i++ ){
                    if (p2 ==  null)
                            return null;
                    p2 = p2.next;
            }
            if (p2 == null)
                    return head;

            while (p2 != null){
                    p1 = p1.next;
                    p2 = p2.next;
            }
            return p1;
    }
}
