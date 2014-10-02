// Given an M X N matrix in which each row and each column is sorted in ascending order, write a method to find an element.
//
import java.util.*;

public class SearchMatrix {
        public static void main(String[] args) {
                System.out.println("CarrerCup 11.6!!!");
                int[][] matrix = new int[][]{{15,20,40,85}, {20,35,80,95},{30,55,95,105},{40,80,100,120}};
                SearchMatrix sm = new SearchMatrix();
                System.out.println(sm.searchX(matrix, 55));
                System.out.println(sm.searchX(matrix,3));
        }

        public boolean searchX(int[][] matrix, int x) {
                int row = 0;
                int col = matrix[0].length-1;
                while (row < matrix.length && col > 0) {
                        if (matrix[row][col] == x) {
                                return true;
                        } else if (matrix[row][col] > x) {
                                col--;
                        } else {
                                row++;
                        }
                }
                return false;
        }
}
