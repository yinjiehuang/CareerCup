// Write an algorithm to print all ways of arranging eight queens on an 8 X 8 chess board so that none of them share the same row, column or diagonal. In this case, "diagonal" means all diagonals, not just the two that bisect the board.
//
import java.util.*;

public class EightQueen {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.9!!!");
                EightQueen eq = new EightQueen();
                Integer[] col = new Integer[8];
                ArrayList<Integer[]> result = new ArrayList<Integer[]>();
                eq.placeQueen(0,col,result);
                for (Integer[] i: result) {
                	System.out.println(Arrays.toString(i));
                }
        }

        static int GRID = 8;

        public void placeQueen(int row, Integer[] col, ArrayList<Integer[]> result) {
                if (row == GRID) {
                        result.add(col.clone());
                } else {
                        for (int i = 0; i < GRID; i++) {
                                if (check(col,row,i)) {
                                        col[row] = i;
                                        placeQueen(row+1,col,result);
                                }
                        }
                }
        }

        public boolean check(Integer[] col, int row1, int col1) {
                for (int row2 = 0; row2 < row1; row2++) {
                        int col2 = col[row2];
                        if (col1 == col2) {
                                return false;
                        }
                        int temp1 = Math.abs(col1-col2);
                        int temp2 = row1-row2;
                        if (temp1 == temp2) {
                                return false;
                        }
                }
                return true;
        }
}
