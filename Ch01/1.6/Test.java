// 1.6 Given an image represented by an N x N matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
// Errors
// 1. The most important one is the upper bound of the inner loop (I thought I nailed it, but not), i made a serious mistake here.
// 2. Good news is: I designed most of the codes my self. Hoorey, keep working on like this.
// 3. Fuck there are still problems!!! Be careful with the xiabiao

class Test{
    public static void main(String[] args){
            System.out.println("Problem 1.6!!!!");
            int[][] m = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            // Print the int matrix:w
            System.out.println(m[0].length);
            RotMatrix rm = new RotMatrix();
            rm.printM(m);
            System.out.println();
            rm.rotate(m, 4);
            rm.printM(m);
    }
}

class RotMatrix{
    public void printM(int[][] m){
            int i, j;
            for (i = 0; i < 4; i++){
                    for ( j = 0; j < 4; j++){
                            System.out.print(m[i][j] + " ");
                    }
                    System.out.print('\n');
            }
    }

    public void rotate(int[][] m, int n){
         int i, j;
         for (i = 0; i < Math.floor(n/2); i++){
                 for (j = i; j < n-(i+1); j++){
                         int temp1 = m[i+j-i][n-1-i];
                         m[i+j-i][n-1-i] = m[i][i+j-i];
                         int temp2 = m[n-1-i][n-1-(i+j-i)];
                         m[n-1-i][n-1-(i+j-i)] = temp1;
                         int temp3 = m[n-1-(i+j-i)][i];
                         m[n-1-(i+j-i)][i] = temp2;
                         m[i][i+j-i] = temp3;
                 }
         }
    }
 }
