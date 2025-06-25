/* Problem Statement:
In a mathematics class, students are learning about matrices and their properties. 
The teacher has assigned a task to the students to calculate the sum of each row in a 3x3 matrix.
As a programmer, assist the students in calculating the sum by creating a program.

Input format :
The input consists of the elements of the 3x3 matrix.

Output format :
The output prints the sum of each row of the matrix in each line.

Refer to the sample output for the exact text and format.
Code constraints :
1 ≤ elements ≤ 1000

Sample test cases :
Input 1 :
1 2 3
4 5 6
7 8 9

Output 1 :
Sum of row 0: 6
Sum of row 1: 15
Sum of row 2: 24

Input 2 :
12 23 45
56 78 89
14 25 36

Output 2 :
Sum of row 0: 80
Sum of row 1: 223
Sum of row 2: 75 */

package Matrix;

import java.util.Scanner;

public class SumOfEachRow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3],sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=a[i][j];
            }
            System.out.println("Sum of row "+ i + ": " + sum);
            sum=0;
        }
        sc.close();
    }
}