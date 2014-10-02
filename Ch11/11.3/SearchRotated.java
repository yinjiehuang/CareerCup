// Given a sorted array of n integers that has been rotated an unknown number of times, write code to find an element in the array. You may assume that the array was originally sorted in increasing order. 
// EXAMPLE
// Input: find 5 in {15,16,19,20,25,1,3,4,5,7,10,14}
// Output: 8 (the index of 5 in the array)
//
import java.util.*;

public class SearchRotated {
        public static void main(String[] args) {
                System.out.println("CareerCup 11.3!!!");
                SearchRotated sr = new SearchRotated();
                int[] array = new int[]{15,16,19,20,25,1,3,4,5,7,10,14};
                System.out.println(sr.searchX(array, 0, array.length-1, 5));
        }

        public int searchX(int[] array,int left, int right, int x) {
                int mid = (left + right)/2;
                if (array[mid] == x) {
                        return mid;
                }
                if (left > right) {
                        return -1;
                }
                if (array[left] < array[mid]) {
                        if (x >= array[left] && x <= array[mid]) {
                                return searchX(array, left, mid - 1, x);
                        } else {
                                return searchX(array, mid + 1, right, x);
                        }
                } else if (array[mid] < array[left]) {
                        if (x >= array[mid] && x <= array[right]) {
                                return searchX(array, mid + 1, right, x);
                        } else {
                                return searchX(array, left, mid - 1, x);
                        }
                } else if (array[mid] == array[left]) {
                        if (array[mid] != array[right]) {
                                return searchX(array, mid + 1, right, x);
                        } else {
                                int result = searchX(array, left, mid - 1, x);
                                if (result == -1) {
                                        return searchX(array, mid + 1, right, x);
                                } else {
                                        return result;
                                }
                        }
                }
                return -1;
        }
}
