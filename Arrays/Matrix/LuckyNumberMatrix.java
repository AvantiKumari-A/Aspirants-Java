/* Problem Statement
An astrologer gives a matrix to Devilliers and tells him to add the largest row sum and largest column sum of the given matrix.
The number which appears as a result is his lucky number for the final match jersey.
Write a program that adds up the largest row sum and the largest column sum from an N-rows × M-columns array of numbers to help Devilliers find his lucky number for the final match jersey.
As a preliminary phrase, you should reformat the sequence of numbers as a matrix, whose number of rows and columns are to be specified as arguments.

Example 1:
Input:
2
2
1 2
5 6
Output:
19

Explanation:
Largest row sum: 5 + 6 = 11
Largest column sum: 2 + 6 = 8
Total = 11 + 8 = 19

Example 2:
Input:
4
4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Output:
26

Explanation:
Largest row sum = 4 + 4 + 4 + 4 = 16
Largest column sum = 1 + 2 + 3 + 4 = 10
Total = 16 + 10 = 26

Input format:
The first line consists of an integer for row dimension of the array as R.
The second line consists of an integer for column dimension of the array as C.
The next R lines consist of the integers, representing the matrix elements.

Output format:
The output displays the largest row sum and the largest column sum from an N-rows × M-columns array of numbers.

Code constraints:
1 ≤ R, C ≤ 10
1 ≤ matrix_elements ≤ 100

Sample Test Cases:
Input 1:
2
2
1 2
5 6
Output 1:
19

Input 2:
4
4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Output 2:
26 */

package Matrix;
import java.util.Scanner;
public class LuckyNumberMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int maxrow=0,maxcol=0;
        for(int i=0;i<r;i++){
            int rowsum=0;
            for(int j=0;j<c;j++){
                rowsum+=m[i][j];
            }
            if(rowsum>maxrow)
             maxrow=rowsum;
        }
        for(int j=0;j<c;j++){
            int colsum=0;
            for(int i=0;i<r;i++){
                colsum+=m[i][j];
            }
            if(colsum>maxcol)
             maxcol=colsum;
        }
        System.out.println(maxrow+maxcol);
        sc.close();
    }
}
