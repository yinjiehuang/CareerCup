// Write a program to sort a stack in ascending order (with biggest items on top). You may use at most one additional stack to hold items, but you may not copy the elements into any other data structure (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
//

import java.util.*;
class Test {
        public static void main(String[] args) {
                System.out.println("CareerCup 3.6!!!");
                final int[] a = new int[]{4,5,7,1};
                Stack<Integer> s1 = new Stack<Integer>();
                for (int i = 0; i < a.length; i++) {
                        s1.push(a[i]);
                }
                Test t = new Test();
                Stack<Integer> s2 = t.sort(s1);
                while ( !s2.isEmpty()) {
                        System.out.print(s2.pop());
                }
                System.out.println();
        }

        public Stack<Integer> sort(Stack<Integer> s1) {
                Stack<Integer> s2 = new Stack<Integer>();
                while (!s1.isEmpty()) {
                        int temp = s1.pop();
                        while ( !s2.isEmpty() && s2.peek() > temp) {
                                s1.push(s2.pop());
                        }
                        s2.push(temp);
                }
                return s2;
        }
}
