// Write a method to sort an array of strings so that all the anagrams are next to each other
//
import java.util.*;

public class SortString {
        public static void main(String[] args) {
                System.out.println("CareerCup 11.2!!!");
                String[] array = new String[]{"jimo", "shabi", "huni", "inhu", "erbi", "moji"};
                SortString ss = new SortString();
                ss.sortString(array);
                for (String s : array) {
                        System.out.println(s);
                }
        }

        public void sortString(String[] array) {
                Hashtable<String, LinkedList<String>> ht = new Hashtable<String, LinkedList<String>>();
                for (String word : array) {
                        char[] temp = word.toCharArray();
                        Arrays.sort(temp);
                        String key = new String(temp);
                        if (!ht.containsKey(key)) {
                                ht.put(key, new LinkedList<String>());
                        }
                        ht.get(key).add(word);
                }
                int index = 0;
                for (String key : ht.keySet()) {
                        LinkedList<String> list = ht.get(key);
                        for (String ss : list) {
                                array[index] = ss;
                                index++;
                        }
                }
        }
}
