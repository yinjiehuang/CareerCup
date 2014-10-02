// Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
// EXAMPLE:
// Input: 3
// Output: ((())), (()()), (())(), ()(()), ()()()
//
import java.util.*;

public class GeneParen {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.6!!!");
                GeneParen gp = new GeneParen();
                ArrayList<String> list = gp.geneParen(3);
                for (String s: list) {
                        System.out.println(s);
                }
        }

        public ArrayList<String> geneParen(int count) {
                char[] str = new char[2*count];
                ArrayList<String> list = new ArrayList<String>();
                addParen(list, count, count, str, 0);
                return list;
        }

        public void addParen(ArrayList<String> list, int left, int right, char[] str, int count) {
                if (left < 0 || right < left) {
                        return;
                }
                if (left == 0 && right ==0) {
                        String s = String.copyValueOf(str);
                        list.add(s);
                } else {
                        if (left > 0 ) {
                                str[count] = '(';
                                addParen(list, left-1, right, str, count+1);
                        }

                        if (right > left) {
                                str[count] = ')';
                                addParen(list, left, right-1, str, count+1);
                        }
                }
        }
}
