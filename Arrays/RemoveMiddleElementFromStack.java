/* Problem Statement:
Ram is working on a project where he needs to manipulate a stack of integers. 
He wants to implement a method to remove the middle element from the stack.
However, there's a catch - if the stack has an even number of elements,
He should remove the element closer to the bottom of the stack.
Write a program to help Ram achieve this task.

Input format :
The first line contains an integer v1, representing the number of elements initially present in the stack.
The second line contains v1 space-separated integers representing the elements of the stack.

Output format :
The output displays the elements of the stack after removing the middle element, separated by a space.

Refer to the sample output for the formatting specifications.
Code constraints :
1 ≤ v1 ≤ 10
1 ≤ v1 elements ≤ 100

Sample test cases :
Input 1 :
5
1 2 3 4 5

Output 1 :
5 4 2 1 

Input 2 :
6
1 2 3 4 5 6

Output 2 :
6 5 4 2 1 */

import java.util.Scanner;
public class RemoveMiddleElementFromStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[a.length-1],j=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(n%2==0){
                if(i==(n/2)-1)
                 continue;
                b[j]=a[i];
                j++;
            }
            if(n%2!=0){
                if(i==n/2)
                 continue;
                b[j]=a[i];
                j++;
            }
        }
        for(int i=b.length-1;i>=0;i--){
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}
