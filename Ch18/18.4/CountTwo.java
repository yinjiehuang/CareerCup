// Write a method to count the number of 2s that appear in all the numbers between 0 and n (inclusive).
// EXAMPLE
// Input: 25
// Output: 9 (2,12,20,21,22,23,24 and 25. Noe that 22 counts for two 2s.)
//
import java.util.*;

public class CountTwo {
        public static void main(String[] args) {
                System.out.println("CareerCup 18.4!!!");
                CountTwo ct = new CountTwo();
                System.out.println(ct.countTwo(25));
        }

        public int countTwoDigit(int number, int d) {
                int pow10 = (int) Math.pow(10, d);
                int nextpow10 = pow10 * 10;
                int right = number % pow10;

                int rounddown = number - number % nextpow10;
                int roundup = rounddown + nextpow10;

                int digit = (number / pow10) % 10;
                if (digit < 2) {
                        return rounddown / 10;
                } else if (digit > 2) {
                        return roundup / 10;
                } else {
                        return rounddown/10 + right + 1;
                }
        }

        public int countTwo(int number) {
                int count = 0;
                int length = String.valueOf(number).length();
                for (int i = 0; i < length; i++) {
                        count += countTwoDigit(number, i);
                }
                return count;
        }
}
