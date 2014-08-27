// Implement a MyQueue class which implements a queue using two stacks
// Well, Use another stack to reverse the order whenever you peek or pop. A more efficient way is keep the reversed stack until it is empty.
//

import java.util.*;

public class Test {
        public static void main(String[] args){
                System.out.println("CareerCup 3.5!!!");
                int[] a = new int[]{3,4,7,1,5};
                MyQueue<Integer> mq = new MyQueue<Integer>();
                for (int i = 0; i < a.length; i++) {
                        mq.add(a[i]);
                }
                System.out.println(mq.remove());
                System.out.println(mq.remove());
        }
}
