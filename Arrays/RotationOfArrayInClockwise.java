/*
Pranav wants to clockwise rotate a doubly linked list by a specified number of positions. 
He needs your help to implement a program to achieve this. 
Given a doubly linked list and an integer representing the number of positions to rotate
Write a program to rotate the list clockwise.

Input format :
The first line of input consists of an integer n, representing the number of elements in the linked list.
The second line consists of n space-separated linked list elements.
The third line consists of an integer k, representing the number of positions to rotate the list.

Output format :
The output displays the elements of the doubly linked list after rotating it by k positions.
Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, given test cases will fall under the following constraints:
1 ≤ n ≤ 30
1 ≤ elements ≤ 1000
k < n

Sample test cases :
Input 1 :
5
1 2 3 4 5
1
Output 1 :
5 1 2 3 4

Input 2 :
5
10 20 30 40 50
3
Output 2 :
30 40 50 10 20
 */

package Arrays;
import java.util.Scanner;
public class RotationOfArrayInClockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=n-k;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
