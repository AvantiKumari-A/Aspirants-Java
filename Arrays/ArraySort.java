/* 150. Given an integer array of size N
Write a program to sort the array

 Sample input 1: 4 2 4 1 3 
 Sample output 1: 1 2 3 4 

 Sample input 2: 5 1 5 7 5 3 
 Sample output 2: 1 3 5 5 7 */

import java.util.*;
public class ArraySort {
      public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
       sc.close();
    }
}
