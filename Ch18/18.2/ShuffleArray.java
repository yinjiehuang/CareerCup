// Write a method to shuffle a deck of cards. It must be a perfect shuffle - in other words, each of the 52! permutations of the deck has to be equally likely. Assume that you are given a random umber generator which is perfect.
//
// OK. Shit. This is Fisher-Yates Shuffle which I have encountered like 2 month ago...Damn!!
import java.util.*;

public class ShuffleArray {
        public static void main(String[] args) {
                System.out.println("CareerCup 18.2!!!");
                int[] array = new int[]{1,2,3,4,5,6,7,8,9};
                ShuffleArray sa = new ShuffleArray();
                sa.shuffleArray(array);
                System.out.println(Arrays.toString(array));
        }

        public void shuffleArray(int[] array) {
                Random rnd = new Random();
                for (int i = 0; i < array.length - 1; i++) {
                        int index = rnd.nextInt(i+1);
                        int temp = array[i];
                        array[i] = array[index];
                        array[index] = temp;
                }
        }
}
