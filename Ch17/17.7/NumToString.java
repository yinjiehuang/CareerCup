// Given any integer, print an English phrase that describes the integer (e.g., "One Thousand, Two Hundred Thirty Four").

import java.util.*;

public class NumToString {
        public static void main(String[] args) {
                System.out.println("CareerCup 17.7!!!");
                NumToString nst = new NumToString();
                System.out.println(nst.numToString(5421));
        }

        public String[] digits = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        public String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        public String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        public String[] bigs = {"", "Thousand", "Million", "Billion"};

        public String numToString(int number) {
                if (number == 0) {
                        return "Zero";
                }
                if (number < 0) {
                        return "Negative" + numToString(-1*number);
                }
                int count = 0;
                String str = "";
                while (number > 0) {
                        if (number % 1000 != 0) {
                                str = numToString100(number%1000) + bigs[count] + " " +str;
                        }
                        number = number / 1000;
                        count++;
                }
                return str;
        }

        public String numToString100(int number) {
                String str = "";

                if (number >= 100) {
                        str = str + digits[number/100-1] + " Hundred";
                        number = number % 100;
                }

                if (number > 10 && number <=19) {
                        str = str + teens[number - 11] + " ";
                        return str;
                } else if (number == 10 || number >= 20) {
                        str = str + tens[number /10 - 1] + " ";
                        number = number % 10;
                }

                if (number >= 1 & number <= 9) {
                        str = str + digits[number - 1] + " ";
                }
                return str;
        }
}
