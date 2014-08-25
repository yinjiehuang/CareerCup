// Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node
// Errors:
// This one is easy to handle, however, I kinda get it wrong at first sight

class Test{
        public static void main(String[] args){
                System.out.println("CareerCup 2.3!!!");
                int[] a = new int[]{3,2,1,4,5,7};
                ListNode list = new ListNode(3);
                ListNode current = list;
                for (int i = 1; i < a.length; i++){
                        current.next = new ListNode(a[i]);
                        current = current.next;
                }
                list.printList(list);
        }
}

class ListNode{
        int key;
        ListNode next;

        ListNode(int key){
                this.key = key;
                this.next = null;
        }

        public void printList(ListNode head){
                while (head != null){
                        System.out.print(head.key);
                        head = head.next;
                }
                System.out.println();
        }
}

