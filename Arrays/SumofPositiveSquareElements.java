
/* 149. Given an integer array of size N. 
Write Program to find sum of positive square elements in the array. 
 Sample input 1: 4 1 2 3 4 
 Sample output 1: 30 
 Explanation : (1 + 4 + 9 + 16) = 30 
 Sample input 2: 4 -1 -2 -3 -4 
 Sample output 2: 30 
 Explanation: (1 + 4 + 9 + 16) = 30 */

import java.util.*;
public class SumofPositiveSquareElements {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),sum=0;
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++){
           sum+=a[i]*a[i];
       }
       System.out.println(sum);
       sc.close();
    }
}
