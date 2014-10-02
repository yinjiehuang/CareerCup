// You have a large text file containing words. Given any two words, find the shortest distance (in terms of number of words) between them in the file. If the operation will be repeated many times for the same file (but different pairs of words), can you optimize your solution?
//
// Well, at least the idea of the hash table is right anyway...
import java.util.*;

public class ShortWords {
        public static void main(String[] args) {
                System.out.println("CareerCup 18.5!!!");
                String[] words = new String[]{"jimo", "hehe", "shabi", "2b", "cao", "nima", "nitama"};
                ShortWords sw = new ShortWords();
                System.out.println(sw.shortWords(words, "nima", "hehe"));
        }

        public int shortWords(String[] words, String word1, String word2) {
                int min = Integer.MAX_VALUE;
                int lastWord1 = -1;
                int lastWord2 = -1;
                for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(word1)) {
                                lastWord1 = i;
                                int dis = lastWord1 - lastWord2;
                                if (lastWord2 >= 0 && dis < min) {
                                        min = dis;
                                }
                        } else if (words[i].equals(word2)) {
                                lastWord2 = i;
                                int dis = lastWord1 - lastWord2;
                                if (lastWord1 >= 0 && dis < min) {
                                        min = dis;
                                }
                        }
                }
                return min;
        }
}
