// Write a method to randomly generate a set of m integers from an array of size n. Each element must have equal probability of being chosen.
//
import java.util.*;

public class PickArray {
        public static void main(String[] args) {
                System.out.println("CareerCup 18.3!!!");
                int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
                PickArray pa = new PickArray();
                System.out.println(Arrays.toString(pa.pickArray(array, 5)));
        }

        public int[] pickArray(int[] array, int m) {
                Random rnd = new Random();
                int[] result = new int[m];
                for (int i = 0 ; i < m; i++) {
                        result[i] = array[i];
                }
                for (int i = m; i < array.length-1; i++) {
                        int index = rnd.nextInt(i+1);
                        if (index < m) {
                                result[index] = array[i];
                        }
                }
                return result;
        }
}
