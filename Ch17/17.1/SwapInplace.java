// Write a function to swap a number in place(that is, without temporary variables).
//
import java.util.*;

public class SwapInplace {
        public static void main(String[] args) {
                System.out.println("CareerCup 17.1!!!");
                SwapInplace si = new SwapInplace();
                si.swap(4,5);
        } 

        public static void swap(int x, int y) {
                x = x + y;
                y = x - y;
                x = x - y;

                System.out.println("x = "+x);
                System.out.println("y = "+y);
        }
}
