// Implement a MyQueue class which implements a queue using two stacks
// Well, Use another stack to reverse the order whenever you peek or pop. A more efficient way is keep the reversed stack until it is empty.
//

import java.util.*;

class Test{
        public static void main(String[] args){
                System.out.println("CareerCup 3.5!!!");
                int[] a = new int[]{3,4,7,1,5};
                MyQueue<Integer> mq = new MyQueue<Integer>();
                for (int i = 0; i < a.length; i++)
                        mq.add(a[i]);
                System.out.println(mq.remove());
                System.out.println(mq.remove());
        }
}

class MyQueue<T>{
        Stack<T> olds,news;

        MyQueue(){
                olds = new Stack<T>();
                news = new Stack<T>();
        }

        public void add(T key){
                news.push(key);
        }

        public void shift(){
                if (olds.isEmpty()){
                        while(!news.isEmpty())
                                olds.push(news.pop());
                }
        }

        public T peek(){
                shift();
                return olds.peek();
        }

        public T remove(){
                shift();
                return olds.pop();
        }
}
