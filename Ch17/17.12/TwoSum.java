// Design an algorithm to find all pairs of integers within an array which sum to a specified value.
//
import java.util.*;

public class TwoSum {
        public static void main(String[] args) {
                System.out.println("CareerCup 17.12");
                int[] array = new int[]{5,7,3,2,1,4};
    	        int sum = 5;
    	        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
    	        for (int i = 0; i < array.length; i++) {
    		        int temp = sum - array[i];
    		        if (ht.containsKey(temp)) {
    			        int index2 = ht.get(temp);
    			        if (i > index2) {
    				        System.out.println("Index: " + index2 + " and Index: " + i);
    			        } else {
    				        System.out.println("Index: " + i + " and Index: " + index2);
    			        }
    		        } else {
    			        ht.put(array[i], i);
    		        }
    	        }
        }
}
