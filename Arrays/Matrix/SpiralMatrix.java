/* 85. Given a 2D matrix of size m × n, the task is to return all its elements in spiral order. 
Spiral order means starting from the top-left corner of the matrix, 
Move right across the first row, then down the last column, 
Then left across the bottom row, then up the first column, 
And repeat this pattern inward until all elements are visited. 
For example, for the input [[1,2,3],[4,5,6],[7,8,9]], 
The spiral order output is [1,2,3,6,9,8,7,4,5].
 */

package Matrix;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Move left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // Move top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            // Move right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            // Move bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
