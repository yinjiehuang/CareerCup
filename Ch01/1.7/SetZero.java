// Write an algorithm such that if an element in an M X N matrix is 0, its entire row and comumn are set to 0.
// My first idea is right, however, I think the two scan thought is useful and you need to remember this!!

public class SetZero {
    public static void main(String args[]) {
            System.out.println("CareerCup 1.7!!!!");
            final int[][] m = {
                    {1, 3, 0, 4},
                    {2, 1, 1, 2},
                    {1, 2, 1, 1}
            };
            SetZero sz = new SetZero();
            sz.printMatrix(m);
            sz.setZero(m);
            
            System.out.println();
            sz.printMatrix(m);
    }

    public void printMatrix(int[][] m) {
            int M = m.length; // row
            int N = m[0].length; // column
            for (int i = 0; i < M; i++) {
                    for (int j = 0; j < N; j++) {
                            System.out.print(m[i][j] + " ");
                    }
                    System.out.println();
            }
    }

    public void setZero(int[][] m) {
            int M = m.length;
            int N = m[0].length;
            int[] row = new int[M];
            int[] column = new int[N];
            int i,j;
            for (i = 0; i < M; i++) {
                    for (j = 0; j < N; j++) {
                            if (m[i][j] == 0) {
                                    row[i] = 1;
                                    column[j] = 1;
                            }
                    }
            }
            for (i = 0; i < M; i++) {
                    for (j = 0; j < N; j++) {
                            if (row[i] == 1 || column[j] == 1) {
                                    m[i][j] = 0;
                            }
                    }
            }
    }
}
