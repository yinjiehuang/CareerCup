// Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?
// Problems: 1. I did not realize I can use hash table ... such a shame
// 2. I think the idea of second one is right, however, I need to make sure I implemented right.
//
import java.util.*;

class Test{
    public static void main(String[] args){
            System.out.println("CareerCup 2.1!!!");
            int[] a = new int[]{0,3,2,4,4,5};
            ListNode list = new ListNode(0);
            ListNode current = list;
            for (int i = 1; i < a.length; i++){
                   current.next = new ListNode(a[i]);
                   current = current.next;
            }
            list.printList();
            RemoveDup rd  = new RemoveDup();
            //rd.removedup1(list);
            //list.printList();
            rd.removedup2(list);
            list.printList();
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

class RemoveDup{
        public void removedup1(ListNode head){
                if (head == null)
                        return;

                Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
                while (head.next != null){
                        if (table.containsKey(head.next.key)){
                                head.next = head.next.next;
                        }else{
                                table.put(head.next.key,true);
                                head = head.next;
                        }
                }
        }

        public void removedup2(ListNode head){
                if (head == null)
                        return;
                ListNode current = head;
                while (current.next != null){
                        ListNode previous = current;
                        ListNode runner = current;
                        while (runner != null){
                                if (runner.key == current.key){
                                        previous.next = runner.next;
                                        runner = runner.next;
                                }else{
                                        previous = previous.next;
                                        runner = runner.next;
                                }
                        }
                        current = current.next;
                }
        }
}
