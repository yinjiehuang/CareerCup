// 3.2 How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time.
// Well, at first I have very complex idea... After I read the solution, I found it is really easy.
// Besides, this is a good practice of extending existing class
// The space efficient solution is good, I did not understand at first glance...
// This is a very good example of extending existing class!!!very good example.
import java.util.*;

public class Test {
        public static void main(String[] args) {
                System.out.println("CareerCup 3.2!!!");
                int[] a = new int[]{7,4,8,1,6};
                MinStack ms = new MinStack();
                for (int i = 0; i < a.length; i++) {
                	ms.push(a[i]);
                }
                System.out.println(ms.min());
                ms.pop();
                ms.pop();
                System.out.println(ms.min());
        }
}
