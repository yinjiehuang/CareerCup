// A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. Given a sorted of distinct integers, write a method to find a magic index, if one exists, in array A.
// FOLLOW UP
// What if the values are not distinct?

public class MagicSearch {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.3!!!");
                int[] array = new int[]{-40,-20,-1,1,2,3,5,7,9,12,13};
                MagicSearch ms = new MagicSearch();
                System.out.println(ms.magicsearch(array, 0, array.length-1));
                int[] array2 = new int[]{-10,-5,2,2,2,3,4,7,9,12,13};
                System.out.println(ms.magicFast(array2, 0, array2.length-1));
        }

        public int magicsearch(int[] array, int start, int end) {
                if (start > end || start < 0 || end >= array.length) {
                        return -1;
                }
                int mid = (start + end) / 2;
                if (array[mid] == mid) {
                        return mid;
                } else if (array[mid] > mid){
                        return magicsearch(array, start, mid - 1);
                } else {
                        return magicsearch(array, mid + 1, end);
                }
        }

        public int magicFast(int[] array, int start, int end) {
                if (start > end || start < 0 || end >= array.length) {
                        return -1;
                }
                int midIndex = (start + end) / 2;
                int midValue = array[midIndex];

                if (midIndex == midValue) {
                        return midValue;
                }

                int leftIndex = Math.min(midIndex - 1, midValue);
                int left = magicFast(array, start, leftIndex);
                if (left >= 0) {
                        return left;
                }
                int rightIndex = Math.max(midIndex + 1, midValue);
                int right = magicFast(array, rightIndex, end);

                return right;
        }
}
