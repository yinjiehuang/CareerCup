// A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.
//
import java.util.*;

public class hopStairs {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.1!!!");
                int n = 10;
                int[] memory = new int[n+1];
                Arrays.fill(memory, -1);
                hopStairs hs = new hopStairs();
                System.out.println(hs.hop(3,memory));
                System.out.println(hs.hop(1,memory));
                System.out.println(hs.hop(2,memory));
                System.out.println(hs.hop(10,memory));
        }

        public int hop(int n, int[] memory) {
                if (n < 0) {
                        return 0;
                } else if (n == 0) {
                        return 1;
                } else if (memory[n] > -1) {
                        return memory[n];
                } else {
                        memory[n] = hop(n-1, memory) + 
                                hop(n-2, memory) +
                                hop(n-3, memory);
                        return memory[n];
                }
        }
}
