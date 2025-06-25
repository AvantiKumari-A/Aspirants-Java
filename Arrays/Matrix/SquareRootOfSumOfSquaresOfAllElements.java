/* Problem Statement:
Meera just started her engineering degree, and she is learning engineering mathematics. 
She was given an assignment to solve and present in the classroom. 
The question is to find the square root of the sum of the squares of all the elements in a matrix. 
Help her solve the problem.

Input format :
The input consists of two space-separated integers n and m, representing the dimensions of the matrix.
The next n lines, each containing m space-separated integers, represent the elements of the matrix.

Output format :
The output prints a double value
Representing the square root of the sum of the squares of all the elements in the matrix
Rounded off to two decimal places.

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ n, m ≤ 10
1 ≤ elements ≤ 50

Sample test cases :
Input 1 :
3 3
1 2 3
4 5 6
7 8 9

Output 1 :
16.88

Input 2 :
2 2
9 8
6 5

Output 2 :
14.35 */

package Matrix;
import java.util.*;
public class SquareRootOfSumOfSquaresOfAllElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        double sum=0;
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=a[i][j]*a[i][j];
            }
        }
        double res=Math.sqrt(sum);
        System.out.printf("%.2f",res);
        sc.close();
    }
}
