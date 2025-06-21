/*
Tom is a software developer working on a project where he has to check if a doubly linked list is a palindrome. 
He needs to write a program to solve this problem. 
Write a program to help Tom check if a given doubly linked list is a palindrome or not.

Input format :
The first line consists of an integer N, representing the number of elements in the linked list.
The second line consists of N space-separated integers representing the linked list elements.

Output format :
The first line of output displays the elements of the doubly linked list in forward order, separated by spaces.
The second line of output displays the elements of the doubly linked list in reverse order, separated by spaces.
The third line prints:
"The doubly linked list is a palindrome" if the list reads the same forward and backward.
"The doubly linked list is not a palindrome" if the list does not match when reversed.
Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:
2 ≤ N ≤ 20
-100 ≤ elements ≤ 100

Sample test cases :
Input 1 :
5
1 2 3 2 1
Output 1 :
1 2 3 2 1
1 2 3 2 1
The doubly linked list is a palindrome

Input 2 :
5
1 2 3 4 5
Output 2 :
1 2 3 4 5
5 4 3 2 1
The doubly linked list is not a palindrome

Input 3 :
6
-1 -2 -3 -3 -2 -1
Output 3 :
-1 -2 -3 -3 -2 -1
-1 -2 -3 -3 -2 -1
The doubly linked list is a palindrome */

package Palindrome;
import java.util.Scanner;
public class PalindromeUsingTwoPointerMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int l=0,r=a.length-1; //two pointer
        boolean res=true;
        while(l<r){
            if(a[l]!=a[r]){
                res=false;
                break;
            }
            l++;
            r--;
        }
        if(res)
         System.out.println("The doubly linked list is a palindrome");
        else
          System.out.println("The doubly linked list is not a palindrome");
          sc.close();
    }
}
