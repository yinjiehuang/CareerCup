// You are given an array of integers (both positive and negative). Find the contiguous sequence with the largest sum. Return the sum.
// EXAMPLE
// Input: 2, -8, 3, -2, 4, -10
// Output: (i.e., {3, -2, 4})
//
import java.util.*;

public class MaxSubarray {
        public static void main(String[] args) {
                System.out.println("CareerCup 17.8!!!");
                int[] A = new int[]{2, -8, 3, -2, 4, -10};
                MaxSubarray ms = new MaxSubarray();
                int[] result = ms.maxSubarray(A);
                System.out.println("Largest sum: " + result[2] + " . From " + A[result[0]] + " to " + A[result[1]] + " .");
        }

        public int[] maxSubarray(int[] A) {
                int max = Integer.MIN_VALUE;
                int endsum = Integer.MIN_VALUE;
                int endhigh=0, endlow=0;
                int[] result = new int[3];

                for (int i = 0; i < A.length; i++) {
                        endhigh = i;
                        if (endsum > 0) {
                                endsum += A[i];
                        } else {
                                endsum = A[i];
                                endlow = i;
                        }

                        if (endsum > max) {
                                max = endsum;
                                result[0] = endlow;
                                result[1] = endhigh;
                        }
                }
                result[2] = max;
                return result;
        }
}
