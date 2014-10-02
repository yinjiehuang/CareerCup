// You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order.
//
import java.util.*;

public class MergeList {
        public static void main(String[] args) {
                System.out.println("CarrerCup 11.1!!!");
                MergeList mg = new MergeList();
                int[] A = new int[]{1,4,5,7,11,13,0,0,0,0};
                int[] B = new int[]{2,3,9,12};
                mg.mergelist(A,B,6,4);
                System.out.println(Arrays.toString(A));
        }

        public void mergelist(int[] A, int[] B, int LastA, int LastB) {
                int indexA = LastA-1;
                int indexB = LastB-1;
                int Mindex = LastA+LastB-1;

                while (indexA >= 0 && indexB >= 0) {
                        if (A[indexA] <= B[indexB]) {
                                A[Mindex] = B[indexB];
                                Mindex--;
                                indexB--;
                        } else {
                                A[Mindex] = A[indexA];
                                Mindex--;
                                indexA--;
                        }
                }

                while (indexB >= 0) {
                        A[Mindex] = B[indexB];
                        Mindex--;
                        indexB--;
                }
        }
}
