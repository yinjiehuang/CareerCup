// CareerCup 1.3
// Given two strings, write a method to decide if one is a permutation of the other
// My thought is like: 
// First, sort the array, then compare the sorted string array.
//
import java.util.Arrays;

class isPermu{
        public static void main(String[] args) {
                System.out.println("CareerCup 1.3!!!");
                final String str1 = "jimo";
                final String str2 = "moji";
                isPermu ip = new isPermu();
                System.out.println(ip.run1(str1, str2));
                System.out.println(ip.run2(str1, str2));
        }

        // The first method use sorting to solve the problem, however, this complexity will be O(nlogn)
        public boolean run1(String str1, String str2) {
                char[] ch1 = str1.toCharArray();
                char[] ch2 = str2.toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                String s1 = new String(ch1);
                String s2 = new String(ch2);
                return s1.equals(s2);
        }

        // Let's try another way, use some memorization,the complexity can be reduced to O(n)
        public boolean run2(String str1, String str2) {
                if (str1.length() != str2.length()) {
                        return false;
                }

                char[] m = new char[256];
                for (int i s= 0; i < str1.length(); i++) {
                        int index1  = str1.charAt(i)-'a';
                        m[index1]++;
                }
                for (int j = 0; j < str2.length(); j++) {
                        int index2 = str2.charAt(j)-'a';
                        if (m[index2]-- < 0) {
                                return false;
                        }
                }
                return true;
        }
}
