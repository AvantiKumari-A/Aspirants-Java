/* What is a jagged array?
A jagged array is a two-dimensional array where each row can have a different number of columns. 
In Java, it is an array of arrays, meaning each element of the main array is itself an array, 
And those arrays can have different lengths.

How to find row and column length in a jagged array?
To find the number of rows, use array.length.
To find the number of columns in a specific row, use array[rowIndex].length.

How to provide input to a jagged array?
To provide input to a jagged array in Java:
First, create the outer array with a fixed number of rows.
Then, for each row, ask the user for the number of columns and create the inner array accordingly.
Use nested loops to read the input for each element of the inner arrays.
After input, use another nested loop to display the elements.

This allows different rows to store a different number of elements, 
Which is not possible in a regular 2D array where all rows must have the same number of columns. */

import java.util.*;
public class JaggedArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number of rows: ");
        int r=sc.nextInt();
        int[][] jagged = new int[r][]; // 
        for (int i = 0; i < r; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            jagged[i] = new int[cols];
            System.out.println("Enter " + cols + " elements for row " + i + ":");
            for (int j = 0; j < cols; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array Output:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {  // to print columns we use => a[i].length
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close(); }}
