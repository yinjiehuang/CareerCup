// Numbers are randomly generated and passed to a method. Write a program to find and maintain the median value as new values are generated.
//
// Didn't think about the heap at all, I though one way using BST.

import java.util.*;

public class GetMedian {
        public static void main(String[] args) {
                System.out.println("CareerCup 18.9!!!");
                GetMedian gm = new GetMedian();
                int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
                for (int i : array) {
                        gm.addNumber(i);
                        System.out.println(gm.getMedian());
                }
        }

        public PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(100);
        public PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(100, Collections.reverseOrder());

        public void addNumber(int number) {
                if (minHeap.size() == maxHeap.size()) {
                        if (minHeap.peek() != null && minHeap.peek() < number) {
                                maxHeap.offer(minHeap.poll());
                                minHeap.offer(number);
                        } else {
                                maxHeap.offer(number);
                        }
                } else {
                        if (maxHeap.peek() > number) {
                                minHeap.offer(maxHeap.poll());
                                maxHeap.offer(number);
                        } else {
                                minHeap.offer(number);
                        }
                }
        }

        public double getMedian() {
                if (maxHeap.size() == 0) {
                        return 0;
                }
                if (maxHeap.size() == minHeap.size()) {
                        return ((double) maxHeap.peek() + (double) minHeap.peek())/2;
                } else {
                        return maxHeap.peek();
                }
        }
}
