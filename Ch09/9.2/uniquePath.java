// Imagine a robot sitting on the upper left corner of an X by Y grid. The robot can only move in two directions: right and down. How many possible paths are there for the robot to go from (0,0) to (X,Y)?
// FOLLOW UP
// Imagine certain spots are "off limits", such that the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to the bottom right.

import java.util.*;

public class uniquePath {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.2!!!");
                uniquePath up = new uniquePath();
                System.out.println(up.run(3,4));
        }

        public int run(int m, int n) {
                if (m < 0 || n < 0) {
                        return -1;
                }
                if (m == 0 || n == 0) {
                        return 1;
                }
                int[][] memory = new int[m][n];
                int i, j;
                for (i = 0; i < m; i++) {
                        memory[i][0] = 1;
                }
                for (j = 0; j < n; j++) {
                        memory[0][j] = 1;
                }
                for (i = 1; i < m; i++) {
                        for (j = 1; j < n; j++) {
                                memory[i][j] = memory[i-1][j] + memory[i][j-1];
                        }
                }
                return memory[m-1][n-1];
        }
}
